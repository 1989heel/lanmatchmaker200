package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.Model;

@Entity
public class Game extends Model {
	
	@Id
	public String title;
	public String publisher;
	
	@ManyToMany(cascade=CascadeType.PERSIST, mappedBy="game")
	public List<Profile> owner;
	
	// ... more relevant data can be added.
	
	public static Model.Finder<String, Game> find = new Model.Finder<String, Game>(String.class, Game.class);
}
