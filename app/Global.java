import models.*;

import controllers.*;
import controllers.Application;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.event.ServerConfigStartup;

import play.*;
import play.data.*;
import play.mvc.*;
import play.mvc.Http.RequestHeader;
import static play.mvc.Results.*;

import views.*;
import views.html.*;

public class Global extends GlobalSettings implements ServerConfigStartup {
	
	public Global() {
		ServerConfig sc = new ServerConfig();
		onStart(sc);
	}
	
	@Override
	public Result onError(RequestHeader request, Throwable t) {
		return internalServerError("The following error occured when processing your request:  " + "\n" + 
									t.getMessage() + "\n" + 
									t.getStackTrace());
	}
	
	@Override
	public Result onHandlerNotFound(RequestHeader request) {
	    return ok(noURL.render());
	}

	@Override
	public void onStart(ServerConfig serverConfig) {
		Logger.info("Server config");
		serverConfig.setDatabaseSequenceBatchSize(1);
	}
}