package datastructureslab.list;

public class DynamicArrayList <E> extends AbstractList<E>{
	
	//FIELDS
	private int size;
	
	private E [] data;
	
	private int startSize;
	private int resizeFactor = 2;
	
	//MAIN CONSTRUCTOR
	@SuppressWarnings("unchecked")
	public DynamicArrayList() {
		
		data = (E[]) (new Object[startSize]); 
		size=0;
		
	}
	
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean addAt(E element, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
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
		while()
		
		return false;
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

	@Override
	public void printElements() {
		// TODO Auto-generated method stub
		
	}
	
	//HELPER METHODS
	@SuppressWarnings("unchecked")
	private void resizeUp() {
		
		int updatedSize = data.length*resizeFactor; 
		E [] resizedData = (E[]) (new Object[updatedSize]);
		
		for (int i = 0 ; i < data.length ;i++) {
			resizedData[i]=data[i];
		}
		
		System.out.println("ResizedUp");
	}
	
}
