package controllers;

import java.util.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.annotation.Transactional;

import play.*;
import play.data.Form;
import play.mvc.*;

import models.*;

import views.*;
import views.html.*;

import misc.HashBag;

public class Queue extends Controller {

	@Transactional
	public static Result queue(String user) {
		Profile profile = Profile.find.byId(user);
		User userz = User.find.byId(user);
		
		if(profile.queue == false) {
			profile.setQueue(true);
			profile.update();
			
			List<Profile> all = Profile.find.where().eq("queue", true).findList();
			HashBag potential = new HashBag();
			
			ArrayList<ArrayList<Profile>> listy = null;
			
			if(all != null) {
				potential.add(profile);
				for (Profile p : all) {
					if (p.queue)
						potential.add(p);
				}
				
				listy = potential.get();
				
				if (listy != null) {
					for (ArrayList<Profile> p : listy) {
						if (p != null) {
							Event event = new Event();
							
							event.host = Events.idGenerator();
							event.owner = p.get(0).username;
							event.location = p.get(0).residence;
							event.name = event.owner + "Hack";
							event.description = "";
							event.fee = "0";
							event.info = "Den här gruppen har skapats genom matchmakern. Du kan redigera eventet som du vill.";
							event.start = new Date();
							event.end = new Date();
							event.picture = "";
							event.chat = Chat.createChat(event);

							List<User> usr = Users.convert(p);
							event.participants.addAll(usr);
//							event.participants.add(userz);
							event.save();
							
//							userz.events.add(event);
							
							for (User u : usr)
								u.events.add(event);

//							Logger.info(Chat.addUsernameToChat(userz.username, ChatRoom.getChatRoom(event.host)));
							
							for (Profile proz : p) {
								Logger.info(Chat.addUsernameToChat(proz.username, ChatRoom.getChatRoom(event.host)));
								Logger.info("" + proz.queue);
								profile = Profile.find.byId(proz.username);
								profile.setQueue(false);
								Ebean.update(profile);
							}	
							
							event.update();
						}
						clean(potential, p);
					}
				}
				
				all.clear();
			} else
				Logger.info("The list was null");
		}
		flash("success", "Du håller på att matchmakeas");
		return Application.INDEX;
	}
	
	public static Result deQueue(String user){
	Profile profile = Profile.find.byId(user);
	profile.setQueue(false);
	profile.update();
	Logger.info("deQueued");
	flash("success", "Du har avbrutit matchmaking");
	return Application.INDEX;
	
	}
 	
	public static void clean(HashBag hb, List<Profile> p) {
		hb.purge();
	}
}
