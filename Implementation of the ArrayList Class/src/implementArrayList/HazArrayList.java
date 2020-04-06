package implementArrayList;

import java.util.Arrays;

//This class implements some of the methods of the Java ArrayList class

public class HazArrayList<E> {
//	Data fields --> the default initial capacity
	private static final int INITIAL_CAPACITY = 10;
	
//	The underlying data array
	private E[] theData;
	
//	The currrent size
	private int size = 0;
	
//	The current capacity
	private int capacity = 0;

//	Constructor
	public HazArrayList() {
		capacity = INITIAL_CAPACITY;
		theData = (E[]) new Object[capacity];
	}
	
	
//	Override the toString method in the Arraylist
	@Override
	public String toString() {
		String result = "[" + theData[0];
		for(int i = 1; i < size; i++) {
			result += ", " + theData[i];
		}
		result += "]";
		
		return result;
	}
	
	
//	Implementing the HazArrayList.add(E)
	public void add(E anEntry) {
		//Check bounds
		if(size < capacity) {
			theData[size] = anEntry;
			size++;
		} else
			theData[size] = anEntry;
			reallocate();
	}
	
	
	
//	Implementing HazArrayList.add(index, E)
	public void add(int index, E anEntry) {
		//Check bounds
		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		//Make sure there is room
		if(size >= capacity) {
			reallocate();
		}
		
		
		//shift data
		for(int i = size; i > index; i--) {
			theData[i] = theData[i-1];
		}
		
		//Insert item
		theData[index] = anEntry;
		size++;
	}
	
	
//	Implement the get Method
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return theData[index];
	}
	
	
//	Implement the set Method
	public E set(int index, E newValue) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E oldValue = theData[index];
		theData[index] = newValue;
		
		return oldValue;
	}
	
	
//	Implement the remove Method
	public E remove(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E returnValue = theData[index];
		
		for(int i = index + 1; i < size; i++){
			theData[i-1] = theData[i];
		}
		
		size--;
		return returnValue;
	}
	
	
//	Implement the reallocate Method
	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}
	
//	return the size of the Array
	public int size() {
		return this.size;
	}
	
//	Implement the indexOf method
	public int indexOf(E value) {
		if (value == null) {
	         for (int i = 0; i < size; i++)
	             if (theData[i]==null)
	                 return i;
	     } else {
	         for (int i = 0; i < size; i++)
	             if (value.equals(theData[i]))
	                 return i;
	     }
	     return -1;
	}

	
}
