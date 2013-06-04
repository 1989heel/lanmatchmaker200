// @SOURCE:M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/conf/routes
// @HASH:f95577d3a33b63831784ae1df2d3e57604dafa9f
// @DATE:Mon Jun 03 13:43:54 CEST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Users_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Users_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Users_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:16
private[this] lazy val controllers_Users_register4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:17
private[this] lazy val controllers_Users_validateRegistration5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:21
private[this] lazy val controllers_Events_registerEvent6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerEvent"))))
        

// @LINE:22
private[this] lazy val controllers_Events_validateEventRegistration7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerEvent"))))
        

// @LINE:25
private[this] lazy val controllers_Events_list8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("eventz/list"))))
        

// @LINE:26
private[this] lazy val controllers_Events_listAll9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("eventx/listAll"))))
        

// @LINE:29
private[this] lazy val controllers_Events_showUsersEvents10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/user/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Events_showSimpleAddUserToEvent11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/join"))))
        

// @LINE:35
private[this] lazy val controllers_Events_addUserToEvent12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/join"))))
        

// @LINE:38
private[this] lazy val controllers_Events_joinEvent13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/joinz"))))
        

// @LINE:39
private[this] lazy val controllers_Events_exitEvent14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/exit"))))
        

// @LINE:42
private[this] lazy val controllers_Events_showEvent15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/profile"))))
        

// @LINE:45
private[this] lazy val controllers_Events_viewEvent16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event"))))
        

// @LINE:49
private[this] lazy val controllers_Events_editEvent17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:50
private[this] lazy val controllers_Events_updateEvent18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:53
private[this] lazy val controllers_Queue_queue19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ragglefraggle"))))
        

// @LINE:54
private[this] lazy val controllers_Queue_deQueue20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("riggleriggle"))))
        

// @LINE:58
private[this] lazy val controllers_Matchmakers_item21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmaker/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_Matchmakers_list22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmaker"))))
        

// @LINE:60
private[this] lazy val controllers_Matchmakers_addUser23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmaker/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("userName", """[^/]+""",true))))
        

// @LINE:61
private[this] lazy val controllers_Matchmakers_matchmake24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmake/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:62
private[this] lazy val controllers_Matchmakers_matchmakeyo25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmakeyo"))))
        

// @LINE:63
private[this] lazy val controllers_Matchmakers_clear26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmakerclear"))))
        

// @LINE:64
private[this] lazy val controllers_Matchmakers_chat27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matchmakechat/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:67
private[this] lazy val controllers_Chat_error28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat"))))
        

// @LINE:68
private[this] lazy val controllers_Chat_chatRoom29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat/room"))))
        

// @LINE:69
private[this] lazy val controllers_Chat_chat30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat/room/chat"))))
        

// @LINE:72
private[this] lazy val controllers_Users_list31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:75
private[this] lazy val controllers_Stream_stream32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stream"))))
        

// @LINE:76
private[this] lazy val controllers_Stream_streamInput33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("streamInput"))))
        

// @LINE:79
private[this] lazy val controllers_Assets_at34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:80
private[this] lazy val controllers_Application_javascriptRoutes35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:83
private[this] lazy val controllers_Upload_upload36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
        

// @LINE:84
private[this] lazy val controllers_Upload_imageUpload37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("imageUpload"))))
        

// @LINE:85
private[this] lazy val controllers_Events_imageUpload38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("imageUploadEvent"))))
        

// @LINE:86
private[this] lazy val controllers_Upload_uploadEvent39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("uploadImage"))))
        

// @LINE:89
private[this] lazy val controllers_Profiles_profile40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:90
private[this] lazy val controllers_Profiles_editProfile41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/edit"))))
        

// @LINE:91
private[this] lazy val controllers_Profiles_saveProfile42 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:94
private[this] lazy val controllers_Follows_follow43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follows/add"))))
        

// @LINE:95
private[this] lazy val controllers_Follows_unFollow44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follows/remove"))))
        

// @LINE:97
private[this] lazy val controllers_Follows_follow45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follows/add"))))
        

// @LINE:98
private[this] lazy val controllers_Follows_unFollow46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follows/remove"))))
        

// @LINE:101
private[this] lazy val controllers_Users_sendFriendRequest47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendFriendRequest"))))
        

// @LINE:104
private[this] lazy val controllers_Search_search48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:105
private[this] lazy val controllers_Search_searchList49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchresult"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Users.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Users.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Users.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Users.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Users.validateRegistration()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerEvent""","""controllers.Events.registerEvent()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerEvent""","""controllers.Events.validateEventRegistration()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """eventz/list""","""controllers.Events.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """eventx/listAll""","""controllers.Events.listAll(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/user/$username<[^/]+>""","""controllers.Events.showUsersEvents(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/join""","""controllers.Events.showSimpleAddUserToEvent()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/join""","""controllers.Events.addUserToEvent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/joinz""","""controllers.Events.joinEvent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/exit""","""controllers.Events.exitEvent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/profile""","""controllers.Events.showEvent(event:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event""","""controllers.Events.viewEvent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/$id<[^/]+>""","""controllers.Events.editEvent(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events/$id<[^/]+>""","""controllers.Events.updateEvent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ragglefraggle""","""controllers.Queue.queue(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """riggleriggle""","""controllers.Queue.deQueue(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmaker/$id<[^/]+>""","""controllers.Matchmakers.item(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmaker""","""controllers.Matchmakers.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmaker/$id<[^/]+>/$userName<[^/]+>""","""controllers.Matchmakers.addUser(id:Long, userName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmake/$id<[^/]+>""","""controllers.Matchmakers.matchmake(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmakeyo""","""controllers.Matchmakers.matchmakeyo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmakerclear""","""controllers.Matchmakers.clear()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matchmakechat/$id<[^/]+>""","""controllers.Matchmakers.chat(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat""","""controllers.Chat.error()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat/room""","""controllers.Chat.chatRoom(eventid:Long ?= 666)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat/room/chat""","""controllers.Chat.chat(username:String, eventid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stream""","""controllers.Stream.stream()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """streamInput""","""controllers.Stream.streamInput()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.Upload.upload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """imageUpload""","""controllers.Upload.imageUpload()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """imageUploadEvent""","""controllers.Events.imageUpload(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """uploadImage""","""controllers.Upload.uploadEvent(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Profiles.profile(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/edit""","""controllers.Profiles.editProfile(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Profiles.saveProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follows/add""","""controllers.Follows.follow(follower:String, followed:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follows/remove""","""controllers.Follows.unFollow(follower:String, followed:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follows/add""","""controllers.Follows.follow(follower:String, followed:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follows/remove""","""controllers.Follows.unFollow(follower:String, followed:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendFriendRequest""","""controllers.Users.sendFriendRequest(sender:String, receiver:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Search.search(searchQuery:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchresult""","""controllers.Search.searchList(page:Int ?= 0, eventSort:String ?= "name", eventOrder:String ?= "asc", userSort:String ?= "username", userOrder:String ?= "asc", searchQuery:String ?= "")""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Users_login1(params) => {
   call { 
        invokeHandler(controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Nil,"GET", """ Login""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Users_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Users_logout3(params) => {
   call { 
        invokeHandler(controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Nil,"GET", """ Logout""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:16
case controllers_Users_register4(params) => {
   call { 
        invokeHandler(controllers.Users.register(), HandlerDef(this, "controllers.Users", "register", Nil,"GET", """ Register user""", Routes.prefix + """register"""))
   }
}
        

// @LINE:17
case controllers_Users_validateRegistration5(params) => {
   call { 
        invokeHandler(controllers.Users.validateRegistration(), HandlerDef(this, "controllers.Users", "validateRegistration", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:21
case controllers_Events_registerEvent6(params) => {
   call { 
        invokeHandler(controllers.Events.registerEvent(), HandlerDef(this, "controllers.Events", "registerEvent", Nil,"GET", """""", Routes.prefix + """registerEvent"""))
   }
}
        

// @LINE:22
case controllers_Events_validateEventRegistration7(params) => {
   call { 
        invokeHandler(controllers.Events.validateEventRegistration(), HandlerDef(this, "controllers.Events", "validateEventRegistration", Nil,"POST", """""", Routes.prefix + """registerEvent"""))
   }
}
        

// @LINE:25
case controllers_Events_list8(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Events.list(p, s, o, f), HandlerDef(this, "controllers.Events", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ List events""", Routes.prefix + """eventz/list"""))
   }
}
        

// @LINE:26
case controllers_Events_listAll9(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Events.listAll(p, s, o, f), HandlerDef(this, "controllers.Events", "listAll", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """eventx/listAll"""))
   }
}
        

// @LINE:29
case controllers_Events_showUsersEvents10(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Events.showUsersEvents(username), HandlerDef(this, "controllers.Events", "showUsersEvents", Seq(classOf[String]),"GET", """ Lists the events an user are in""", Routes.prefix + """events/user/$username<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Events_showSimpleAddUserToEvent11(params) => {
   call { 
        invokeHandler(controllers.Events.showSimpleAddUserToEvent(), HandlerDef(this, "controllers.Events", "showSimpleAddUserToEvent", Nil,"GET", """ simple event joining:""", Routes.prefix + """events/join"""))
   }
}
        

// @LINE:35
case controllers_Events_addUserToEvent12(params) => {
   call { 
        invokeHandler(controllers.Events.addUserToEvent(), HandlerDef(this, "controllers.Events", "addUserToEvent", Nil,"POST", """ add User to Event""", Routes.prefix + """events/join"""))
   }
}
        

// @LINE:38
case controllers_Events_joinEvent13(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.joinEvent(id), HandlerDef(this, "controllers.Events", "joinEvent", Seq(classOf[Long]),"GET", """ Experimental event joining""", Routes.prefix + """events/joinz"""))
   }
}
        

// @LINE:39
case controllers_Events_exitEvent14(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.exitEvent(id), HandlerDef(this, "controllers.Events", "exitEvent", Seq(classOf[Long]),"GET", """""", Routes.prefix + """events/exit"""))
   }
}
        

// @LINE:42
case controllers_Events_showEvent15(params) => {
   call(params.fromQuery[Long]("event", None)) { (event) =>
        invokeHandler(controllers.Events.showEvent(event), HandlerDef(this, "controllers.Events", "showEvent", Seq(classOf[Long]),"GET", """ show Event profile""", Routes.prefix + """events/profile"""))
   }
}
        

// @LINE:45
case controllers_Events_viewEvent16(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.viewEvent(id), HandlerDef(this, "controllers.Events", "viewEvent", Seq(classOf[Long]),"GET", """ show Event page""", Routes.prefix + """event"""))
   }
}
        

// @LINE:49
case controllers_Events_editEvent17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.editEvent(id), HandlerDef(this, "controllers.Events", "editEvent", Seq(classOf[Long]),"GET", """""", Routes.prefix + """events/$id<[^/]+>"""))
   }
}
        

// @LINE:50
case controllers_Events_updateEvent18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.updateEvent(id), HandlerDef(this, "controllers.Events", "updateEvent", Seq(classOf[Long]),"POST", """""", Routes.prefix + """events/$id<[^/]+>"""))
   }
}
        

// @LINE:53
case controllers_Queue_queue19(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.Queue.queue(id), HandlerDef(this, "controllers.Queue", "queue", Seq(classOf[String]),"GET", """ Bandaid matchmaker""", Routes.prefix + """ragglefraggle"""))
   }
}
        

// @LINE:54
case controllers_Queue_deQueue20(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.Queue.deQueue(id), HandlerDef(this, "controllers.Queue", "deQueue", Seq(classOf[String]),"GET", """""", Routes.prefix + """riggleriggle"""))
   }
}
        

// @LINE:58
case controllers_Matchmakers_item21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matchmakers.item(id), HandlerDef(this, "controllers.Matchmakers", "item", Seq(classOf[Long]),"GET", """ Matchmaker""", Routes.prefix + """matchmaker/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_Matchmakers_list22(params) => {
   call { 
        invokeHandler(controllers.Matchmakers.list(), HandlerDef(this, "controllers.Matchmakers", "list", Nil,"GET", """""", Routes.prefix + """matchmaker"""))
   }
}
        

// @LINE:60
case controllers_Matchmakers_addUser23(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("userName", None)) { (id, userName) =>
        invokeHandler(controllers.Matchmakers.addUser(id, userName), HandlerDef(this, "controllers.Matchmakers", "addUser", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """matchmaker/$id<[^/]+>/$userName<[^/]+>"""))
   }
}
        

// @LINE:61
case controllers_Matchmakers_matchmake24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matchmakers.matchmake(id), HandlerDef(this, "controllers.Matchmakers", "matchmake", Seq(classOf[Long]),"GET", """""", Routes.prefix + """matchmake/$id<[^/]+>"""))
   }
}
        

// @LINE:62
case controllers_Matchmakers_matchmakeyo25(params) => {
   call { 
        invokeHandler(controllers.Matchmakers.matchmakeyo(), HandlerDef(this, "controllers.Matchmakers", "matchmakeyo", Nil,"GET", """""", Routes.prefix + """matchmakeyo"""))
   }
}
        

// @LINE:63
case controllers_Matchmakers_clear26(params) => {
   call { 
        invokeHandler(controllers.Matchmakers.clear(), HandlerDef(this, "controllers.Matchmakers", "clear", Nil,"GET", """""", Routes.prefix + """matchmakerclear"""))
   }
}
        

// @LINE:64
case controllers_Matchmakers_chat27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matchmakers.chat(id), HandlerDef(this, "controllers.Matchmakers", "chat", Seq(classOf[Long]),"GET", """""", Routes.prefix + """matchmakechat/$id<[^/]+>"""))
   }
}
        

// @LINE:67
case controllers_Chat_error28(params) => {
   call { 
        invokeHandler(controllers.Chat.error(), HandlerDef(this, "controllers.Chat", "error", Nil,"GET", """ Chat""", Routes.prefix + """chat"""))
   }
}
        

// @LINE:68
case controllers_Chat_chatRoom29(params) => {
   call(params.fromQuery[Long]("eventid", Some(666))) { (eventid) =>
        invokeHandler(controllers.Chat.chatRoom(eventid), HandlerDef(this, "controllers.Chat", "chatRoom", Seq(classOf[Long]),"GET", """""", Routes.prefix + """chat/room"""))
   }
}
        

// @LINE:69
case controllers_Chat_chat30(params) => {
   call(params.fromQuery[String]("username", None), params.fromQuery[Long]("eventid", None)) { (username, eventid) =>
        invokeHandler(controllers.Chat.chat(username, eventid), HandlerDef(this, "controllers.Chat", "chat", Seq(classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """chat/room/chat"""))
   }
}
        

// @LINE:72
case controllers_Users_list31(params) => {
   call { 
        invokeHandler(controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Nil,"GET", """ Users""", Routes.prefix + """users"""))
   }
}
        

// @LINE:75
case controllers_Stream_stream32(params) => {
   call { 
        invokeHandler(controllers.Stream.stream(), HandlerDef(this, "controllers.Stream", "stream", Nil,"GET", """ Stream""", Routes.prefix + """stream"""))
   }
}
        

// @LINE:76
case controllers_Stream_streamInput33(params) => {
   call { 
        invokeHandler(controllers.Stream.streamInput(), HandlerDef(this, "controllers.Stream", "streamInput", Nil,"GET", """""", Routes.prefix + """streamInput"""))
   }
}
        

// @LINE:79
case controllers_Assets_at34(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:80
case controllers_Application_javascriptRoutes35(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:83
case controllers_Upload_upload36(params) => {
   call { 
        invokeHandler(controllers.Upload.upload(), HandlerDef(this, "controllers.Upload", "upload", Nil,"POST", """ Upload""", Routes.prefix + """upload"""))
   }
}
        

// @LINE:84
case controllers_Upload_imageUpload37(params) => {
   call { 
        invokeHandler(controllers.Upload.imageUpload(), HandlerDef(this, "controllers.Upload", "imageUpload", Nil,"GET", """""", Routes.prefix + """imageUpload"""))
   }
}
        

// @LINE:85
case controllers_Events_imageUpload38(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Events.imageUpload(id), HandlerDef(this, "controllers.Events", "imageUpload", Seq(classOf[Long]),"GET", """""", Routes.prefix + """imageUploadEvent"""))
   }
}
        

// @LINE:86
case controllers_Upload_uploadEvent39(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Upload.uploadEvent(id), HandlerDef(this, "controllers.Upload", "uploadEvent", Seq(classOf[Long]),"POST", """""", Routes.prefix + """uploadImage"""))
   }
}
        

// @LINE:89
case controllers_Profiles_profile40(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Profiles.profile(username), HandlerDef(this, "controllers.Profiles", "profile", Seq(classOf[String]),"GET", """ Profile""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:90
case controllers_Profiles_editProfile41(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Profiles.editProfile(username), HandlerDef(this, "controllers.Profiles", "editProfile", Seq(classOf[String]),"GET", """""", Routes.prefix + """profile/edit"""))
   }
}
        

// @LINE:91
case controllers_Profiles_saveProfile42(params) => {
   call { 
        invokeHandler(controllers.Profiles.saveProfile(), HandlerDef(this, "controllers.Profiles", "saveProfile", Nil,"POST", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:94
case controllers_Follows_follow43(params) => {
   call(params.fromQuery[String]("follower", None), params.fromQuery[String]("followed", None)) { (follower, followed) =>
        invokeHandler(controllers.Follows.follow(follower, followed), HandlerDef(this, "controllers.Follows", "follow", Seq(classOf[String], classOf[String]),"GET", """ Follows""", Routes.prefix + """follows/add"""))
   }
}
        

// @LINE:95
case controllers_Follows_unFollow44(params) => {
   call(params.fromQuery[String]("follower", None), params.fromQuery[String]("followed", None)) { (follower, followed) =>
        invokeHandler(controllers.Follows.unFollow(follower, followed), HandlerDef(this, "controllers.Follows", "unFollow", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """follows/remove"""))
   }
}
        

// @LINE:97
case controllers_Follows_follow45(params) => {
   call(params.fromQuery[String]("follower", None), params.fromQuery[String]("followed", None)) { (follower, followed) =>
        invokeHandler(controllers.Follows.follow(follower, followed), HandlerDef(this, "controllers.Follows", "follow", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """follows/add"""))
   }
}
        

// @LINE:98
case controllers_Follows_unFollow46(params) => {
   call(params.fromQuery[String]("follower", None), params.fromQuery[String]("followed", None)) { (follower, followed) =>
        invokeHandler(controllers.Follows.unFollow(follower, followed), HandlerDef(this, "controllers.Follows", "unFollow", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """follows/remove"""))
   }
}
        

// @LINE:101
case controllers_Users_sendFriendRequest47(params) => {
   call(params.fromQuery[String]("sender", None), params.fromQuery[String]("receiver", None)) { (sender, receiver) =>
        invokeHandler(controllers.Users.sendFriendRequest(sender, receiver), HandlerDef(this, "controllers.Users", "sendFriendRequest", Seq(classOf[String], classOf[String]),"GET", """ Friend Request""", Routes.prefix + """sendFriendRequest"""))
   }
}
        

// @LINE:104
case controllers_Search_search48(params) => {
   call(params.fromQuery[String]("searchQuery", None)) { (searchQuery) =>
        invokeHandler(controllers.Search.search(searchQuery), HandlerDef(this, "controllers.Search", "search", Seq(classOf[String]),"GET", """ Search""", Routes.prefix + """search"""))
   }
}
        

// @LINE:105
case controllers_Search_searchList49(params) => {
   call(params.fromQuery[Int]("page", Some(0)), params.fromQuery[String]("eventSort", Some("name")), params.fromQuery[String]("eventOrder", Some("asc")), params.fromQuery[String]("userSort", Some("username")), params.fromQuery[String]("userOrder", Some("asc")), params.fromQuery[String]("searchQuery", Some(""))) { (page, eventSort, eventOrder, userSort, userOrder, searchQuery) =>
        invokeHandler(controllers.Search.searchList(page, eventSort, eventOrder, userSort, userOrder, searchQuery), HandlerDef(this, "controllers.Search", "searchList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """searchresult"""))
   }
}
        
}
    
}
        