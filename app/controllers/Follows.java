package controllers;

import java.util.List;

import play.mvc.Controller;
import play.*;
import play.mvc.*;
import play.db.*;

import models.*;
import views.html.*;

public class Follows extends Controller {

	/**
	 * Helper.
	 * @param follower
	 * @param add
	 */
	public static Result follow(String follower, String add) {
		
		Profile user = Profile.find.byId(follower);
		Profile followed = Profile.find.byId(add);
		
		// If this happens, something is wrong.
		if (user == null || followed == null) {
			return Application.INDEX;
		}
		
		user.follows = Follow.find.where().eq("follower", user).findList();
		Follow follow = new Follow(user, followed);
		
		if (user.follows.contains(follow))
			return ok(views.html.profile.profile.render(user));
		
		user.follows.add(follow);
		user.update();
		follow.save();
		
		return ok(views.html.profile.profile.render(followed));
	}
	
	/**
	 * 
	 * @param user
	 * @param remove
	 * @return
	 */
	public static Result unFollow(String user, String remove) {
		Profile follower = Profile.find.byId(user);
		Profile followed = Profile.find.byId(remove);
		
		follower.follows = Follow.find.where().eq("follower", follower).findList();
		
		for (Follow e : follower.follows) {
			if(e.follower.username.equals(user) && e.followed.username.equals(remove))
				e.delete();
		}
		
		return ok(views.html.profile.profile.render(followed));
	}

	/**
	 * 
	 * @param user
	 * @param profile
	 * @return
	 */
	public static boolean contains(String user, Profile profile) {
		
		Profile p = Profile.find.byId(user);
		Follow temp = new Follow(p,profile);
		
		for(Follow follows : p.follows) {
			if(follows.equals(temp)) {
				Logger.info("True");
				return true;
			}
		}
		
		Logger.info("False");
		return false;
	}
}
