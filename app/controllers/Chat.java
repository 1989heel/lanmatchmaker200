package controllers;


import play.mvc.*;
import org.codehaus.jackson.*;
import models.*;
import scala.concurrent.Await;
import scala.concurrent.duration.Duration;
import views.html.chat.*;

import static akka.pattern.Patterns.ask;
import static java.util.concurrent.TimeUnit.SECONDS;
import akka.actor.ActorRef;
import play.Logger;

public class Chat extends Controller {

	public static Result error() {
		return ok(chatError.render());
	}

	public static Result chatRoom(Long eventid) {
		String loggedInAs = session().get("username");
		User user = User.find.where().eq("username", loggedInAs).findUnique();

		if(user == null || loggedInAs == null || loggedInAs.equals("")) {
			flash("error", "No user");
			return redirect(routes.Chat.error());
		} else if(eventid == null || !ChatRoom.chatExists(eventid)) {
			flash("error", "No chat available");
			return redirect(routes.Chat.error());
		}
		return ok(chatRoom.render(loggedInAs, eventid));
	}

	public static WebSocket<JsonNode> chat(final String username, final Long eventid) {
		return new WebSocket<JsonNode>() {

			public void onReady(WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out) {
				try {
					ChatRoom.join(username, in, out, eventid);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		};
	}

	public static ActorRef createChat(Event event) {
		if(!ChatRoom.chatExists(event.host)) {
			Logger.info(event.host + ": Chatroom has been created");
			return ChatRoom.createNewChatRoom(event.host);
		} else {
			Logger.info(event.host + ": Chatroom could not be created - This event already has a chatroom");
			return null;
		}
	}

	public static ActorRef createChat(Matchmaker matchmaker) {
		if(!ChatRoom.chatExists(-matchmaker.id)) {
			Logger.info(-matchmaker.id + ": Chatroom has been created");
			return ChatRoom.createNewChatRoom(-matchmaker.id);
		} else {
			Logger.info(-matchmaker.id + ": Chatroom could not be created - This matchmaker already has a chatroom");
			return ChatRoom.getChatRoom(-matchmaker.id);
		}
	}

	public static String addUsernameToChat(String username, akka.actor.ActorRef chatroom) {
		ChatRoom.ModifyUser m = new ChatRoom.ModifyUser(username, ChatRoom.ModifyUser.Type.ADD );
		String loggermsg;
		try {
			String result = (String)Await.result(ask(chatroom, m, 1000), Duration.create(1, SECONDS));
			if(result != "OK")
				throw new Exception(result);
			else loggermsg = (username + "has been added to the chatoom");
		} catch(Exception e) {
			loggermsg = (username + " could not be added to the chatroom: \n"+ e.getMessage());
		}
		return loggermsg;
	}

	public static String removeUsernameToChat(String username, akka.actor.ActorRef chatroom) {
		ChatRoom.ModifyUser m = new ChatRoom.ModifyUser(username, ChatRoom.ModifyUser.Type.DELETE );
		String loggermsg;
		try {
			String result = (String)Await.result(ask(chatroom, m, 1000), Duration.create(1, SECONDS));
			if(result != "OK")
				throw new Exception(result);
			else loggermsg = (username + "is no longer allowed to access the chatroom");
		} catch(Exception e) {
			loggermsg = (username + " is still allowed to access the chatroom: \n"+ e.getMessage());
		}
		return loggermsg;
	}
}
