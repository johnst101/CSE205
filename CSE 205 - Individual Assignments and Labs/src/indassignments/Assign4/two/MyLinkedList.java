package indassignments.Assign4.two;
import java.util.NoSuchElementException;

//Complete the implementation of your MyLinkedList class in this file


public class MyLinkedList implements MyList {
 // Implement the required fields and methods here
	private Node head;
	private int size;
	
	public MyLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addToEnd(Object obj) {
		Node newNode = new Node();
	    newNode.data = obj;
		
	    if (head == null) {
	        head = newNode;
	    } else {
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	    
	    size++;
	}
	
	public void insertAt(int index, Object obj) throws NoSuchElementException {
		if ((index < 0) || (index > size)) {
			throw new NoSuchElementException();
		}
		
		Node newNode = new Node();
		newNode.data = obj;
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node current = head;
			for (int i = 0; i < index - 1; ++i) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
		size++;
	}
	
	public void removeAt(int index) throws NoSuchElementException {
		if ((index < 0) || (index >= size)) {
			throw new NoSuchElementException();
		}
		
		if (index == 0) {
			head = head.next;
		}
		else {
			Node current = head;
			for (int i = 0; i < index - 1; ++i) {
				current = current.next;
			}
			current.next = current.next.next;
		}
		
		size--;
	}
	
	public Object getAt(int index) throws NoSuchElementException {
		if ((index < 0) || (index >= size)) {
			throw new NoSuchElementException();
		}
		
		Node current = head;
		for (int i = 0; i < index; ++i) {
			current = current.next;
		}
		
		return current.data;
	}
	
	public int getSize() {
		return size;
	}

	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}
}