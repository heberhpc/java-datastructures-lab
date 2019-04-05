package app_lab;

import datastructures.queue.Queue;
import datastructures.queue.QueueFixedArray;

public class FirstApp {
	
	public static void main (String [] args) {
		
		Queue<String> q = new QueueFixedArray<String>(8);
		
		
		//q.printElements();
		q.enqueue("One");
		q.enqueue("Two");
		q.enqueue("Three");
		q.enqueue("Four");
		q.enqueue("Five");
		q.enqueue("Six");
		q.enqueue("Seven");
		q.enqueue("Eight");

		
		
		
		q.printElements();
		q.dequeue();
		q.printElements();

		q.dequeue();
		q.printElements();

		q.dequeue();
		q.printElements();
		
		q.enqueue("EXTRA");
		q.printElements();
		
		q.enqueue("EXTRA1");
		q.printElements();
		
		q.enqueue("EXTRA2");
		q.printElements();


		
		//q.enqueue("EXTRA");
		//q.printElements();
		
		
	}
	
	public static void printInfo(String s) {
		System.out.println("[Info] "+s);
	}

}
