/**/

package datastructureslab.list;


public interface List <E>{

	/*Get how many elements the list hold*/
	int getSize();
	
	//--ADD OPERATION
	/*Add a element at first position*/
	boolean addFirst(E element);
	
	/*Add a element at last position (index origin=0)*/
	boolean addLast(E element) ;
	
	//Add a element at a specific position (index origin=0)
	boolean addAt(E element, int index) throws IndexOutOfBoundsException;
	
	//--RETRIEVE OPERATION
	/*Return but do not remove, the first element*/
	E getFirst()  throws IndexOutOfBoundsException;
	
	/*Return but do not remove, the last element*/
	E getLast()  throws IndexOutOfBoundsException;
	
	/*Return but do not remove, a element at specific position*/
	E getAt(int index) throws IndexOutOfBoundsException;
	
	//--REMOVE OPERATION
	/*Remove and return, the first element*/
	E removeFirst() throws IndexOutOfBoundsException; 
	
	/*Remove and return the last element*/
	E removeLast()  throws IndexOutOfBoundsException;
	
	/*Remove and retunr a element at specific position*/
	E removeAt(int index) throws IndexOutOfBoundsException;
	
	//PRINT ALL EMELENTS (FOR TEST)
	void printElements();
}