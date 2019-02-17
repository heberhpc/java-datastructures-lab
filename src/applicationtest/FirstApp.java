package applicationtest;

import datastructureslab.list.*;

public class FirstApp {
	
	public static void main (String [] args) {
		
		List<String> l = new SingleLinkedList<String>();
		l.addAt("HEBER", 0);
		l.printElements();
		
		l.addAt("Sara", 0);
		l.printElements();
		
		l.addAt("Pamela", 0);
		l.printElements();
		
		l.addAt("Junior", 0);
		l.printElements();
		
		l.addFirst("Samuel Junior");
		l.addLast("Sara Matos de Oliveira");
		l.printElements();
		
		l.addAt("Heber Coutinho", 3);
		l.printElements();
	
	}

}
