package LinkedList;

public class LinkedList<E> {

    private Node<E> head;

    public LinkedList() {
        head = null;
    }

    /**
     * A) Gibt die Anzahl der Elemente zurück.
     */
    public int size() {
        // TODO: Implementieren

    	/*Lösung*/
    	int count = 0;
    	Node<E> current = head;
    	
    	while(current != null) {
    		count++;
    		current = current.next;
    	}
    	
        return count;
        
    }

    /**
     * B) Prüft, ob ein bestimmtes Element enthalten ist.
     */
    public boolean contains(E element) {
        // TODO: Implementieren

    	Node<E> current = head;
    	
    	/*Lösung*/
    	while(current != null) {
    		if (current.data.equals(element)){
    			return true;
    		}
    		
    		current = current.next;
    	}
    	return false;
    }

    /**
     * C) Fügt ein Element am Anfang ein.
     */
    public void addFirst(E element) {
        // TODO: Implementieren
    	
    	/*Lösung*/
    	Node<E> newNode = new Node<>(element);
    	
    	newNode.next = head;
    	head = newNode;
    	
    }

    /**
     * D) Fügt ein Element am Ende ein.
     */
    public void addLast(E element) {
        // TODO: Implementieren

    	Node<E> newNode = new Node<>(element);

    	/*Lösung*/
    	if (head == null) {
    		head = newNode;
    		return;
    	}
    	
    	Node<E> current = head;
    	
    	while (current.next != null) {
    		current = current.next;
    	}
    	
    	current.next = newNode;   	
    }

    /**
     * Hilfsmethode zum Ausgeben der Liste.
     */
    public void printList() {

        Node<E> current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
