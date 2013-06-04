package models;

import java.util.List;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.Model;

@Deprecated
@Entity
public class FriendRequest extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	@ManyToOne
	public Profile sender;
	@ManyToOne
	public Profile receiver;
	
	public FriendRequest(Profile sender, Profile receiver) {
		this.sender = sender;
		this.receiver = receiver;
		Logger.info(sender.username + " sent a friendrequest to " + receiver.username);
	}
	
	public static Model.Finder<Long, FriendRequest> find = new Model.Finder<Long, FriendRequest>(Long.class, FriendRequest.class);
}
