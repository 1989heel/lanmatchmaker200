package models;

import java.util.List;
import javax.persistence.*;

import play.Logger;
import play.db.ebean.Model;

@Entity
public class Follow extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	@ManyToOne
	public Profile follower;
	@ManyToOne
	public Profile followed;
	
	public Follow(Profile follower, Profile followed) {
		this.follower = follower;
		this.followed = followed;
	}
	
	public static Model.Finder<Long, Follow> find = new Model.Finder<Long, Follow>(Long.class, Follow.class);
	
	public boolean equals(Follow other) {
		if (this == other)
			return true;
		
		Follow f = (Follow)other;
			
		if (f.follower.username.equals(this.follower.username) && f.followed.username.equals(this.followed.username))
			return true;
		
		return false;
	}
	
	public boolean equals(Object other) {
		
		if (this == other)
			return true;
		
		if (other instanceof Follow) {
			Follow f = (Follow)other;
			
			if (f.follower.username.equals(this.follower.username) && f.followed.username.equals(this.followed.username))
				return true;
		}
		
		return false;
	}
}