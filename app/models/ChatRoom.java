package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import scala.concurrent.Await;
import scala.concurrent.duration.Duration;
import akka.actor.*;
import static akka.pattern.Patterns.ask;

import org.codehaus.jackson.*;
import org.codehaus.jackson.node.*;

import java.util.*;

import static java.util.concurrent.TimeUnit.*;

public class ChatRoom extends UntypedActor {
    //En akka.ActorRef representerar ett chattrum.
    public static Map<Long, ActorRef> chatRooms = new HashMap<Long, ActorRef>();

    //Historik
    public List<JsonNode> pastEntries;

    //Användare som är tillåtna i denna chatt
    public HashSet<String> chatUsers;

    //Användare som är inne i chatten just nu
    public Map<String, WebSocket.Out<JsonNode>> usersCurrentlyInChat;


    private ChatRoom() {
        pastEntries = new ArrayList<JsonNode>();
        chatUsers = new HashSet<String>();
        usersCurrentlyInChat =  new HashMap<String, WebSocket.Out<JsonNode>>();
    }

    //Denna bör kallas när man skapar en ny chatt.
    public static ActorRef createNewChatRoom(Long host) {
       chatRooms.put(host, Akka.system().actorOf(new Props(ChatRoom.class)) );
       return chatRooms.get(host);
    }

    public static boolean deleteChatRoom(String id){
        if(chatRooms.containsKey(id)){
            chatRooms.remove(id);
            return true;
        }
        return false;
    }

    public static boolean chatExists(Long host) {
        return chatRooms.containsKey(host);
    }
    public static ActorRef getChatRoom(Long host) {
        if(chatRooms.containsKey(host))
            return chatRooms.get(host);
        else return null;
    }

    public static void join(final String username, WebSocket.In<JsonNode> in, WebSocket.Out<JsonNode> out, Long eventid) throws Exception{
        final ActorRef chatRoom = chatRooms.get(eventid);

        // Send the Join message to the room. onReceive-metoden tar hand om ask.
        String result = (String)Await.result(ask(chatRoom,new Join(username, out), 1000), Duration.create(1, SECONDS));
        
        if("OK".equals(result)) {
            
            // For each event received on the socket,
            in.onMessage(new Callback<JsonNode>() {
               public void invoke(JsonNode event) {
                   // Send a Talk message to the room. tell hanteras av onReceive-metoden
                   chatRoom.tell(new Talk(username, event));
            } //invoke
            });
            
            // When the socket is closed.
            in.onClose(new Callback0() {
               public void invoke() {
                   // Send a Quit message to the room.
                  chatRoom.tell(new Quit(username));
               }
            });
            
        }
        else {
            // Cannot connect, create a Json error.
            ObjectNode error = Json.newObject();
            error.put("error", result);
            out.write(error);
        }
    }


    public void onReceive(Object message) throws Exception {

        if(message instanceof Join) {
            Join join = (Join)message;
            if(chatUsers.contains(join.user)){
                if(usersCurrentlyInChat.containsKey(join.user)){
                    getSender().tell("This user is already in the chatroom");
                }
                else{
                    usersCurrentlyInChat.put(join.user, join.channel);
                    fillHistory(join.channel);
                    ObjectNode content = Json.newObject();
                    content.put("text", "has joined the room");
                    notifyAll("join", join.user, content);
                    getSender().tell("OK");
                }
            }
            else getSender().tell("This user is not privileged to join the chatroom");
        }

        else if(message instanceof Talk){
            Talk talk = (Talk)message;
            notifyAll("talk", talk.user, talk.content);
        }
        else if(message instanceof Quit){
            Quit quit = (Quit)message;
            try{
                usersCurrentlyInChat.remove(quit.user);
                ObjectNode content = Json.newObject();
                content.put("text", "has left the room");
                notifyAll("quit", quit.user, content);
            }catch(NullPointerException e){
                play.Logger.info("ChatRoom.onReceive.Quit could not find the user to remove ");
            }
        }

       else if (message instanceof ModifyUser){
            ModifyUser m = (ModifyUser)message;
            if(User.find.where().eq("userName", m.user).findUnique() != null){
                if(m.type == ModifyUser.Type.ADD){
                    chatUsers.add(m.user);
                    getSender().tell("OK");
                }
                else if(m.type == ModifyUser.Type.DELETE){
                    if(chatUsers.contains(m.user)){
                        chatUsers.remove(m.user);
                        getSender().tell("OK");
                    }
                }
            }
            else getSender().tell("User does not exist");
        }
        else {
            unhandled(message);
        }
    }

    //Fyller på historiken i chatten
    public void fillHistory(WebSocket.Out<JsonNode> out){
        for(JsonNode entry: pastEntries){
            out.write(entry);
        }
    }
    
    // Send a Json event to all members
    public void notifyAll(String kind, String username, JsonNode content) {
        ObjectNode event = Json.newObject();
        event.put("kind", kind);
        event.put("user", username);
        event.put("message", content.get("text").asText());

        if(kind.equals("talk")){
            //Formattering av datum
            String month = (content.get("month").asInt()<10) ? "0"+content.get("month").asText() : content.get("month").asText();
            String day = (content.get("day").asInt()<10) ? "0"+content.get("day").asText() : content.get("day").asText();
            String hours = (content.get("hours").asInt()<10) ? "0"+content.get("hours").asText() : content.get("hours").asText();
            String minutes = (content.get("minutes").asInt()<10) ? "0"+content.get("minutes").asText() : content.get("minutes").asText();
            event.put("year", content.get("year").asText());
            event.put("month", month);
            event.put("day", day);
            event.put("time", hours+":"+minutes);
        }

        pastEntries.add(event);

        for(WebSocket.Out<JsonNode> channel: usersCurrentlyInChat.values()) {

            //Relaterat till uppdateringen av de nävarande medlemmarna i chatten
            ArrayNode m = event.putArray("members");
            for(String s: usersCurrentlyInChat.keySet()) {
                m.add(s);
            }
            channel.write(event);
        }
    }
    
    // -- Messages

    public static class Join{
        final String user;
        final WebSocket.Out<JsonNode> channel;

        public Join(String user, WebSocket.Out<JsonNode> channel) {
            this.user = user;
            this.channel = channel;
        }
    }

    public static class Talk{
        final String user;
        final JsonNode content;

        public Talk(String user, JsonNode content) {
            this.user = user;
            this.content = content;
        }
    }

    public static class Quit{
        final String user;

        public Quit(String user) {
            this.user = user;
        }
    }

    public static class ModifyUser{
        final String user;
        public enum Type{ADD, DELETE}
        final Type type;

        public ModifyUser(String user, Type type){
            this.user = user;
            this.type = type;
        }
    }

}