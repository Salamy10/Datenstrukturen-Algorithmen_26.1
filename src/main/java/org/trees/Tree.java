package org.trees;


public class Tree<E> {

    private Node<E> root;

    public Tree() {
        root = null;
    }

    public void add(E data) {
        if (root == null){
            root = new Node<>(data);
            return;
        }

        add(root, data);
    }

    public void add(Node<E> node ,E data) {
        // Knoten in den Baum einfügen
    }

    public void depthFirstSearch() {
        depthFirstSearch(root);
    }

    private void depthFirstSearch(Node<E> node) {
        // Rekursiven Tiefendurchlauf implementieren
    }
}