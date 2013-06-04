package misc;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map.*;
import java.util.HashMap;

import play.Logger;

import controllers.*;
import misc.HashBag.Node;
import models.*;
import views.html.*;

public class HashBag {
	
	public Map<String, Node> map = new HashMap<String, Node>();
	
	public void add(Profile user) {
		Logger.info("Add called.");
		Node temp;
		
		// Yes, there is a location.
		if (containsKey(user.residence)) {
			Logger.info(user.residence);
			if (user.queue) {
				temp = map.get(user.residence);
				temp.add(user);
			}
		// No, there is no location.
		} else if(!containsKey(user.residence)) {
			Logger.info("The location doesn't exist");
			temp = new Node();
			Logger.info(user.username);
			temp.add(user);
			map.put(user.residence, temp);
		}
	}
	
	public boolean containsKey(String key) {
		Iterator<Entry<String, Node>> it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Node> entry = it.next();
			if (key.equals(entry.getKey())) {
				return true;
			}
		}
		
		return false;
	}
	
	public ArrayList<ArrayList<Profile>> get() {
		ArrayList< ArrayList<Profile> > listy = new ArrayList< ArrayList<Profile> >();
		ArrayList<Profile> temp = null;
		Iterator<Entry<String, Node>> it = map.entrySet().iterator();
		Node n = null;
		
		while (it.hasNext()) {
			Map.Entry<String, Node> entry = it.next();
			n = entry.getValue();
			if (n.quota()) {
				Logger.info("Quota filled.");
				temp = n.users;
				listy.add(temp);
				map.remove(n);
			}
		}
		
		return listy;
	}
	
	public boolean ready(Profile user) {
		return map.get(user.residence).quota();
	}
	
	public void purge() {
		map.clear();
	}

	public static class Node {
		
		public int counter = 0;
		public ArrayList<Profile> users = new ArrayList<Profile>(25);
		
		public void add(Profile user) {
			if (!contains(user) && user.queue) {
				++counter;
				users.add(user);
			}
		}
		
		public boolean contains(Profile user) {
			return users.contains(user) ? true : false;
		}
		
		public boolean quota() {
			return counter > 4 ? true : false;
		}
	}
}
