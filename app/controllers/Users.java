package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
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
import views.html.user.login;
import views.html.user.register;

public class Users extends Controller {
	
	// I added these because it makes it easier to edit large pieces of code. Let's hope java's compiler optimize this.
	public static final Result LOGIN 			= redirect(routes.Users.login());
	public static final Result LOGOUT 			= redirect(routes.Users.logout());
	public static final Result REGISTER_USER 	= redirect(routes.Users.register());

	/**
	 * @return Result to be sent to the view
	 */
	public static Result login() {
		return Application.INDEX;
	}

	public static Result logout() {
		// If the user is online, log off.
		if (!session().isEmpty()) {
			session().clear();
			Logger.info("User logged off successfully!");

			return Application.INDEX;
		}

		Logger.info("You are not logged on, stranger. One does not simply log off while not logged on in the first place.");

		return LOGIN;
	}

	/* Method for creating an account on the website. */
	public static Result register() {
		if (session().isEmpty()) {
			Logger.info("If statement in register has been accessed");

			return ok(views.html.user.register.render(form(User.class)));
		}

		return Application.INDEX;
	}

	/* Validation method to spread the code and avoid the nasty recursion. */
	public static Result validateRegistration() {
		Form<User> registrationForm = form(User.class).bindFromRequest();

		if (registrationForm.hasErrors()) {
			Logger.warn("Registration error:" + registrationForm.errors().toString());

			flash("error", "Alla fält måste fyllas i");
				return badRequest(index.render(
					login.render(form(Users.Login.class)),
					register.render(registrationForm)));
		} else {
		
			if(User.find.where().eq("username", registrationForm.get().username).findUnique() != null){
				flash("error", "Användarnamnet är upptaget");
				return ok(index.render(
						login.render(form(Users.Login.class)),
						register.render(registrationForm)));
			}
			
			Logger.info("Registration parsed, saving data to the database. " + registrationForm.get().email);

			User data = registrationForm.get();
			Profile profile = new Profile(data.username);
			
			data.userProfile = profile;
			profile.about = "";
			profile.equipment = "";
			profile.games = "";
			profile.residence = "";
			profile.sex = "";
			profile.age = 0;
			profile.picture = "Koala.jpg";
			profile.matchmakeGame = "";
			profile.signature = "";
			
			data.save();
			profile.save();
			
			
			// TODO: This works, but I deactivated it for now as it makes us spam emails. 
//			Mailer m = new Mailer();
//			m.userRegistration(registrationForm.get().email);
			flash("successRegister", "Ditt konto har skapats");
			return Application.INDEX;
		}
	}

	// TODO: Bug, old sessions that don't exist in the database are accepted as logged in. Verify with database for security. Low priority.
	
	/* Authentication for logging in. */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();

		if (loginForm.hasErrors()) {
			Logger.warn("Warning, the login had errors!");

			return badRequest(index.render(
				login.render(loginForm),
				register.render(form(User.class))));	
		} else {
			Logger.info("User successfully authenticated!");

			session("username", loginForm.get().username);
			return Application.INDEX;
		}
	}

	public static Result list() {
		Set<User> users = new HashSet<User>(User.find.all());
		return ok(views.html.user.list.render(users));
	}

	public static class Login {

		public String username, password;

		public String validate() {
			if (User.authenticate(username, password) == null)
				return "Felaktigt användarnamn eller lösenord";

			return null;
		}
	}
	
	public static Result sendFriendRequest(String sender, String receiver) {
		
        Profile sen = Profile.find.byId(sender);
        Profile rec = Profile.find.byId(receiver);
        
        if(sen == null || rec == null ) {
            flash("error", "Friend Request could not be sent");
            return badRequest(views.html.temporaryHomePage.render());
        }
        
        // Does the receiver already have this user in the friend list, or sent a request?
        if(sen.friends.contains(rec) || sen.requests.contains(rec) || rec.friends.contains(sen) || rec.requests.contains(sen)) {
        	// Yes. Do nothing
        	return Application.INDEX;
        }
        
        if(FriendRequest.find.where().eq("sender", sen).eq("receiver", rec).findUnique() == null) {
        	FriendRequest request = new FriendRequest(sen,rec);
            rec.requests.add(request);
            sen.requests.add(request);
            
            rec.update();
            sen.update();
        }

        //Send Mail to both of these doods
        flash("success", "You've sent a friend request to"+ receiver);

         //userprofiles null.... :(
        return ok(views.html.profile.profile.render(rec));
    }

	
	public static List<User> convert(List<Profile> profiles) {
		Logger.info("Convert called.");
		List<User> temp = new ArrayList<User>();
		User usr = null;
		
		for (Profile p : profiles) {
			usr = User.find.byId(p.username);
			temp.add(usr);
		}
		
		return temp;
	}
}