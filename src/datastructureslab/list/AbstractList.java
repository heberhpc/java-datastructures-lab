/**/

package datastructureslab.list;



public abstract class AbstractList <E> implements List <E>{


	/*Get how many elements the list hold*/
	public abstract int getSize();
	
	//--ADD OPERATION
	/*Add a element at first position*/
	public boolean addFirst(E element) {
		return addAt(element, 0);
	}
	
	/*Add a element at last position (index origin=0)*/
	public boolean addLast(E element) {
		return addAt(element, this.getSize());
	}
	
	//Add a element at a specific position (index origin=0)
	public abstract boolean addAt(E element, int index) throws IndexOutOfBoundsException;
	
	//--RETRIEVE OPERATION
	/*Return but do not remove, the first element*/
	public E getFirst()  throws IndexOutOfBoundsException{
		return getAt(0);
	}
	
	/*Return but do not remove, the last element*/
	public E getLast()  throws IndexOutOfBoundsException{
		return getAt(this.getSize()-1);
	}
	
	/*Return but do not remove, a element at specific position*/
	public abstract E getAt(int index) throws IndexOutOfBoundsException;
	
	//--REMOVE OPERATION
	/*Remove and return, the first element*/
	public E removeFirst() throws IndexOutOfBoundsException{
		return removeAt(0);
	}
	
	/*Remove and return the last element*/
	public E removeLast()  throws IndexOutOfBoundsException{
		return removeAt(this.getSize()-1);
	}
	
	/*Remove and retunr a element at specific position*/
	public abstract E removeAt(int index) throws IndexOutOfBoundsException;
}