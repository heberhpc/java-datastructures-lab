package datastructureslab.list;

public class CircularyDoubleLinkedList <E> extends AbstractCircularyList<E>{

	//FIELDS
	private DNode<E> head;
	private DNode<E> tail;
	private int size;
	
	//CONSTRUCTOR
	public CircularyDoubleLinkedList() {
		head=null;
		tail=null;
		size=0;
	}
	
	
	//INHERITED METHOD
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

	@Override
	public void printElements() {
		
		System.out.println("---start---");
		System.out.println("Print All Elements");
		
		DNode<E> s = head;
		for (int i = 0 ; i < size ; i++) {
			System.out.println("index "+i+ ": " + s.getElement() );
			s=s.getNext();
			
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");			
		
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
		}
		
		// is a null value?
		if  (element == null){
			//yes: is null:
			System.out.println("Invalid Entry : NULL value");
			return false;
		}
		
		// is a valid index AND is not null:
		//ADD OPERATION
		
		//create the new node
		DNode<E> n = new DNode<E>(element);
		
		//references
		DNode<E> before;
		DNode<E> after;
		
		//is a empty list:
		if(size==0) {
			
			n.setNext(n);
			n.setPrev(n);
			head=n;
			tail=n;
						
			size++;
			
			return true;
		//is a addition at head?
		}else if (index==0) {
			
			head.setPrev(n);
			n.setNext(head);
			n.setPrev(tail);
			tail.setNext(n);
			head=n;
			
			size++;
			
			return true;
		//is a addition at tail?
		}else if (index == size-1) {
			
			tail.setNext(n);
			n.setPrev(tail);
			n.setNext(head);
			head.setPrev(n);
			tail=n;
			
			size++;
			
			return true;
			
		}
		
		//finding references
		before=head;
		for (int i = 0 ; i < index-1 ; i ++) {
			before=before.getNext();
		}
		after=before.getNext();
		
		//update references
		after.setPrev(n);
		n.setNext(after);
		before.setNext(n);
		n.setPrev(before);
		
		size++;
		
		return true;
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
		DNode<E> target = head;
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
		
		DNode<E> before;
		DNode<E> target;
		DNode<E> after;
		
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
			head=head.getNext();
			tail.setNext(head);
			head.setPrev(tail);
			
			size--;
			
			return target.getElement();
		
		//it's a removal at tail?
		}else if (index == size-1) {
		
			target=tail;
			tail=tail.getPrev();
			head.setPrev(tail);
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
			after.setPrev(before);
			
			size--;
			
			return target.getElement();
		}		
	}
}
