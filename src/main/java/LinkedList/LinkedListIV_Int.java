package LinkedList;

public class LinkedListIV_Int {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	
	public LinkedListIV_Int() {
		head = null;
	}
	
	public int size() {
		int count = 0;
		
		Node current = head;
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
		
		Node current = head;
		
		while(current != null) {
			if(current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public void addFirst(int value) {
		Node NewNode = new Node(value);
		NewNode.next = head;
		head = NewNode;
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public boolean isMiddle(int value) {
		if(head == null) {
			return false;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data == value;
	}
	
	public Integer getMiddle() {
		if(head == null) {
			return null;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}