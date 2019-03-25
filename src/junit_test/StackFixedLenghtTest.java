package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastructures.stack.Stack;
import datastructures.stack.StackFixedLenght;


class StackFixedLenghtTest {
	
	Stack<String> emptyStack;
	
	
	Stack<String> shortStack;

	
	Stack<String> longStack;

	
	@BeforeEach
	void setUp() throws Exception {
		
		//empty
		emptyStack = new StackFixedLenght<String>(10);
		
		//one item
		shortStack = new StackFixedLenght<String>(10);
		shortStack.push("One");
		
		//many items
		longStack = new StackFixedLenght<String>(10);
		longStack.push("One");
		longStack.push("Two");
		longStack.push("Three");
		longStack.push("Four");
		longStack.push("Five");
		
	}


	@Test
	void testPush() {
		
		//
		assertEquals(emptyStack.pop(), null);
		assertEquals(emptyStack.size(), 0);
		emptyStack.push("One");
		assertEquals(emptyStack.size(), 1);
		assertEquals(emptyStack.pop(), "One");
		assertEquals(emptyStack.size(), 0);
		
		//
		assertEquals(shortStack.size(), 1);
		shortStack.push("One");
		assertEquals(shortStack.size(), 2);
		assertEquals(shortStack.pop(), "One");
		assertEquals(shortStack.size(), 1);

		//
		assertEquals(longStack.size(), 5);
		longStack.push("One");
		longStack.push("Two");
		longStack.push("Three");
		longStack.push("Four");
		longStack.push("Five");
		assertEquals(longStack.size(), 10);
		
	}

	@Test
	void testPop() {
		
		//empty
		assertEquals(emptyStack.size(), 0);
		assertEquals(emptyStack.pop(), null);
		assertEquals(emptyStack.size(), 0);
		
		//short
		assertEquals(shortStack.size(), 1);
		assertEquals(shortStack.pop(), "One") ;
		assertEquals(shortStack.size(), 0);
		assertEquals(shortStack.pop(), null) ;
		
		//long
		assertEquals(longStack.size(), 5);
		assertEquals(longStack.pop(), "Five");
		assertEquals(longStack.size(), 4);
		assertEquals(longStack.pop(), "Four");
		assertEquals(longStack.size(), 3);
		assertEquals(longStack.pop(), "Three");
		assertEquals(longStack.size(), 2);
		assertEquals(longStack.pop(), "Two");
		assertEquals(longStack.size(), 1);
		assertEquals(longStack.pop(), "One") ;
		assertEquals(longStack.size(), 0);
		assertEquals(longStack.pop(), null) ;
	}

	@Test
	void testSize() {
		//empty
		assertEquals(emptyStack.size(), 0);
		emptyStack.pop();
		assertEquals(emptyStack.size(), 0);
		emptyStack.push("ONE");
		assertEquals(emptyStack.size(), 1);
		
		//short
		assertEquals(shortStack.size(), 1);
		shortStack.pop();
		assertEquals(shortStack.size(), 0);
		shortStack.pop();
		assertEquals(shortStack.size(), 0);
		
		//long
		assertEquals(longStack.size(), 5);
		longStack.pop();
		assertEquals(longStack.size(), 4);
		longStack.pop();
		assertEquals(longStack.size(), 3);
		longStack.pop();
		assertEquals(longStack.size(), 2);
		longStack.pop();
		assertEquals(longStack.size(), 1);
		longStack.pop();
		assertEquals(longStack.size(), 0);
		longStack.pop();
		assertEquals(longStack.size(), 0);
		longStack.push("ONE");
		assertEquals(longStack.size(), 1);
	}

	@Test
	void testTop() {
		//empty
		assertEquals(emptyStack.size(), 0);
		assertEquals(emptyStack.top(), null);
		
		
		//short
		assertEquals(shortStack.top(), "One");
		shortStack.pop();
		assertEquals(shortStack.top(), null);
		
		//long
		assertEquals(longStack.top(), "Five");
		longStack.pop();
		assertEquals(longStack.top(), "Four");
		longStack.pop();
		assertEquals(longStack.top(), "Three");
		longStack.pop();
		assertEquals(longStack.top(), "Two");
		longStack.pop();
		assertEquals(longStack.top(), "One");
		longStack.pop();
		assertEquals(longStack.top(), null);
	}

	@Test
	void testIsEmpty() {
		
		//empty
		assertEquals(emptyStack.isEmpty(), true);
		emptyStack.push("Heber");
		assertEquals(emptyStack.isEmpty(), false);
		
		//short
		assertEquals(shortStack.isEmpty(), false);
		shortStack.pop();
		assertEquals(shortStack.isEmpty(), true);
		
		//large
		assertEquals(longStack.isEmpty(), false);
		System.out.println(longStack.top());
		longStack.pop();
		System.out.println(longStack.top());
		longStack.pop();
		System.out.println(longStack.top());
		longStack.pop();
		System.out.println(longStack.top());
		longStack.pop();
		System.out.println(longStack.top());
		longStack.pop();
		System.out.println(longStack.top());
		assertEquals(longStack.isEmpty(), true);
	}
}
