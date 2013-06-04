package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.db.*;

import play.data.format.*;
import play.data.validation.*;

import akka.actor.ActorRef;

import com.avaje.ebean.*;

import controllers.*;

/* We want to store this entity in the database. */
@Entity
@Table(name="event")
public class Event extends Model {
	
	 // One host to rule them all.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long host;
 
	public String owner;
	public String location;
	@Constraints.Required
	public String name;
	public String description;
	public String fee;
	public String streamUsername;
	public String picture;
	
    /* The pattern follows ISO 8601 time stamp standard. */
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date start;
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date end;
    
	public String info;
	
    transient public ActorRef chat;
    
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy="events")
    public List<User> participants = new ArrayList<User>();
    
    public static Finder<Long, Event> find = new Finder<Long, Event>(Long.class, Event.class);
    
    public Event() {}
    
    public Event(String eventName, String eventDescription, String eventLocation, String eventEntryFee) {
    	this.name 		 = eventName;
    	this.description = eventDescription;
    	this.location 	 = eventLocation;
    	this.fee 		 = eventEntryFee;
    }
	
	public boolean participantsContains(String username) {
        User user = User.find.where().eq("username", username).findUnique();
        return (!participants.contains(user) || user == null) ? false : true;
    }
    
    /* The world's longest method call chain. */
    public static Page<Event> page(int page, int pageSize, String sortBy, String order, String filter) {
    	return find.where().ilike("host", "%" + filter + "%").orderBy(sortBy + " " + order).fetch("participants").setAutofetch(true).findPagingList(pageSize).getPage(page);
    }
    
    public static Page<Event> userPage(int page, int pageSize, String sortBy, String order, String filter) {
    	return find.where().ilike("username", "%" + filter + "%").orderBy(sortBy + " " + order).fetch("events").setAutofetch(true).findPagingList(pageSize).getPage(page);
    }
    
    public static Page<Event> viewEvent(String filter) {
    	return find.where().idEq(filter).findPagingList(1).getPage(0);
    }
    
    public static Page<Event> pageByName(int page, int pageSize, String sortBy, String order, String filter) {
        return find.where().ilike("name", "%" + filter + "%").orderBy(sortBy + " " + order).findPagingList(pageSize).getPage(page);
    }
    
}