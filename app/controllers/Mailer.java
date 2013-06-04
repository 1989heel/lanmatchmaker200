package controllers;

import java.util.List;

import com.typesafe.plugin.MailerAPI;
import com.typesafe.plugin.MailerPlugin;

import play.mvc.Controller;

import views.html.*;
import models.*;

public class Mailer extends Controller {
	
    public MailerAPI mail;
	
    /* We are the sender. */
	public static final String SENDER = "Lanmatchmaker <lanmatchmaker@gmail.com>";
	
	/* Mail headers. */
	public static final String SUCCESS_USER 		= "User registration successful!";
	public static final String SUCCESS_EVENT 		= "Event registration successful!";
	public static final String FAILURE_USER 		= "User registration failed.";
	public static final String CANCELLED_USER 		= "User account cancelled.";
	public static final String CANCELLED_EVENT		= "The event had been cancelled.";
	public static final String ASSEMBLED 			= "Event group has assembled.";
	public static final String EDIT					= "The event has been edited.";
	public static final String EDIT_USER			= "Profile edited!";
	public static final String ACCEPT				= "You have been accepted to an event.";
	public static final String REJECT				= "You have been rejected from an event.";
	public static final String JOIN					= "You have joined the queue for matchmaking.";
	
	/* Mail message contents. */
	public static final String USER_REGISTRATION			= "Your account has been registrered.";
	public static final String EVENT_REGISTRATION 			= "Standard notification message.";
	public static final String NOTIFY_USER 					= "You have entered an event!";
	public static final String NOTIFY_EVENT_PARTICIPANTS 	= "Event is now fully assembled.";
	public static final String NOTIFY_ALL 					= "Message from us to EVERYONE!!!";
	public static final String NOTIFY_EDIT_USER				= "Your profile has been edited!";
	public static final String NOTIFY_EDIT_EVENT			= "The event has been edited.";
	public static final String NOTIFY_ASSEMBLED				= "All the event's slots have been filled. The event is fully assembled!";
	public static final String NOTIFY_CANCELLED_EVENT		= "The event has been cancelled by its owner.";
	public static final String NOTIFY_USER_ACCEPTED			= "Er meh gerd, u haf been accupted to teh event d00d!11one";
	public static final String NOTIFY_REJECT				= "You have been rejected from an event! :<";
	public static final String NOTIFY_JOIN					= "You have joined a queue for matchmaking. This can take a while depending on how many there are in the queue.";
	
	public Mailer() {
		mail = play.Play.application().plugin(MailerPlugin.class).email();
		mail.addFrom(SENDER);
	}
	
	/**
	 * Matchmaking mails
	 */
	public void matchmakingJoin(User user) {
		mail.setSubject(JOIN);
		mail.addRecipient(user.email);
		mail.send(NOTIFY_JOIN);
	}
	
	/**
	 * Event mails
	 */
	public void addReceivers(Event event) {
		for (User user : event.participants)
			mail.addRecipient(user.email);
	}
	
	public void eventRegistration(Event event) {
		mail.setSubject(SUCCESS_EVENT);
		addReceivers(event);
		mail.send(EVENT_REGISTRATION);
	}
	
	public void editEvent(String email) {
		mail.setSubject(EDIT);
		mail.addRecipient(email);
		mail.send(NOTIFY_EDIT_EVENT);
	}
	
	public void eventAssembled(Event event) {
		mail.setSubject(ASSEMBLED);
		addReceivers(event);
		mail.send(NOTIFY_ASSEMBLED);
	}
	
	public void eventCancelled(Event event) {
		mail.setSubject(CANCELLED_EVENT);
		addReceivers(event);
		mail.send(NOTIFY_CANCELLED_EVENT);
	}
	
	/**
	 * User mails
	 */
	public void userRegistration(User user) {
		mail.setSubject(SUCCESS_USER);
		mail.addRecipient(user.email);
		mail.send(USER_REGISTRATION);
	}
	
	public void userRegistration(String email) {
		mail.setSubject(SUCCESS_USER);
		mail.addRecipient(email);
		mail.send(USER_REGISTRATION);
	}
	
	public void userAccepted(User user) {
		mail.setSubject(ACCEPT);
		mail.addRecipient(user.email);
		mail.send(NOTIFY_USER_ACCEPTED);
	}
	
	public void userRejected(User user) {
		mail.setSubject(REJECT);
		mail.addRecipient(user.email);
		mail.send(NOTIFY_REJECT);
	}
	
	public void editProfile(User user) {
		mail.setSubject(EDIT_USER);
		mail.addRecipient(user.email);
		mail.send(NOTIFY_EDIT_USER);
	}
	
	/**
	 * Generic messages
	 */
	public void globalMessage(String subject, String message) {
		mail.setSubject(subject);
		
		List<User> users = User.find.all();
		
		for (User u : users)
			mail.addRecipient(u.email);
		
		mail.send(message);
	}	
}