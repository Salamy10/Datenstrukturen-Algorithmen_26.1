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
        return 0;
    }

    /**
     * B) Prüft, ob ein bestimmtes Element enthalten ist.
     */
    public boolean contains(E element) {
        // TODO: Implementieren
        return false;
    }

    /**
     * C) Fügt ein Element am Anfang ein.
     */
    public void addFirst(E element) {
        // TODO: Implementieren
    }

    /**
     * D) Fügt ein Element am Ende ein.
     */
    public void addLast(E element) {
        // TODO: Implementieren
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
