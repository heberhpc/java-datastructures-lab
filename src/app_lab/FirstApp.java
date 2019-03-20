package app_lab;

import datastructures.list.List;
import datastructures.list.SingleLinkedList;

public class FirstApp {
	
	public static void main (String [] args) {
		
		List<String> l = new SingleLinkedList<String>();
		l.addFirst("HEBER");
		l.addFirst("SARA");
		l.addFirst("SAMUEL");
		l.printElements();
		System.out.println("SIZE "+ l.getSize());
		
		
		
	}

}
