package models;

import play.db.ebean.Model;

/**
 * This class will most likely not be used, but I am making it anyway to store important data just in case we actually want to save emails.
 * @author Will
 *
 */
@Deprecated
public class Mail extends Model {

	public String message;
	public String subject;
	
	public Mail() {
		System.out.print("Why make an empty mail object?");
	}
	
	/*
	 * Generic header/subject for this one
	 */
	public Mail(String message) {
		this.message = message;
	}
	
	public Mail(String message, String subject) {
		this.message = message;
		this.subject = subject;
	}
	
	public static Model.Finder<String, Mail> find = new Model.Finder<String, Mail>(String.class, Mail.class);
	
}
