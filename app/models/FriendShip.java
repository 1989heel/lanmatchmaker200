package models;

import java.util.List;
import javax.persistence.*;

import play.Logger;
import play.db.ebean.Model;

@Deprecated
@Entity
public class FriendShip extends Model {
	
	// This is an ugly solution, ableit necessary.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	@ManyToOne
	public Profile user;
	@ManyToOne
	public Profile friend;
	
	public FriendShip(Profile user, Profile friend) {
		this.user = user;
		this.friend = friend;
		
		Logger.info("Friendship between " + user.username + " and " + friend.username + " created!");
	}
	
	//Ignored for now 
	transient public String description;
	
	public static Model.Finder<Long, FriendShip> find = new Model.Finder<Long, FriendShip>(Long.class, FriendShip.class);
}