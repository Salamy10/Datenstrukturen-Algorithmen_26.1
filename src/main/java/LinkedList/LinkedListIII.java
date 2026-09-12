package LinkedList;

public class LinkedListIII<E> {
	
	public class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node<E> head;
	
	public LinkedListIII() {
		head = null;
	}
	
	public int size() {
		int count = 0;
		
		Node<E> current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public boolean contains(int value) {
		if(head == null) {
			return false;
		}
		
		Node<E> current = head;
		
		while(current != null) {
			if(current.data.equals(value)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void addFirst(E value) {
		Node<E> NewNode = new Node<>(value);
		NewNode.next = head;
		head = NewNode;
	}
	
	public void addLast(E value) {
		Node<E> newNode = new Node<>(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node<E> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public boolean isMiddle(int value) {
		if(head == null) {
			return false;
		}
		
		Node<E> slow = head;
		Node<E> fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data.equals(value);
	}
	
	public E getMiddle() {
		if(head == null) {
			return null;
		}
		
		Node<E> slow = head;
		Node<E> fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}