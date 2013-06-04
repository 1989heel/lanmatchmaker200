package controllers;

import static play.data.Form.form;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;

import play.*;
import play.data.Form;
import play.mvc.*;

import models.*;

import views.*;
import views.html.*;

public class Profiles extends Controller {

	/**
	 * Renders the specified user's profile.
	 * @param username is the username belonging to the profile to be rendered.
	 * @return the rendered website.
	 */
	public static Result profile(String username) {

		Profile profile = Profile.find.byId(username);

		// This will not happen, because the username will be taken from the session, which in turn is taken from the database on login.
		if (profile == null) {
			flash("error", "Profile" + username + " does not exist");
			return badRequest(temporaryHomePage.render());
		}

		return ok(views.html.profile.profile.render(profile));
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public static Result editProfile(String username) {
		Form<Profile> editProfileForm = form(Profile.class).fill(Profile.find.byId(username));
		
		if (username.equals(session().get("username")))
			return ok(views.html.profile.editProfile.render(editProfileForm));
		
		Logger.info("A user have tried to access another user's profile editing page ");
		flash("error", "You're only allowed to edit your own profile!");
		return redirect(routes.Profiles.profile(username));
	}

	/**
	 * 
	 * @return
	 */
	public static Result saveProfile() {
		Form<Profile> profileForm = form(Profile.class).bindFromRequest();
		
		if (profileForm.hasErrors()) {
			Logger.warn(profileForm.errors().toString());
			return badRequest(views.html.profile.editProfile.render(profileForm));
		} else {
			Profile data = profileForm.get();
			String s = session().get("username");
			Profile userProfile = Profile.find.byId(s);
			Game gamet;

			if(!data.games.equalsIgnoreCase("")) {
				gamet = Game.find.byId(data.games);
				if (!userProfile.game.contains(gamet))
					userProfile.game.add(gamet);
			}

			if (!profileForm.get().residence.isEmpty())
				userProfile.residence = data.residence;
			
			if (profileForm.get().age != null)
				userProfile.age = data.age;
			
			if (!data.sex.equals(""))
				userProfile.sex = data.sex;
			
			if (!profileForm.get().signature.isEmpty())
				userProfile.signature = data.signature;
			
			if (!profileForm.get().about.isEmpty())
				userProfile.about = data.about;
			
			userProfile.update();
			flash("Successfully updated the profile");
			return ok(views.html.profile.profile.render(userProfile));
		}
	}
}
