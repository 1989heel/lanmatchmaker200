package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.Model;
import controllers.*;

@Entity
public class Matchmaker extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id; 
	
	public String type;
	public String value;
	
	@ManyToOne
	public Matchmaker parent;
	
	@ManyToMany(cascade = CascadeType.ALL)
	public Set<Profile> users = new HashSet<Profile>();
	
	public Matchmaker (Set<Profile> users, Profile.TYPES type, String value) {
		this.users = users;
		this.type = type.toString();
		this.value = value;
	}
	
	public Matchmaker (Profile user, Profile.TYPES type, String value) {
		this.users.add(user);
		user.matchmaker = this;
		user.update();
		this.type = type.toString();
		this.value = value;
	}
	
	public Matchmaker (Profile.TYPES type, String value) {
		this.users = new HashSet<Profile>();
		this.type = type.toString();
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public boolean matchmake() {
		boolean notLast = true;
		if (type.equals(Profile.TYPES.ALL.toString())) {
			matchmake(Profile.TYPES.RESIDENCE);
		} else if (type.equals(Profile.TYPES.RESIDENCE.toString())) {
			matchmake(Profile.TYPES.GAMES);
			notLast = false;
		}/* else if (type.equals(Profile.TYPES.GAMES.toString())) {
			matchmake(Profile.TYPES.AGE);
		}*/
		this.update();
		return notLast;
	}
	
	private void matchmake(Profile.TYPES type) {
		Matchmaker matchedMatchMaker = null;
		
		for (Profile user : users) {
						
			for (Matchmaker mm : Matchmaker.find.all()) {
				if (mm.type.equals(type.toString()) && mm.value.equals(user.getValue(type.toString()))) {
					matchedMatchMaker = mm;
					break;
				}
			}

			if (matchedMatchMaker != null) {
				System.out.println("matchmaker " + matchedMatchMaker.type);
				
				matchedMatchMaker.users.add(user);
				matchedMatchMaker.update();
				user.matchmaker = matchedMatchMaker;
				user.update();
				System.out.println("user " + user.matchmaker.type);
			} else {
				Matchmaker matchmaker = new Matchmaker(user, type, user.getValue(type.toString()));
				matchmaker.save();
			}
		}
		
		users.clear();
	}
	
	public static Set<Profile> notAddedUsers(List<Matchmaker> matchmakers){
		Set<Profile> notAddedUsers = new HashSet(Profile.find.all());
		Set<Profile> matchmakedUsers = new HashSet<Profile>();
		for(Matchmaker match : matchmakers){
			for(Profile user : match.users){
				matchmakedUsers.add(user);
			}
		}
		notAddedUsers.removeAll(matchmakedUsers);
		return notAddedUsers; 
	}
	
	public Long getId(){
		return id;
	}
	
	 /* Used to pragmatically make queries.  */
    public static Model.Finder<Long, Matchmaker> find = new Model.Finder<Long, Matchmaker>(Long.class, Matchmaker.class);
	

}