package applicationtest;

import datastructureslab.list.*;

public class FirstApp {
	
	public static void main (String [] args) {
		
		CircularyList<String> l = new CircularySingleLinkedList<String>();
		l.addFirst("HEBER");
		l.addFirst("SARA");
		l.addFirst("SAMUEL");
		l.printElements();
		System.out.println("SIZE "+ l.getSize());
	
		
		
	}

}
