/**/

package datastructureslab.list;


public class SingleLinkedList <E> extends AbstractList <E>{
	
	//FIELDS
	//Track how many elements there are.
	private int size;
	
	//Sentinels.
	private SNode<E> head;
	private SNode<E> tail;
	
	
	//MAIN CONSTRUCTOR
	public SingleLinkedList () {

		//create SNode Sentinels
		head = new SNode<E>(null);
		tail = new SNode<E>(null);
		
		//update Sentinels's references
		head.setNext(tail);
		tail.setNext(null);
		
		//set size
		size = 0;
	}
	
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean addAt(E element, int index) throws IndexOutOfBoundsException {
				
		//is a valid index?
		if ((index < 0) || (index > size)){
			//not valid index:
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		
		// is a null value?
		}else if  (element == null){
			//yes: is null:
			System.out.println("Invalid Entry : NULL value");
			return false;
		
		// is a valid index AND is not null:
		}else {
			//yes, valid index:
			
			//create a new node
			SNode<E> s = new SNode<E>(element);
			
			// find right place (before and after nodes)
			SNode<E> before = head;
			SNode<E> after;
			for (int i = 0 ; i < index ; i++) {
				before=before.getNext();
			}
			after=before.getNext();
			
			//update references
			before.setNext(s);
			s.setNext(after);
			
			//update size
			size++;
			
			return true;
		}
	}

	@Override
	public E getAt(int index) throws IndexOutOfBoundsException {
		
		//is a empty list
		if (size==0) {
			throw new IndexOutOfBoundsException("Empty List - index :"+index);
		}
		
		//is a valid index
		if ((index < 0) || (index > size-1)){
			//not valid index:
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		//get operation
		SNode<E> target = head.getNext();
		for(int i = 0 ; i < index ; i++) {
			target=target.getNext();
		}
		return target.getElement();
		
	}

	@Override
	public E removeAt(int index) throws IndexOutOfBoundsException {
		//VERIFICATIONS
		//is a empty list?
		if (size==0){
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		//is a valid index?
		if ((index < 0) || (index >= size)){
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		//REMOVE OPEARTION
		//find right position (before and after nodes)
		SNode<E> before = head;
		SNode<E> target;
		SNode<E> after;
			
		for (int i = 0 ; i < index ; i++) {
			before=before.getNext();
		}
		
		target=before.getNext();
		after=target.getNext();
		
		//update references
		before.setNext(after);
		
		//update size
		size--;
			
		return target.getElement();
	}

	//INNER CLASS - BEGINNIG
	private class SNode <T>{
		
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
	}//INNER CLASS - END

	@Override
	public void printElements() {
		System.out.println("---start---");
		System.out.println("Print All Elements");
		
		SNode<E> s = head;
		for (int i = 0 ; i < size ; i++) {
			s=s.getNext();
			System.out.println("index "+i+ ": " + s.getElement() );
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");
	}
}