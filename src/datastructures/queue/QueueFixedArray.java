package datastructures.queue;

import java.util.NoSuchElementException;

public class QueueFixedArray<E> implements Queue<E>{
	
	//array to store elements.
	private E[] data;
	
	//default array size.
	private static final int defaultSize = 20;
	
	//to track index from back and front of the queue (circularly reference).
	private int frontQueueIndex = 0;
	
	//how many elements are in the queue.
	private int size = 0;
	
	
	//CONSTRUCTORS
	/**
	 * Default Constructor
	 * Uses the default size for create the queue (default 20).
	 */
	public QueueFixedArray() {
		this(defaultSize);
	}
	
	
	/**
	 * Constructor that allow user to specifies the array size.
	 * @param size is the maximum elements to be stored.
	 */
	@SuppressWarnings("unchecked")
	public QueueFixedArray(int size) {
		
		//create the array that will store the elements.
		data = (E[]) (new Object[size]);
		
	}
	
	
	@Override
	public boolean enqueue(E e) {
		
		if (size == data.length) {
			System.out.println("The Queue is Full: Queue Size: "+size);
			return false;
		}
		
		//find the correct index for enqueue.
		int f = (frontQueueIndex+size)%data.length;
		size++;
		
		//add the element at this index.
		data[f]=e;
		return true;
	}

	
	@Override
	public E dequeue(){
		
		if (isEmpty()) {
			System.out.println("null - Empty Queue");
			return null;
		}
		
		//get the front element
		E temp = data[frontQueueIndex];
		data[frontQueueIndex] = null;
		
		//update size
		size--;
		
		frontQueueIndex = (frontQueueIndex+1)%data.length;

		return temp;
	}

	
	@Override
	public E getFirst() {
		if (isEmpty()) {
			System.out.println("null - Empty Queue");
			return null;
		}else {
			return data[frontQueueIndex];
		}
	}

	
	@Override
	public int size() {
		return size;
	}

	
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	public void printElements() {
		
		System.out.println("Print Elements - Start");
		
		
		for (int i = 0 ; i < data.length ; i ++) {
			
			
			
			System.out.println("data["+i+"]:"+data[i]);
			
		}
		
		System.out.println("Print Elements - Stop");
	}
}