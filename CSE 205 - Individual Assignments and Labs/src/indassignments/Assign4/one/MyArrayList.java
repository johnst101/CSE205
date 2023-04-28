package indassignments.Assign4.one;
import java.util.NoSuchElementException;

//Complete the implementation of your MyArrayList class in this file

public class MyArrayList implements MyList {
 // Implement the required fields and methods here
	private int capacity;
	private int size;
	private Object[] storage;
	
	public MyArrayList() {
		capacity = 8;
		size = 0;
		storage = new Object[8];
	}
	
	public void addToEnd(Object obj) {
		if (size == capacity) {
			makeCapacity(capacity * 2);
			storage[size] = obj;
			++size;
		}
		else {
			storage[size] = obj;
			++size;
		}
	}
	
	public void insertAt(int index, Object obj) throws NoSuchElementException {
		if ((index < 0) || (index > size)) {
			throw new NoSuchElementException();
		}
		if (size == capacity) {
			makeCapacity(capacity * 2);
			for (int i = size - 1; i >= index; --i) {
				storage[i + 1] = storage[i];
			}
			storage[index] = obj;
			++size;
		}
		else {
			for (int i = size - 1; i >= index; --i) {
				storage[i + 1] = storage[i];
			}
			storage[index] = obj;
			++size;
		}	
	}
	
	public void removeAt(int index) throws NoSuchElementException {
		if ((index < 0) || (index >= size)) {
			throw new NoSuchElementException();
		}
		for (int i = index; i < size; ++i) {
			storage[i] = storage[i + 1];
		}
		--size;
	}
	
	public Object getAt(int index) throws NoSuchElementException {
		if ((index < 0) || (index >= size)) {
			throw new NoSuchElementException();
		}
		return storage[index];
	}
	
	public int getSize() {
		return size;
	}
	
	public void makeCapacity(int minCapacity) {
		if ((minCapacity < size) || (minCapacity == capacity)) {
		}
		else {
			if (minCapacity > 8) {
				capacity = minCapacity;
				Object[] newArr = new Object[minCapacity];
				for (int i = 0; i < size; ++i) {
					newArr[i] = storage[i];
				}
				storage = newArr;
			}
			else {
				capacity = 8;
				Object[] newArr = new Object[capacity];
				for (int i = 0; i < size; ++i) {
					newArr[i] = storage[i];
				}
				storage = newArr;
			}
		}
	}
	
	public void trimExcess() {
		makeCapacity(size);
	}
	
// Do not alter the code below 
	@Override
	public MyListIterator getIterator() {
	return new MyArrayListIterator();
	}
	 
	private class MyArrayListIterator implements MyListIterator {
		int currentIndex = -1;
		
		@Override
		public Object next() {
			++currentIndex;
			return storage[currentIndex];
		}
		
		@Override
		public boolean hasNext() {
			return currentIndex < size - 1;
		}
	}   
}