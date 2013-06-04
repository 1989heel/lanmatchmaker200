package models;

import java.util.*;

import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.metamodel.*;
import javax.persistence.spi.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import controllers.*;

@Entity
@Table(name="user_profile")
@DiscriminatorValue("user_profile")
public class Profile extends Model {
	
	public enum TYPES {
		ALL {
			public String toString() {
				return "ALL";
			}
		},
		RESIDENCE {
			public String toString() {
				return "Residence";
			}
		},
		GAMES {
			public String toString() {
				return "GAMES";
			}
		},
		AGE {
			public String toString() {
				return "AGE";
			}
		}
	}
	
	@Id
	public String username;
	public String residence = "";
	public String equipment = "";
	public String picture = "";
	public String sex = "";
	public String games = "";
	public Integer age = 0;
	public String signature = "";
	public String about = "";
	public String matchmakeGame = "";
	public Boolean queue = false;
	public Integer size = 5;
	
	/**
	 * Account that owns the profile.
	 */
	@OneToOne(mappedBy="userProfile", fetch=FetchType.EAGER)
	public User user;
	/**
	 * Games
	 */
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Game> game;
	
	/**
	 * Follows
	 */
	@OneToMany(cascade=CascadeType.ALL, mappedBy="follower")
	public List<Follow> follows;
	
	/**
	 * Friendship
	 */
	@OneToMany(cascade=CascadeType.ALL, mappedBy="friend")
	public List<FriendShip> friends;

    // TODO: Move to the profile class, or a middle class? The matchmaker doesn't need to know this.
	@ManyToOne
	public Matchmaker matchmaker;
	
	/**
	 * Friendrequests
	 */
	@OneToMany(cascade=CascadeType.ALL, mappedBy="receiver")
    public List<FriendRequest> requests;
	
	public static Model.Finder<String, Profile> find = new Model.Finder<String, Profile>(String.class, Profile.class);

	public String getValue(String type) {
		if (type.equals(TYPES.RESIDENCE.toString()))
			return residence;
		else if (type.equals(TYPES.GAMES.toString()))
			return matchmakeGame;
		else if (type.equals(TYPES.AGE.toString()) && age != null)
			return age.toString();
		
		return null;
	}
    
	public boolean canMatchmake() {
		if (residence != "" && matchmakeGame != "")
			return true;
		
		return false;
	}
	
//	public Profile() {
//		this.queue = false;
//	}
	
	public Profile (String username) {
		this.username = username;
		this.queue = false;
	}
	
	public boolean getQueue(){
	return queue;
	
	}
	
	public Profile(String username, String residence, String equipment, String picture, String sex, Integer age) {
		this.username 	= username;
		this.residence 	= residence;
		this.equipment 	= equipment;
		this.picture	= picture;
		this.sex		= sex;
		this.age		= age;
		this.queue		= false;
	}
	
	public void setQueue(boolean bool) {
		this.queue = bool;
	}
	
	public boolean equals(Object other) {
		if(this == other)
			return true;
		
		if(other instanceof Profile) {
			Profile p = (Profile)other;
			
			if (this.username.equals(p.username))
				return true;
		}
		
		return false;
	}
}