/**/

package datastructureslab.list;



public class SingleLinkedList <E> extends AbstractList <E>{
	
	//FIELDS
	//Track how many elements there are.
	private int size;
	
	//Head Sentinel.
	private SNode <E> head;
	
	
	
	//MAIN CONSTRUCTOR
	public SingleLinkedList () {
		
		//set size
		size = 0;
		
		//create a SNode Sentinel 
		head = new SNode <E> (null);
		//head point to itself = empty list
		head.setNext(head);
		
	}
	
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean addAt(E element, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		//is a valid index
		if ((index < 0) || (index > size)){
			//no 
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		// is a empty list or not?
		if (size == 0) {
			//yes: emptylist
			
			//create a new node and insert at beginnig
			SNode<E> s = new SNode<E>(element);
			
			//update references
			s.setNext(head);
			head.setNext(s);
			
			//update size
			size++;
			
			return true;
			
		}else {
			
			//create a new node
			SNode<E> s = new SNode<E>(element);
			
			//find the right position
			SNode <E>before = head; // index-1
			SNode <E>after;  // index+1
			for (int i = 0 ; i < index ; i ++) {
				before=before.getNext();
			}
			after = before.getNext();
			
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeAt(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	//INNER CLASS - BEGINNIG
	private class SNode <T>{
		
		//The element that SNode holds
		private T element;
		
		//The next SNode of the chain
		private SNode <T> next;
		
		//MAIN CONSTRUCTOR
		public SNode (T element) {
			this.element = element;
			next = null;
		}
		
		
		public SNode <T> getNext() {
			return next;
		}
		
		public void setNext(SNode <T>n) {
			this.next = n;
		}
		
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
			System.out.println("index :"+i+ "-" + s.getElement() );
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");
		// TODO Auto-generated method stub
		
	}
}