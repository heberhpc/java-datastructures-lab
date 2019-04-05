/*
*
*@author	Heber H. P. Coutinho
*@email		heberhpc@gmail.com
*
*/

package datastructures.list;

public interface CircularlyList<E> extends List<E>{
	
	//shift the items 1 position
	boolean rotate();
}

