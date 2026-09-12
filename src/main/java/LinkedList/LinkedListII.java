package LinkedList;

public class LinkedListII<E> {
	
	public class Node<E>{
		
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node<E> head;
	
	public LinkedListII() {
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
	
	public boolean contains(E element) {
		Node<E> current = head;
		
		while(current != null) {
			if(current.data.equals(element)) {
				return true;
			}
			current = current.next;	
		}
		return false;
	}
	
	public void addFirst(E element) {
		Node<E> NewNode = new Node<>(element);
		NewNode.next = head;
		head = NewNode;
	}
	
	public void addLast(E element) {
		Node<E> NewNode = new Node<>(element);
		
		if(head == null){
			head = NewNode;
			return;
		}
		
		Node<E> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = NewNode;
	}
	
	//Unklare Aufgabenstellung
	//"Ist value = das Mittige element?"
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
	//"Was ist das Mittige element?"
	public E findMiddleElement(){
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