/**/

package datastructureslab.list;

public class DNode<T> {

	//FIELDS
	private T element;
	private DNode<T> next;
	private DNode<T> prev;
		
	
	//MAIN CONSTRUCTOR
	public DNode (T element){
		this.element = element;
		this.next=null;
		this.prev=null;
	}
	
	//METHODS
	//
	public T getElement() {
		return element;
	}
	
	//
	public DNode<T> getPrev() {
		return prev;
	}
	
	//
	public void setPrev(DNode<T> s){
		prev = s;
	}
	
	//
	public DNode<T> getNext(){
		return next;
	}
	
	//
	public void setNext(DNode<T> s){
		next=s;
	}
}