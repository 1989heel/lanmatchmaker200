// @SOURCE:M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/conf/routes
// @HASH:f95577d3a33b63831784ae1df2d3e57604dafa9f
// @DATE:Mon Jun 03 13:43:54 CEST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:105
// @LINE:104
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:79
class ReverseAssets {
    

// @LINE:79
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseChat {
    

// @LINE:69
def chat(username:String, eventid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chat/room/chat" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)), Some(implicitly[QueryStringBindable[Long]].unbind("eventid", eventid)))))
}
                                                

// @LINE:68
def chatRoom(eventid:Long = 666): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chat/room" + queryString(List(if(eventid == 666) None else Some(implicitly[QueryStringBindable[Long]].unbind("eventid", eventid)))))
}
                                                

// @LINE:67
def error(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chat")
}
                                                
    
}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseMatchmakers {
    

// @LINE:62
def matchmakeyo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmakeyo")
}
                                                

// @LINE:63
def clear(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmakerclear")
}
                                                

// @LINE:58
def item(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmaker/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:60
def addUser(id:Long, userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmaker/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("userName", URLEncoder.encode(userName, "utf-8")))
}
                                                

// @LINE:64
def chat(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmakechat/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:59
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmaker")
}
                                                

// @LINE:61
def matchmake(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matchmake/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:101
// @LINE:72
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:17
def validateRegistration(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:16
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:101
def sendFriendRequest(sender:String, receiver:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sendFriendRequest" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("sender", sender)), Some(implicitly[QueryStringBindable[String]].unbind("receiver", receiver)))))
}
                                                

// @LINE:72
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:76
// @LINE:75
class ReverseStream {
    

// @LINE:76
def streamInput(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "streamInput")
}
                                                

// @LINE:75
def stream(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stream")
}
                                                
    
}
                          

// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
class ReverseFollows {
    

// @LINE:98
// @LINE:95
def unFollow(follower:String, followed:String): Call = {
   (follower: @unchecked, followed: @unchecked) match {
// @LINE:95
case (follower, followed) if true => Call("GET", _prefix + { _defaultPrefix } + "follows/remove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("follower", follower)), Some(implicitly[QueryStringBindable[String]].unbind("followed", followed)))))
                                                        
// @LINE:98
case (follower, followed) if true => Call("POST", _prefix + { _defaultPrefix } + "follows/remove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("follower", follower)), Some(implicitly[QueryStringBindable[String]].unbind("followed", followed)))))
                                                        
   }
}
                                                

// @LINE:97
// @LINE:94
def follow(follower:String, followed:String): Call = {
   (follower: @unchecked, followed: @unchecked) match {
// @LINE:94
case (follower, followed) if true => Call("GET", _prefix + { _defaultPrefix } + "follows/add" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("follower", follower)), Some(implicitly[QueryStringBindable[String]].unbind("followed", followed)))))
                                                        
// @LINE:97
case (follower, followed) if true => Call("POST", _prefix + { _defaultPrefix } + "follows/add" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("follower", follower)), Some(implicitly[QueryStringBindable[String]].unbind("followed", followed)))))
                                                        
   }
}
                                                
    
}
                          

// @LINE:86
// @LINE:84
// @LINE:83
class ReverseUpload {
    

// @LINE:84
def imageUpload(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "imageUpload")
}
                                                

// @LINE:86
def uploadEvent(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "uploadImage" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:83
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                                                
    
}
                          

// @LINE:85
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
class ReverseEvents {
    

// @LINE:50
def updateEvent(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "events/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:38
def joinEvent(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/joinz" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:26
def listAll(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "eventx/listAll" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:29
def showUsersEvents(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/user/" + implicitly[PathBindable[String]].unbind("username", URLEncoder.encode(username, "utf-8")))
}
                                                

// @LINE:25
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "eventz/list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:32
def showSimpleAddUserToEvent(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/join")
}
                                                

// @LINE:45
def viewEvent(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "event" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:49
def editEvent(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:35
def addUserToEvent(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "events/join")
}
                                                

// @LINE:85
def imageUpload(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "imageUploadEvent" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:21
def registerEvent(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registerEvent")
}
                                                

// @LINE:42
def showEvent(event:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/profile" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("event", event)))))
}
                                                

// @LINE:39
def exitEvent(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events/exit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:22
def validateEventRegistration(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registerEvent")
}
                                                
    
}
                          

// @LINE:80
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:80
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                
    
}
                          

// @LINE:54
// @LINE:53
class ReverseQueue {
    

// @LINE:53
def queue(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ragglefraggle" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:54
def deQueue(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "riggleriggle" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:91
// @LINE:90
// @LINE:89
class ReverseProfiles {
    

// @LINE:90
def editProfile(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                

// @LINE:91
def saveProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:89
def profile(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                
    
}
                          

// @LINE:105
// @LINE:104
class ReverseSearch {
    

// @LINE:105
def searchList(page:Int = 0, eventSort:String = "name", eventOrder:String = "asc", userSort:String = "username", userOrder:String = "asc", searchQuery:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchresult" + queryString(List(if(page == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)), if(eventSort == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("eventSort", eventSort)), if(eventOrder == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("eventOrder", eventOrder)), if(userSort == "username") None else Some(implicitly[QueryStringBindable[String]].unbind("userSort", userSort)), if(userOrder == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("userOrder", userOrder)), if(searchQuery == "") None else Some(implicitly[QueryStringBindable[String]].unbind("searchQuery", searchQuery)))))
}
                                                

// @LINE:104
def search(searchQuery:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("searchQuery", searchQuery)))))
}
                                                
    
}
                          
}
                  


// @LINE:105
// @LINE:104
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:79
class ReverseAssets {
    

// @LINE:79
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseChat {
    

// @LINE:69
def chat : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Chat.chat",
   """
      function(username,eventid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat/room/chat" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("eventid", eventid)])})
      }
   """
)
                        

// @LINE:68
def chatRoom : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Chat.chatRoom",
   """
      function(eventid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat/room" + _qS([(eventid == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("eventid", eventid))])})
      }
   """
)
                        

// @LINE:67
def error : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Chat.error",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        
    
}
              

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseMatchmakers {
    

// @LINE:62
def matchmakeyo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.matchmakeyo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmakeyo"})
      }
   """
)
                        

// @LINE:63
def clear : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.clear",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmakerclear"})
      }
   """
)
                        

// @LINE:58
def item : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.item",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmaker/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:60
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.addUser",
   """
      function(id,userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmaker/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:64
def chat : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.chat",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmakechat/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmaker"})
      }
   """
)
                        

// @LINE:61
def matchmake : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matchmakers.matchmake",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matchmake/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:101
// @LINE:72
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:17
def validateRegistration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.validateRegistration",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:16
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:101
def sendFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.sendFriendRequest",
   """
      function(sender,receiver) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendFriendRequest" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sender", sender), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("receiver", receiver)])})
      }
   """
)
                        

// @LINE:72
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:76
// @LINE:75
class ReverseStream {
    

// @LINE:76
def streamInput : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stream.streamInput",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "streamInput"})
      }
   """
)
                        

// @LINE:75
def stream : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stream.stream",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stream"})
      }
   """
)
                        
    
}
              

// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
class ReverseFollows {
    

// @LINE:98
// @LINE:95
def unFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Follows.unFollow",
   """
      function(follower, followed) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/remove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("follower", follower), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("followed", followed)])})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/remove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("follower", follower), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("followed", followed)])})
      }
      }
   """
)
                        

// @LINE:97
// @LINE:94
def follow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Follows.follow",
   """
      function(follower, followed) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/add" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("follower", follower), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("followed", followed)])})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follows/add" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("follower", follower), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("followed", followed)])})
      }
      }
   """
)
                        
    
}
              

// @LINE:86
// @LINE:84
// @LINE:83
class ReverseUpload {
    

// @LINE:84
def imageUpload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Upload.imageUpload",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "imageUpload"})
      }
   """
)
                        

// @LINE:86
def uploadEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Upload.uploadEvent",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadImage" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:83
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Upload.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        
    
}
              

// @LINE:85
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
class ReverseEvents {
    

// @LINE:50
def updateEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.updateEvent",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def joinEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.joinEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/joinz" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:26
def listAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.listAll",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventx/listAll" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:29
def showUsersEvents : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.showUsersEvents",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:25
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventz/list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:32
def showSimpleAddUserToEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.showSimpleAddUserToEvent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/join"})
      }
   """
)
                        

// @LINE:45
def viewEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.viewEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:49
def editEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.editEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
def addUserToEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.addUserToEvent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "events/join"})
      }
   """
)
                        

// @LINE:85
def imageUpload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.imageUpload",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "imageUploadEvent" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:21
def registerEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.registerEvent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerEvent"})
      }
   """
)
                        

// @LINE:42
def showEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.showEvent",
   """
      function(event) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/profile" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("event", event)])})
      }
   """
)
                        

// @LINE:39
def exitEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.exitEvent",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events/exit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:22
def validateEventRegistration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Events.validateEventRegistration",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerEvent"})
      }
   """
)
                        
    
}
              

// @LINE:80
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:80
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        
    
}
              

// @LINE:54
// @LINE:53
class ReverseQueue {
    

// @LINE:53
def queue : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Queue.queue",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ragglefraggle" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:54
def deQueue : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Queue.deQueue",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riggleriggle" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:91
// @LINE:90
// @LINE:89
class ReverseProfiles {
    

// @LINE:90
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profiles.editProfile",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                        

// @LINE:91
def saveProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profiles.saveProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:89
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profiles.profile",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                        
    
}
              

// @LINE:105
// @LINE:104
class ReverseSearch {
    

// @LINE:105
def searchList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.searchList",
   """
      function(page,eventSort,eventOrder,userSort,userOrder,searchQuery) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchresult" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page)), (eventSort == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("eventSort", eventSort)), (eventOrder == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("eventOrder", eventOrder)), (userSort == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userSort", userSort)), (userOrder == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userOrder", userOrder)), (searchQuery == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("searchQuery", searchQuery))])})
      }
   """
)
                        

// @LINE:104
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.search",
   """
      function(searchQuery) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("searchQuery", searchQuery)])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:105
// @LINE:104
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:76
// @LINE:75
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:54
// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:79
class ReverseAssets {
    

// @LINE:79
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:69
// @LINE:68
// @LINE:67
class ReverseChat {
    

// @LINE:69
def chat(username:String, eventid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Chat.chat(username, eventid), HandlerDef(this, "controllers.Chat", "chat", Seq(classOf[String], classOf[Long]), "GET", """""", _prefix + """chat/room/chat""")
)
                      

// @LINE:68
def chatRoom(eventid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Chat.chatRoom(eventid), HandlerDef(this, "controllers.Chat", "chatRoom", Seq(classOf[Long]), "GET", """""", _prefix + """chat/room""")
)
                      

// @LINE:67
def error(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Chat.error(), HandlerDef(this, "controllers.Chat", "error", Seq(), "GET", """ Chat""", _prefix + """chat""")
)
                      
    
}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseMatchmakers {
    

// @LINE:62
def matchmakeyo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.matchmakeyo(), HandlerDef(this, "controllers.Matchmakers", "matchmakeyo", Seq(), "GET", """""", _prefix + """matchmakeyo""")
)
                      

// @LINE:63
def clear(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.clear(), HandlerDef(this, "controllers.Matchmakers", "clear", Seq(), "GET", """""", _prefix + """matchmakerclear""")
)
                      

// @LINE:58
def item(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.item(id), HandlerDef(this, "controllers.Matchmakers", "item", Seq(classOf[Long]), "GET", """ Matchmaker""", _prefix + """matchmaker/$id<[^/]+>""")
)
                      

// @LINE:60
def addUser(id:Long, userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.addUser(id, userName), HandlerDef(this, "controllers.Matchmakers", "addUser", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """matchmaker/$id<[^/]+>/$userName<[^/]+>""")
)
                      

// @LINE:64
def chat(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.chat(id), HandlerDef(this, "controllers.Matchmakers", "chat", Seq(classOf[Long]), "GET", """""", _prefix + """matchmakechat/$id<[^/]+>""")
)
                      

// @LINE:59
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.list(), HandlerDef(this, "controllers.Matchmakers", "list", Seq(), "GET", """""", _prefix + """matchmaker""")
)
                      

// @LINE:61
def matchmake(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matchmakers.matchmake(id), HandlerDef(this, "controllers.Matchmakers", "matchmake", Seq(classOf[Long]), "GET", """""", _prefix + """matchmake/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:101
// @LINE:72
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:9
class ReverseUsers {
    

// @LINE:17
def validateRegistration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.validateRegistration(), HandlerDef(this, "controllers.Users", "validateRegistration", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.login(), HandlerDef(this, "controllers.Users", "login", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Seq(), "GET", """ Logout""", _prefix + """logout""")
)
                      

// @LINE:16
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.register(), HandlerDef(this, "controllers.Users", "register", Seq(), "GET", """ Register user""", _prefix + """register""")
)
                      

// @LINE:101
def sendFriendRequest(sender:String, receiver:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.sendFriendRequest(sender, receiver), HandlerDef(this, "controllers.Users", "sendFriendRequest", Seq(classOf[String], classOf[String]), "GET", """ Friend Request""", _prefix + """sendFriendRequest""")
)
                      

// @LINE:72
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """ Users""", _prefix + """users""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.authenticate(), HandlerDef(this, "controllers.Users", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:76
// @LINE:75
class ReverseStream {
    

// @LINE:76
def streamInput(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stream.streamInput(), HandlerDef(this, "controllers.Stream", "streamInput", Seq(), "GET", """""", _prefix + """streamInput""")
)
                      

// @LINE:75
def stream(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stream.stream(), HandlerDef(this, "controllers.Stream", "stream", Seq(), "GET", """ Stream""", _prefix + """stream""")
)
                      
    
}
                          

// @LINE:98
// @LINE:97
// @LINE:95
// @LINE:94
class ReverseFollows {
    

// @LINE:95
def unFollow(follower:String, followed:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Follows.unFollow(follower, followed), HandlerDef(this, "controllers.Follows", "unFollow", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """follows/remove""")
)
                      

// @LINE:94
def follow(follower:String, followed:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Follows.follow(follower, followed), HandlerDef(this, "controllers.Follows", "follow", Seq(classOf[String], classOf[String]), "GET", """ Follows""", _prefix + """follows/add""")
)
                      
    
}
                          

// @LINE:86
// @LINE:84
// @LINE:83
class ReverseUpload {
    

// @LINE:84
def imageUpload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Upload.imageUpload(), HandlerDef(this, "controllers.Upload", "imageUpload", Seq(), "GET", """""", _prefix + """imageUpload""")
)
                      

// @LINE:86
def uploadEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Upload.uploadEvent(id), HandlerDef(this, "controllers.Upload", "uploadEvent", Seq(classOf[Long]), "POST", """""", _prefix + """uploadImage""")
)
                      

// @LINE:83
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Upload.upload(), HandlerDef(this, "controllers.Upload", "upload", Seq(), "POST", """ Upload""", _prefix + """upload""")
)
                      
    
}
                          

// @LINE:85
// @LINE:50
// @LINE:49
// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
class ReverseEvents {
    

// @LINE:50
def updateEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.updateEvent(id), HandlerDef(this, "controllers.Events", "updateEvent", Seq(classOf[Long]), "POST", """""", _prefix + """events/$id<[^/]+>""")
)
                      

// @LINE:38
def joinEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.joinEvent(id), HandlerDef(this, "controllers.Events", "joinEvent", Seq(classOf[Long]), "GET", """ Experimental event joining""", _prefix + """events/joinz""")
)
                      

// @LINE:26
def listAll(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.listAll(p, s, o, f), HandlerDef(this, "controllers.Events", "listAll", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """eventx/listAll""")
)
                      

// @LINE:29
def showUsersEvents(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.showUsersEvents(username), HandlerDef(this, "controllers.Events", "showUsersEvents", Seq(classOf[String]), "GET", """ Lists the events an user are in""", _prefix + """events/user/$username<[^/]+>""")
)
                      

// @LINE:25
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.list(p, s, o, f), HandlerDef(this, "controllers.Events", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ List events""", _prefix + """eventz/list""")
)
                      

// @LINE:32
def showSimpleAddUserToEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.showSimpleAddUserToEvent(), HandlerDef(this, "controllers.Events", "showSimpleAddUserToEvent", Seq(), "GET", """ simple event joining:""", _prefix + """events/join""")
)
                      

// @LINE:45
def viewEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.viewEvent(id), HandlerDef(this, "controllers.Events", "viewEvent", Seq(classOf[Long]), "GET", """ show Event page""", _prefix + """event""")
)
                      

// @LINE:49
def editEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.editEvent(id), HandlerDef(this, "controllers.Events", "editEvent", Seq(classOf[Long]), "GET", """""", _prefix + """events/$id<[^/]+>""")
)
                      

// @LINE:35
def addUserToEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.addUserToEvent(), HandlerDef(this, "controllers.Events", "addUserToEvent", Seq(), "POST", """ add User to Event""", _prefix + """events/join""")
)
                      

// @LINE:85
def imageUpload(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.imageUpload(id), HandlerDef(this, "controllers.Events", "imageUpload", Seq(classOf[Long]), "GET", """""", _prefix + """imageUploadEvent""")
)
                      

// @LINE:21
def registerEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.registerEvent(), HandlerDef(this, "controllers.Events", "registerEvent", Seq(), "GET", """""", _prefix + """registerEvent""")
)
                      

// @LINE:42
def showEvent(event:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.showEvent(event), HandlerDef(this, "controllers.Events", "showEvent", Seq(classOf[Long]), "GET", """ show Event profile""", _prefix + """events/profile""")
)
                      

// @LINE:39
def exitEvent(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.exitEvent(id), HandlerDef(this, "controllers.Events", "exitEvent", Seq(classOf[Long]), "GET", """""", _prefix + """events/exit""")
)
                      

// @LINE:22
def validateEventRegistration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Events.validateEventRegistration(), HandlerDef(this, "controllers.Events", "validateEventRegistration", Seq(), "POST", """""", _prefix + """registerEvent""")
)
                      
    
}
                          

// @LINE:80
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:80
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """""", _prefix + """assets/javascripts/routes""")
)
                      
    
}
                          

// @LINE:54
// @LINE:53
class ReverseQueue {
    

// @LINE:53
def queue(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Queue.queue(id), HandlerDef(this, "controllers.Queue", "queue", Seq(classOf[String]), "GET", """ Bandaid matchmaker""", _prefix + """ragglefraggle""")
)
                      

// @LINE:54
def deQueue(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Queue.deQueue(id), HandlerDef(this, "controllers.Queue", "deQueue", Seq(classOf[String]), "GET", """""", _prefix + """riggleriggle""")
)
                      
    
}
                          

// @LINE:91
// @LINE:90
// @LINE:89
class ReverseProfiles {
    

// @LINE:90
def editProfile(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profiles.editProfile(username), HandlerDef(this, "controllers.Profiles", "editProfile", Seq(classOf[String]), "GET", """""", _prefix + """profile/edit""")
)
                      

// @LINE:91
def saveProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profiles.saveProfile(), HandlerDef(this, "controllers.Profiles", "saveProfile", Seq(), "POST", """""", _prefix + """profile""")
)
                      

// @LINE:89
def profile(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profiles.profile(username), HandlerDef(this, "controllers.Profiles", "profile", Seq(classOf[String]), "GET", """ Profile""", _prefix + """profile""")
)
                      
    
}
                          

// @LINE:105
// @LINE:104
class ReverseSearch {
    

// @LINE:105
def searchList(page:Int, eventSort:String, eventOrder:String, userSort:String, userOrder:String, searchQuery:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.searchList(page, eventSort, eventOrder, userSort, userOrder, searchQuery), HandlerDef(this, "controllers.Search", "searchList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """searchresult""")
)
                      

// @LINE:104
def search(searchQuery:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.search(searchQuery), HandlerDef(this, "controllers.Search", "search", Seq(classOf[String]), "GET", """ Search""", _prefix + """search""")
)
                      
    
}
                          
}
                  
      