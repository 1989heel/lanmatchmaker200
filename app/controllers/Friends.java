package controllers;

import play.mvc.Controller;
import play.*;
import play.db.*;

import models.*;
import views.html.*;

@Deprecated
public class Friends extends Controller {

	@Deprecated
	public static void accept(FriendRequest request) {
		
		Logger.info(request.sender.username + " " + request.receiver.username);
		
		FriendShip s1 = new FriendShip(request.sender, request.receiver);
		FriendShip s2 = new FriendShip(request.receiver, request.sender);
		
		s1.save();
		s2.save();
	}
	
	@Deprecated
	public static void decline(FriendRequest request) {
		Profile sender = request.sender;
		Profile receiver = request.receiver;
		FriendRequest fr = FriendRequest.find.where().eq("sender", receiver).eq("receiver", sender).findUnique();
		
		if (fr != null) {
			fr.delete();
		}
		
		request.delete();
	}
	
	@Deprecated
	public static void remove(FriendShip friend) {
		// This will only delete one side of the friendship.
		friend.delete();
	}
	
}
