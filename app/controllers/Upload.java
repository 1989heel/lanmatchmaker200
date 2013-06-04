package controllers;

import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;

import javax.imageio.ImageIO;


import static play.data.Form.form;
import play.*;


import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;
import static play.data.Form.form;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.*;
import views.html.*;

import models.*;




public class Upload extends Controller{


	public static class uploaded {
		public String filename;
		}
		

	
	
	public static Result upload() {
		MultipartFormData body = request().body().asMultipartFormData();
		FilePart picture = body.getFile("picture");
			if (picture != null) {
				String fileName = picture.getFilename();
				String contentType = picture.getContentType(); 
				File file = picture.getFile();

				try {
					BufferedImage img = ImageIO.read(file);
					if(img==null){
						flash("error", "Inte en bildfil");
						return redirect(routes.Upload.imageUpload());
					}
				} catch (Exception e) {
					flash("error", "Inte en bildfil");
					return redirect(routes.Upload.imageUpload());
				}

				
				
				String myUploadPath = Play.application().configuration().getString("myUploadPath");
				file.renameTo(new File(myUploadPath, fileName));
				String session = session().get("username");
				Profile imageProfile = Profile.find.where().eq("username" , session).findUnique();
					imageProfile.picture = fileName;
					imageProfile.update();
					return redirect(routes.Profiles.profile(session));
			} else {
				flash("error", "Fil saknas");
				return redirect(routes.Upload.imageUpload());    
					}
	}
	
	public static Result uploadEvent(Long id) {
		MultipartFormData body = request().body().asMultipartFormData();
		FilePart picture = body.getFile("picture");
			if (picture != null) {
				String fileName = picture.getFilename();
				String contentType = picture.getContentType(); 
				File file = picture.getFile();

				try {
					BufferedImage img = ImageIO.read(file);
					if(img==null){
						flash("error", "Inte en bildfil");
						return redirect(routes.Events.imageUpload(id));
					}
				} catch (Exception e) {
					flash("error", "Inte en bildfil");
					return redirect(routes.Events.imageUpload(id));
				}

				
				
				String myUploadPath = Play.application().configuration().getString("myUploadPath");
				file.renameTo(new File(myUploadPath, fileName));
				Event imageEvent = Event.find.byId(id);
					imageEvent.picture = fileName;
					imageEvent.update();
					return redirect(routes.Events.viewEvent(id));
			} else {
				flash("error", "Fil saknas");
				return redirect(routes.Events.imageUpload(id));    
					}
	}
	
	public static Result imageUpload() {
		return ok(views.html.image.imageUpload.render());
		}
	
}