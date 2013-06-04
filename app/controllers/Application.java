package controllers;

import static play.data.Form.form;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.*;
import views.html.*;
import views.html.user.login;
import views.html.user.register;

import models.*;

public class Application extends Controller {

	/** 
	 * Universal method calls in convenient static keywords.
	 */
	public static final Result INDEX = redirect(routes.Application.index());
	
	/**
	 * Index renders a html page that consists of two rendered html pages that accept one form each.
	 */
    public static Result index() {
    	
		if (session().isEmpty())
			return ok(index.render(
					login.render(form(Users.Login.class)),
					register.render(form(User.class))));
		else
			return ok(temporaryHomePage.render());
    }
    
    /**
     * TODO: Add javascript routes here. 
     */
    public static Result javascriptRoutes() {
    	response().setContentType("text/javascript");
    	
    	return TODO;
    }
    
}