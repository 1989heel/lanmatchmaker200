package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.data.*;

import models.*;
import views.*;

public class Secured extends Security.Authenticator {
    
    @Override
    public String getUsername(Context context) {
        return context.session().get("username");
    }
    
    @Override
    public Result onUnauthorized(Context context) {
    	play.mvc.Controller.flash("Unauthorized");
        return redirect(routes.Users.login());
    }
}