package datastructures.list;

public class CircularlySingleLinkedList <E> extends AbstractCircularlyList<E>{
	
	//FIELDS
	//head and tail SENTINELS
	private SNode<E> head;
	private SNode<E> tail;
	
	//size of the list
	private int size;
	
	//CONSTRUCTOR
	public CircularlySingleLinkedList () {
		
		head=null;
		tail=null;
		size=0;
		
	}
	
	/* (non-Javadoc)
	 * @see datastructureslab.list.CircularyList#rotate()
	 */
	@Override
	public boolean rotate() {

		if(size==0) {
			System.out.println("[INFOR]: Empty List - Impossible Rotatation");
			return false;
		}else {
			head=head.getNext();
			tail=tail.getNext();
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see datastructureslab.list.List#printElements()
	 */
	@Override
	public void printElements() {
		System.out.println("---start---");
		System.out.println("Print All Elements");
		
		SNode<E> s = head;
		for (int i = 0 ; i < size ; i++) {
			System.out.println("index "+i+ ": " + s.getElement() );
			s=s.getNext();
			
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");			
	}

	
	/* (non-Javadoc)
	 * @see datastructureslab.list.AbstractList#getSize()
	 */
	@Override
	public int getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see datastructureslab.list.AbstractList#addAt(java.lang.Object, int)
	 */
	@Override
	public boolean addAt(E element, int index) throws IndexOutOfBoundsException {
		
		//is a valid index?
		if ((index < 0) || (index > size)){
			//not valid index:
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		// is a null value?
		if  (element == null){
			//yes: is null:
			System.out.println("Invalid Entry : NULL value");
			return false;
		}
		
		// is a valid index AND is not null:
		
		//ADD OPERATION
		//is a empty List?
		if(size==0) {
			
			SNode<E> n = new SNode(element);
			head=n;
			tail=n;
			n.setNext(n);
			
			size++;
			
			return true;
			
		//is addition at head?
		}else if (index == 0 ) {
			
			SNode<E> n = new SNode(element);
			n.setNext(head);
			head=n;
			tail.setNext(head);
			
			size++;
			
			return true;
			
		//is a tail addition
		}else if (index == size-1) {
			
			SNode<E>before = head;
			for (int i = 0 ; i < index-1 ; i++ ) {
				before=before.getNext();
			}
			
			SNode<E> n = new SNode<E>(element);
			tail=n;
			before.setNext(n);
			n.setNext(head);
			
			size++;
			return true;
			
		//not a head or tail addition
		}else {
			
			SNode<E> n = new SNode<E>(element);
			
			SNode<E>before = head;
			for (int i = 0 ; i < index-1 ; i++ ) {
				before=before.getNext();
			}
			SNode<E>after = before.getNext();
			
			before.setNext(n);
			n.setNext(after);
			
			size++;
			
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see datastructureslab.list.AbstractList#getAt(int)
	 */
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
		SNode<E> target = head;
		for(int i = 0 ; i < index ; i++) {
			target=target.getNext();
		}
		return target.getElement();
	}

	/* (non-Javadoc)
	 * @see datastructureslab.list.AbstractList#removeAt(int)
	 */
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
		
		SNode<E> before;
		SNode<E> target;
		SNode<E> after;
		
		//the list has only 1 item?
		if (size==1) {
			
			target=head;
			head=null;
			tail=null;
			
			size--;
			
			return target.getElement();
		
		//it's a removal at head?
		}else if (index==0) {
			
			target=head;
			head=target.getNext();
			tail.setNext(head);
			
			size--;
			
			return target.getElement();
			
		//it's a removal at tail?
		}else if (index == size-1) {
			
			before=head;
			for (int i = 0 ; i < index-1 ; i++) {
				before=before.getNext();
			}
			target=before.getNext();
			tail=before;
			tail.setNext(head);
			
			size--;
			
			return target.getElement();
		}else {
			
			before=head;
			for (int i = 0 ; i < index-1 ; i++) {
				before=before.getNext();
			}
			target=before.getNext();
			after=target.getNext();
			before.setNext(after);
			
			size--;
			
			return target.getElement();
		}
	}
}
