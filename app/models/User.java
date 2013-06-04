package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

import controllers.*;

@Entity 
@Table(name="account")
public class User extends Model {

	@Id
    @Constraints.Required
    @Formats.NonEmpty
	public String username;
	
	@Constraints.Required
	@Constraints.Email
	public String email;
	
	@Constraints.Required
	public String password;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	public Profile userProfile;
	
	/* The account is dominant. */
	@ManyToMany(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	public List<Event> events = new ArrayList<Event>();
	
	public User(String username, String email, String password) {
		this.username = username;
		this.email 	  = email;
		this.password = password;
	}
	
    public static Model.Finder<String, User> find = new Model.Finder<String, User>(String.class, User.class);
    
    /**
     * Authenticates a user and returns it.
     * @param username
     * @param password
     * @return user
     */
    public static User authenticate(String username, String password) {
        return find.where().eq("username", username).eq("password", password).findUnique();
    }
    
    public static String userExists(String username) {
    	return find.where().eq("username", username).findUnique().toString();
    }
    
    /**
     * Hardcore one-liner.
     * @param username
     * @return
     */
    public static Boolean userExist(String username) {
    	return find.where().eq("username", username).findUnique() != null ? true : false;
    }
    
    public static Page<User> page(int page, int pageSize, String sortBy, String order, String filter) {
        return find.where().ilike("username", "%" + filter + "%").orderBy(sortBy + " " + order).findPagingList(pageSize).getPage(page);
    }
    
    // TODO: Look below, toString() already did this like a long time ago.
    public String getUserName(){
    	return username;
    }
    
    public String toString() { 
    	return username; 
    }
}