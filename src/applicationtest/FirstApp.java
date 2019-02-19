package applicationtest;

import datastructureslab.list.*;

public class FirstApp {
	
	public static void main (String [] args) {
		
		List<String> l = new DoubleLinkedList<String>();
		l.addFirst("HEBER");
		l.addFirst("SARA");
		l.addFirst("RAQUEL");
		l.addLast("Samuel");
		l.printElements();
		System.out.println("SIZE "+ l.getSize());
		
		
	}

}
