/*
*
*@author	Heber H. P. Coutinho
*@email		heberhpc@gmail.com
*
*/

package datastructureslab.list;

public abstract class AbstractList <E> implements List <E>{

	//returns how many elements the list contains
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#getSize()
	 */
	public abstract int getSize();
	
	
	//---ADD OPERATIONS---//

	//add a element at first position
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#addFirst(java.lang.Object)
	 */
	public boolean addFirst(E element) {
		return addAt(element, 0);
	}
	
	//Add a element at last position (index origin=0)
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#addLast(java.lang.Object)
	 */
	public boolean addLast(E element) {
		return addAt(element, this.getSize());
	}
	
	//Add a element at a specific position (index origin=0)
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#addAt(java.lang.Object, int)
	 */
	public abstract boolean addAt(E element, int index) throws IndexOutOfBoundsException;
	
	
	//--RETRIEVE OPERATION
	
	//Return but do not remove, the first element
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#getFirst()
	 */
	public E getFirst()  throws IndexOutOfBoundsException{
		return getAt(0);
	}
	
	//Return but do not remove, the last element	
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#getLast()
	 */
	public E getLast()  throws IndexOutOfBoundsException{
		return getAt(this.getSize()-1);
	}
	
	//Return but do not remove, a element at specific position
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#getAt(int)
	 */
	public abstract E getAt(int index) throws IndexOutOfBoundsException;
	
	
	//---REMOVE OPERATION---//
	
	//Remove and return, the first element
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#removeFirst()
	 */
	public E removeFirst() throws IndexOutOfBoundsException{
		return removeAt(0);
	}
	
	//Remove and return the last element
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#removeLast()
	 */
	public E removeLast()  throws IndexOutOfBoundsException{
		return removeAt(this.getSize()-1);
	}
	
	//Remove and return a element at specific position
	/* (non-Javadoc)
	 * @see datastructureslab.list.List#removeAt(int)
	 */
	public abstract E removeAt(int index) throws IndexOutOfBoundsException;
}