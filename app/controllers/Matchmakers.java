package controllers;

import java.util.*;
import akka.actor.*;
import javax.persistence.Entity;

import play.*;
import play.mvc.*;

import models.*;

import views.*;
import views.html.*;

public class Matchmakers extends Controller {
	
	public static Result item(Long id) {
		Matchmaker matchmaker = Matchmaker.find.byId(id);
		Set<Profile> notAddedUsers = new HashSet<Profile>();
		if(matchmaker != null)
			return ok(views.html.matchmaker.item.render(matchmaker, notAddedUsers));
		else
			return redirect(routes.Application.index());
	}

	public static Result list() {
		List<Matchmaker> matchmakers = Matchmaker.find.all();
						
		if (matchmakers.isEmpty()) {
			Matchmaker matchmaker = new Matchmaker(Profile.TYPES.ALL, "");
			matchmaker.save();
			
			matchmakers = Matchmaker.find.all();
		}
		
		Set<Profile> notAdded = Matchmaker.notAddedUsers(matchmakers);
		return ok(views.html.matchmaker.list.render(matchmakers, notAdded));
	}
	
	public static Result addUser(Long matchId, String userId) {
		Matchmaker match = Matchmaker.find.byId(matchId);
		Profile user = Profile.find.byId(userId);
		addUser(match, user);
		System.out.println(match);
		System.out.println(user);
		return redirect(routes.Matchmakers.list());
	}
	
	public static void addUser(Matchmaker matchmaker, Profile user) {
		matchmaker.users.add(user);
		matchmaker.update();
		user.matchmaker = matchmaker;
		user.update();
	}

	public static Result matchmake(Long id) {
		Matchmaker matchmaker = Matchmaker.find.byId(id);
		matchmaker.matchmake();
		
		return redirect(routes.Matchmakers.list());
	}

	public static Result clear() {
		List<Profile> profiles = Profile.find.all();
		for (Profile profile : profiles) {
			profile.matchmaker = null;
			profile.update();
		}
		
		List<Matchmaker> matchmakers = Matchmaker.find.all();
		for (Matchmaker mm : matchmakers)
			mm.delete();
		
		return redirect(routes.Matchmakers.list());
	}
	
	public static Result matchmakeyo() {
		Profile user = Profile.find.byId(session().get("username"));
		if (user == null)
			return redirect(routes.Application.index());
		
		if (user.matchmaker != null) {
			user.matchmaker.users.remove(user);
			user.matchmaker.update();
			user.matchmaker = null;
			user.update();
		}
		
		Matchmaker matchmaker = Matchmaker.find.where().eq("type", Profile.TYPES.ALL.toString()).findUnique();
		if (matchmaker == null) {
			matchmaker = new Matchmaker(Profile.TYPES.ALL, "");
			matchmaker.save();
		}
		
		addUser(matchmaker, user);
		
		while (user.matchmaker.matchmake()) {}
		
		return redirect(routes.Matchmakers.chat(user.matchmaker.id));
	}
	
	public static Result chat(Long id) {
		Matchmaker matchmaker = Matchmaker.find.byId(id);
		if (matchmaker == null)
			return redirect(routes.Matchmakers.list());

		ActorRef chat = Chat.createChat(matchmaker);
		for (Profile profile : matchmaker.users) {
			Chat.addUsernameToChat(profile.username, chat);
		}
		
		return ok(views.html.matchmaker.matchmakerWithChat.render(matchmaker));
	}
	
}
