/**
* A stack interface
* 
* @author Heber Coutinho (heberhpc@gmail.com)
*
*/


package datastructures.stack;


public interface Stack <E>{

	//---CORE FUNCTIONS---//

	/**
	* Add a element at the top of the stack
	* @param e is the element that will be inserted
	* @return true if the operation was sucessfully. But some cases, there is no 
	* more room for elements, then the list must return false (for fixed storage)
	*/
	boolean push(E e);

	/**
	* Remove and return the top element of the stack
	* Return null if there is no element
	*/
	E pop();


	//---ADDITONAL FUNCTIONS---/

	/**
	* Return the size. How many elements are in the stack
	*/
	int size();

	/**
	* Return, but do not remove, the element at the top of the stack
	* Returns null is the stack is empty.
	*/
	E top();

	/**
	* Returns false if there is at least one element in the stack,
	* Returns true is there is no elements.
	*/
	boolean isEmpty();
	
	/**
	 * Print all elements
	 */
	public void printElements();
	
}

