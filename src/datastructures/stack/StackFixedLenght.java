package datastructures.stack;

public class StackFixedLenght<E> implements Stack<E> {

	private E[] data;
	private int size;
	
	
	//CONTRUCTORS
	@SuppressWarnings("unchecked")
	public StackFixedLenght(int stackSize) {
		data = (E[]) (new Object[stackSize]);
	}
	
	
	@Override
	public boolean push(E e) {
		
		//there is space for another element?
		if(size == data.length) {
			//no: there is no more space
			System.out.println("No more space");
			return false;
		}else {
			//yes: there is space
			data[size]=e;
			size++;
			return true;
		}
	}

	@Override
	public E pop() {
		if (this.isEmpty()) {
			return null;
		}else {
			E temp = data [size-1];
			data[size-1]=null;
			size--;
			return temp;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E top() {
		if (this.isEmpty()) {
			return null;
		}else {
			return data [size-1];
		}
	}

	@Override
	public boolean isEmpty() {
		if (size==0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void printElements() {
		System.out.println("Print Elements - Start");
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println("Slot "+i+" : "+data[i]);
		}
		System.out.println("Print Elements - End");
	}
}
