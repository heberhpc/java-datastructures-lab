/**/

package datastructures.list;

public class SNode <T>{

	//FIELDS
	private T element;
	private SNode <T> next;
	
	//MAIN CONSTRUCTOR
	public SNode (T element) {
		this.element = element;
		next = null;
	}
	
	//METHODS
	//
	public SNode <T> getNext() {
		return next;
	}
	
	//
	public void setNext(SNode<T> n) {
		this.next = n;
	}
	
	//
	public T getElement() {
		return element;
	}
}