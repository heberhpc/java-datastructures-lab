package datastructureslab.list;



public class CircularyDynamicArrayList <E> extends AbstractCircularyList<E>{
	
	//FIELDS
	private int size;
	
	private E [] data;
	
	private int startSize=10;
	private int resizeFactor = 2;
	
	//MAIN CONSTRUCTOR
	@SuppressWarnings("unchecked")
	public CircularyDynamicArrayList() {	
		data = (E[]) (new Object[startSize]); 
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
		
		//there is space for another element
		if (data.length>size) {
			//yes: do nothing
		}else {
			resizeUp();
		}

		//add operation
		int a = size;
		while(a > index) {
			
			data[a]=data[a-1];
			//System.out.println("data[a]="+a+" // data[a-1]="+(a-1));
			a--;
		}
		data[a]=element;
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
		
		return data[index];
	}

	@Override
	public E removeAt(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		//VERIFICATIONS
		//is a empty list?
		if (size==0){
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		//is a valid index?
		if ((index < 0) || (index >= size)){
			throw new IndexOutOfBoundsException("Invalid Index :"+index);
		}
		
		E target = data[index];
		
		int a=index;
		while(a < size) {
			
			data[a]=data[a+1];
			//System.out.println("data[a]="+a+" // data[a-1]="+(a-1));
			a++;
		}		
		size--;
		
		
		
		return target;
	}

	@Override
	public void printElements() {

		System.out.println("---start---");
		System.out.println("Print All Elements");
		
		for (int i = 0 ; i < size ; i++) {
			
			System.out.println("index "+i+ ": " + data[i] );
		}
		
		System.out.println ("Total of : "+size+" elements");
		System.out.println("---end---");
		
	}
	
	//HELPER METHODS
	@SuppressWarnings("unchecked")
	private void resizeUp() {
		
		int updatedSize = data.length*resizeFactor; 
		E [] resizedData = (E[]) (new Object[updatedSize]);
		
		System.out.println("RESIZEUPbefore");
		
		for (int i = 0 ; i < 10 ;i++) {
			resizedData[i]=data[i];
			System.out.println("inside");
		}
		
		System.out.println("RESIZEUP");
	}

	@Override
	public boolean rotate() {
		// TODO Auto-generated method stub
		
		if(size==0) {
			System.out.println("[INFOR]: Empty List - Impossible Rotatation");
			return false;
		
		}else {
			E [] copy = (E[]) (data.clone());
			
			for(int i = 0 ; i < size-1; i++) {
				data[i]=copy[i+1];
				
			}
			//SHIFT THE FIRST
			data[size-1]=copy[0];
			
			return true;
		}	
	}
}
