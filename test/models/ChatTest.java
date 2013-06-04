package models;



import org.junit.*;


import play.test.*;

import org.junit.*;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;


import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


import scala.concurrent.Await;
import scala.concurrent.duration.Duration;
import akka.actor.*;

import static akka.pattern.Patterns.ask;

import models.*;
public class ChatTest extends WithApplication {
    @Before
    public void setUp(){
        start(fakeApplication(inMemoryDatabase()));
    }

//    @Test
//    public void MultipleChatsTest(){
//        new User("User1","User1", "hej").save();
//        User hej = User.find.where().eq("username", "User1").findUnique();
//        assertNotNull(hej);
//        assertEquals("User1", hej.username);
//
//        new User("Hej2","Hej2", "hej2").save();
//        User hej2 = User.find.where().eq("username", "Hej2").findUnique();
//        assertNotNull(hej2);
//        assertEquals("Hej2", hej2.username);
//
//        new User("Hej3","Hej3", "hej3").save();
//        User hej3 = User.find.where().eq("username", "Hej3").findUnique();
//        assertNotNull(hej3);
//        assertEquals("Hej3", hej3.username);
//
//        Event e = new Event(new Long(1));
//        Event e2 = new Event(new Long(1002));
//
//
//        e.chat.tell(hej);
//        e.chat.tell(hej2);
//        e.chat.tell(hej3);
//
//        e.chat.tell("test");
//        e.chat.tell("test");
//        e2.chat.tell("test");
//        e.chat.tell("test");
//        e2.chat.tell("test");
//        e2.chat.tell("test");
//
//        e.save();
//        e2.save();
//
//        Event ev = Event.find.where().eq("id", 1).findUnique();
//        Event ev2 = Event.find.where().eq("id", 1002).findUnique();
//        assertNotNull(ev);
//        assertNotNull(ev2);
//
//
//        try {
//            int result = (int)Await.result(ask(e.chat , "pastEntries.size" , 1000), Duration.create(1, SECONDS));
//            assertEquals(3, result);
//
//            int result2 = (int)Await.result(ask(e2.chat , "pastEntries.size" , 1000), Duration.create(1, SECONDS));
//            assertEquals(3, result2);
//
//        } catch(Exception err) {
//            fail();
//        }
//    }
}