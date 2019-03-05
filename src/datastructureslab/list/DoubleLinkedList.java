package datastructureslab.list;



public class DoubleLinkedList<E> extends AbstractList<E> {
	
	//FIELDS
	private int size;
	
	private DNode<E> head;
	private DNode<E> tail;
	
	
	//MAIN CONSTRUCTOR
	public DoubleLinkedList() {
		
		//Create Sentinel's Nodes
		head=new DNode<E>(null);
		tail=new DNode<E>(null);
		
		//update references
		head.setPrev(null);
		head.setNext(tail);
		tail.setPrev(head);
		tail.setNext(null);
		
		//update size
		size=0;
	}


	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean addAt(E element, int index) throws IndexOutOfBoundsException {
		
		//is a valid index:
		if ((index < 0) || (index > size)){
			throw new IndexOutOfBoundsException ("Invalid Index: "+index);
		}
		
		//is a null element?
		if (element == null) {
			System.out.println("Invalid Element = NULL");
			return false;
		}
		
		
		//add operation
		//Create a element node to add
		DNode<E> n = new DNode<E>(element);
		
		
		//find nodes before and after
		DNode<E> before=head;
		for (int i = 0 ; i < index ; i ++) {
			before=before.getNext();
		}
		DNode<E> after = before.getNext();
		
		//update references
		before.setNext(n);
		n.setPrev(before);
		after.setPrev(n);
		n.setNext(after);
		
		//update size
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
		DNode<E> target = head.getNext();
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
		
		//find Nodes (After and Before)
		DNode<E> before = head;
		for (int i = 0 ; i < index ; i ++) {
			before = before.getNext();
		}
		DNode<E> target = before.getNext();
		DNode<E> after = target.getNext();
		
		//update references
		before.setNext(after);
		after.setPrev(before);
		
		//update size
		size--;
		
		return target.getElement();
	}

	@Override
	public void printElements() {
		System.out.println("---start---");
		System.out.println("Print All Elements");
		
		DNode<E> s = head;
		for (int i = 0 ; i < size ; i++) {
			s=s.getNext();
			System.out.println("index "+i+ ": " + s.getElement() );
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");
	}
}
