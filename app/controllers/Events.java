package controllers;

import static play.data.Form.form;

import java.util.Random;

import com.avaje.ebean.Page;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.*;
import views.html.*;

import models.*;

public class Events extends Controller {

	public static final Result REGISTER_EVENT = redirect(routes.Events.registerEvent());
	public static final Result RESET = redirect(routes.Events.list(0, "name", "asc"));
	
	public static Long idGenerator() {
		Random rand = new Random();
		Long temp = rand.nextLong();
		Event event = Event.find.byId(temp);

		while (event != null) {
			temp = rand.nextLong();
			event = Event.find.byId(temp);
		}
		
		return temp;
	}

	public static Result registerEvent() {
		if (session().isEmpty())
			return Application.INDEX;

		return ok(views.html.event.registerEvent.render(form(Event.class)));
	}
	
	public static void queueEvent(Form<Event> event) {
		
	}

	/**
	 * Used for both registration and editing of events.
	 * @return
	 */
	public static Result validateEventRegistration() {
		Form<Event> eventRegistrationForm = form(Event.class).bindFromRequest();

		if (eventRegistrationForm.hasErrors() || eventRegistrationForm.hasGlobalErrors())
			return badRequest(views.html.event.registerEvent.render(eventRegistrationForm));

		// Ugly hax to make the automatic ID generation work.
		Random rand = new Random();
		Long temp = rand.nextLong();
		Event event = Event.find.byId(temp);

		while (event != null) {
			temp = rand.nextLong();
			event = Event.find.byId(temp);
		}

		eventRegistrationForm.get().host = temp;
        eventRegistrationForm.get().chat = Chat.createChat(eventRegistrationForm.get());
		eventRegistrationForm.get().owner = session().get("username"); 
		eventRegistrationForm.get().participants.add(User.find.where().eq("username", session().get("username")).findUnique());
		
		Logger.info(Chat.addUsernameToChat(session().get("username"), ChatRoom.getChatRoom(temp)));

		if (Event.find.byId(eventRegistrationForm.get().host) == null)
			eventRegistrationForm.get().save();
		else
			eventRegistrationForm.get().update();

		Logger.info("Event registration successful");

        return ok(views.html.event.viewEvent.render(eventRegistrationForm.get()));
	}

	public static Result editEvent(Long id) {
		Form<Event> editEventForm = form(Event.class).fill(Event.find.byId(id));

		if (editEventForm.hasErrors())
			return badRequest("That event doesn't exist!");

		return ok(views.html.event.editEvent.render(id, editEventForm));
	}

	public static Result updateEvent(Long id) {
		Form<Event> eventForm = form(Event.class).bindFromRequest();

		if (eventForm.hasErrors())
			return badRequest(views.html.event.editEvent.render(id, eventForm));


        Event e = Event.find.where().eq("host", id).findUnique();
        if(eventForm.get().owner != null)
            e.owner = eventForm.get().owner;
        if(eventForm.get().location != null)
            e.location = eventForm.get().location;
        if(eventForm.get().name != null)
            e.name = eventForm.get().name;
        if(eventForm.get().description != null)
            e.description = eventForm.get().description;
        if(eventForm.get().fee != null)
            e.fee = eventForm.get().fee;
        if(eventForm.get().streamUsername != null)
            e.streamUsername = eventForm.get().streamUsername;
        if(eventForm.get().start != null)
            e.start = eventForm.get().start;
        if(eventForm.get().end != null)
            e.end = eventForm.get().end;
        if(eventForm.get().info != null)
            e.info = eventForm.get().info;

		e.update();
		flash("success", "Event " + eventForm.get().name + " has been updated");

        return ok(views.html.event.viewEvent.render(e));
	}

	public static Result list(int page, String sortBy, String order) {
		return ok(views.html.event.list.render(
				Event.pageByName(page, 20, sortBy, order, ""),
				sortBy, order));
	}

	public static Result listAll(int page, String sortBy, String order, String filter) {
		return ok(views.html.event.list.render(
				Event.page(page, 20, sortBy, order, filter), sortBy, order));
	}

	public static Result showUsersEvents(String username) {
		java.util.List<Event> eventList = Event.find.all();
		System.out.println(eventList.size());
		java.util.List<Event> usersEvents = new java.util.ArrayList<Event>();
		User user = User.find.where().eq("username", username).findUnique();
		// Not very effective...
		for (Event e : eventList) {
			if (e.participants.contains(user))
				usersEvents.add(e);
		}
		
		return ok(views.html.event.listUsersEvents.render(usersEvents));
	}

	@Deprecated
	public static class UserEventPair {
		public String username;
		public String eventhost;
	}

	@Deprecated
	public static Result addUserToEvent() {
		Form<UserEventPair> f = form(UserEventPair.class).bindFromRequest();

		if (f.hasErrors()) {
			return badRequest(views.html.temporaryHomePage.render());
		} else {
			UserEventPair x = f.get();
			Event event = Event.find.where().eq("host", x.eventhost).findUnique();
			User user = User.find.where().eq("username", x.username).findUnique();
			
			if (event != null && user != null) {
				if (!event.participants.contains(user)) {
					event.participants.add(user);
					event.update();
					Logger.info(x.username + " has been added to the event "
							+ x.eventhost);
					flash("success", "Joined the event!");
				} else {
					Logger.info(x.username
							+ " could not be added to the event " + x.eventhost
							+ ": User is already a participant");
					flash("error", "Already in the event!");
				}
			} else {
				Logger.info(x.username + " could not be added to the event "
						+ x.eventhost + ": ");
				if (user == null)
					Logger.info(x.username + "not found");
			
				if (event == null)
					Logger.info(x.eventhost + "not found");
			
				flash("error", "Could not join the event!");
			}
			
			return ok(views.html.temporaryHomePage.render());
		}
	}

	@Deprecated
	public static Result showSimpleAddUserToEvent() {
		return ok(views.html.event.simpleAddUserToEvent.render(form(UserEventPair.class)));
	}

	public static Result showEvent(Long eventhost) {
		return ok(views.html.event.viewEvent.render(Event.find.where().eq("host", eventhost).findUnique()));
	}

	/**
	 * Adds a user to the event specified by the id.
	 * @param id
	 * @return
	 */
	public static Result joinEvent(Long id) {
		// The event ID is sent from the view. I extract the username from the session.
		String username = session().get("username");
		Event event = Event.find.byId(id);
		User user = User.find.byId(username);

		// The user is already subscribed to this event
		if (event.participants.contains(user)) {
			// Do nothing
			Logger.info(username + " tried to join an event while already being in it.");
			// Redirect to the index page. Add a better page here.
			return Application.INDEX;
		} else {
			// Event is not part of the user event list, add to user event list.
			user.events.add(event);
			// User is not part of the list, add to event list.
			event.participants.add(user);
			//Authorizes the user to join the event's chat
			Logger.info(Chat.addUsernameToChat(username, ChatRoom.getChatRoom(id)));
			
			if(event.owner.equals("[No Owner]"))
				event.owner = username;
			
			// Event updated with the added user. Hopefully this saves the event to the user aswell.
			event.update();

			Logger.info(username + " added to the event " + event.name);
			// Redirect to the index page. Add a better page here.
			return redirect(routes.Events.viewEvent(event.host));
		}
	}
	
	public static Result joinEvent(Long id, String username) {
		// The event ID is sent from the view. I extract the username from the session.
		Event event = Event.find.byId(id);
		User user = User.find.byId(username);

		// The user is already subscribed to this event
		if (event.participants.contains(user)) {
			// Do nothing
			Logger.info(username + " tried to join an event while already being in it.");
			// Redirect to the index page. Add a better page here.
			return Application.INDEX;
		} else {
			// Event is not part of the user event list, add to user event list.
			user.events.add(event);
			// User is not part of the list, add to event list.
			event.participants.add(user);
			//Authorizes the user to join the event's chat
			Logger.info(Chat.addUsernameToChat(username, ChatRoom.getChatRoom(id)));
			
			if(event.owner.equals("[No Owner]"))
				event.owner = username;
			
			// Event updated with the added user. Hopefully this saves the event to the user aswell.
			event.update();

			Logger.info(username + " added to the event " + event.name);
			// Redirect to the index page. Add a better page here.
			return redirect(routes.Events.viewEvent(event.host));
		}
	}

	public static Result imageUpload(Long id) {
		return ok(views.html.image.imageUploadEvent.render(id));
	}

	public static Result viewEvent(Long id) {
		return ok(views.html.event.viewEvent.render(Event.find.byId(id)));
	}

	public static Result exitEvent(Long id) {
		// The event ID is sent from the view. I extract the username from the session.
		String username = session().get("username");
		Event event = Event.find.byId(id);
		User user = User.find.byId(username);

		if(event.participants.contains(user)) {
			//removes event from user
			user.events.remove(event);
			//removes user from event
			event.participants.remove(user);
			
			//Should be improved
			if(event.owner.equals(username)) {
				if(!event.participants.isEmpty())
					event.owner = event.participants.get(0).username; 
			} else 
				event.owner = "[No Owner]"; 
			
			//The user will no longer have access to the event's chat
			Chat.removeUsernameToChat(username, ChatRoom.getChatRoom(id));

			event.update();

			Logger.info(username + " removed from the event " + event.name);
			// Redirect to the index page. Add a better page here.
			return redirect(routes.Events.viewEvent(event.host));
		} else {
			Logger.info(username + " tried to exit an event while not being in it.");
			// Redirect to the index page. Add a better page here.
			return Application.INDEX;
		}
	}
}