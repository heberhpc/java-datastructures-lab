/*
*
*@author	Heber H. P. Coutinho
*@email		heberhpc@gmail.com
*
*/

package datastructures.list;

public class DNode<T> {

	//FIELDS
	private T element;
	private DNode<T> next;
	private DNode<T> prev;
		
	
	//MAIN CONSTRUCTOR
	/**
	 * @param element is the object element to be inserted
	 */
	public DNode (T element){
		this.element = element;
		this.next=null;
		this.prev=null;
	}
	
	//
	
	/** 
	 * @return the element stored (reference)
	 */
	public T getElement() {
		return element;
	}
	
	//
	/**
	 * @return the previous linked node (reference)
	 */
	public DNode<T> getPrev() {
		return prev;
	}
	
	//
	/**
	 * @param s take a node and setup it as previous node
	 */
	public void setPrev(DNode<T> s){
		prev = s;
	}
	
	//
	/**
	 * @return the next linked node (reference)
	 */
	public DNode<T> getNext(){
		return next;
	}
	
	//
	/**
	 * @param s takes a node and setup it as next linked node
	 */
	public void setNext(DNode<T> s){
		next=s;
	}
}