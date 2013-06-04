package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;

import java.util.*;

import views.html.*;

public class Stream extends Controller {
	
	public static class streamUser {
		public String streamUsername;
	}
	
	public static Result streamInput() {
		return ok(views.html.stream.streamInput.render(form(streamUser.class)));
	}
	
	public static Result stream() {
		Form<streamUser> streamForm = form(streamUser.class).bindFromRequest();
        if(streamForm.hasErrors()) {
            return badRequest(views.html.stream.streamInput.render(streamForm));
        } else {
            streamUser data = streamForm.get();
            return ok(views.html.stream.stream.render(data.streamUsername));
        }
    }
	
}