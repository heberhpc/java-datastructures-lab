package app_lab;

import datastructures.stack.Stack;
import datastructures.stack.StackFixedLenght;

public class FirstApp {
	
	public static void main (String [] args) {
		
		Stack<String> stack = new StackFixedLenght<String>(10);
		stack.printElements();
		
		stack.push("Heber");
		stack.printElements();
		
		stack.push("Sara");
		stack.printElements();
		
		stack.push("Raquel");
		stack.printElements();
		
		stack.push("Pamela");
		stack.printElements();
		
		stack.push("Samuel");
		stack.printElements();
		
		stack.push("Junior");
		stack.printElements();
		
		stack.push("Camila");
		stack.printElements();
		
		stack.push("Sofia");
		stack.printElements();
		
		stack.push("Ana");
		stack.printElements();
		
		stack.push("Gabriel");
		stack.printElements();
		
		stack.push("Last");
		stack.printElements();
		
		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();

		stack.pop();
		stack.printElements();
		
		
	}

}
