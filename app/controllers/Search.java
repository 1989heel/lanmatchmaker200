package controllers;

import static play.data.Form.form;

import java.util.List;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.*;
import views.html.*;

import models.*;
import com.avaje.ebean.*;

public class Search extends Controller {
	
	public static Result search(String searchQuery) {
        return redirect(routes.Search.searchList(0, "name", "asc", "username", "asc", searchQuery));
	}

    public static Result searchList(int page, String eventSortBy, String eventOrder, String userSortBy, String userOrder, String searchQuery) {
        return ok(views.html.search.searchResultPage.render(
                Event.pageByName(page, 10, eventSortBy, eventOrder, searchQuery),
                eventSortBy, eventOrder,
                User.page(page, 10, userSortBy, userOrder, searchQuery),
                userSortBy, userOrder, searchQuery));
    }
}