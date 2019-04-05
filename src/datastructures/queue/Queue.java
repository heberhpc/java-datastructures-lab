/**/

package datastructures.queue;

import java.util.NoSuchElementException;


public interface Queue<E>{

	/**
	 * Add a element at end of queue.
	 * @param e is the element to be added.
	 * @return true or false if the operation was done correctly.
	 * 
	 */
	boolean enqueue(E e);


	/**
	 * Remove and return the first element of the queue.
	 * @return the removed element. If is a empty list return null.
	 */
	E dequeue();
	
	
	/**
	 * Get, but DO NOT REMOVE the first element of the queue.
	 * @return the first element of the queue. If is a empty list return null.
	 */
	E getFirst();

	
	/**
	 * Return how many elements are in the queue.
	 * @return an integer value.
	 */
	int size();


	/**
	 * Return if the list is empty or not.
	 * @return true if the list is empty and false if there is at least one element.
	 */
	boolean isEmpty();
	
	
	/**
	 * Print all Elements in the queue from front --> back
	 */
	public void printElements();
	

}