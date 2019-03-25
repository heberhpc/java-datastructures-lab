package datastructures.stack;

import datastructures.list.List;
import datastructures.list.SingleLinkedList;

public class StackSLinkedList<E> implements Stack<E>{
	
	private List<E> stack;
	

	//CONSTRUCTOR//
	// always start with a emtpy stack
	public StackSLinkedList (){
		
		stack = new SingleLinkedList<E>();
	}
	
	@Override
	public boolean push(E e) {

		//use a single linked list as internal data.
		stack.addFirst(e);
		
		//in this implementation, there is always space for another element.
		//Always true.
		return true;
	}

	@Override
	public E pop() {
		
		//Is an empty stack?
		if (stack.getSize() == 0) {
			//yes:empty stack:
			return null;
	
		
		}else {
			//not an empty stack:
			
			//get the top element and remove.
			E target = stack.removeFirst();
			
			//return top element.
			return target;
		}
	}

	@Override
	public int size() {
		return stack.getSize();
	}

	@Override
	public E top() {
		//Is an empty stack?
		if (stack.getSize() == 0) {
			//yes:empty stack
			return null;
		
		}else {
			//not an empty stack..
			
			//get and return top element
			return stack.getFirst();
		}	
	}

	@Override
	public boolean isEmpty() {
		
		if (stack.getSize()==0) {
			return true;
		}else {
			return false;
		}
		
	}
		
	@Override
	public void printElements() {
		stack.printElements();
	}
}
