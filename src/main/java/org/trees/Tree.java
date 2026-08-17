package org.trees;


public class Tree {

    private Node root;

    public Tree() {root = null;}

    public void add(int data) {
        if (root == null){
            root = new Node(data);
            return;
        }

        add(root, data);
    }

    public void add(Node node, int data) {
        // Knoten in den Baum einfügen
    	
    	if(data < node.data) {	//wenn eingabe kleiner ist als der Inhalt gehe links
    		
    		if(node.left == null) {
    			node.left = new Node(data);
    		}else {
    			add(node.left, data);
    		}
    		
    	}else if (data > node.data) {	//wenn aber eingabe größer ist als inhalt gehe rechts
    		
    		if(node.right == null) {
    			node.right = new Node(data);
    		}else {
    			add(node.right, data);
    		}
    		
    	}
    }

    public void depthFirstSearch() {
        depthFirstSearch(root);
    }

    private void depthFirstSearch(Node node) {
        // Rekursiven Tiefendurchlauf implementieren
    	
    	if(node == null) {
    		return;
    	}
    	
    	System.out.print(node.data + " ");
    	
    	depthFirstSearch(node.left);
    	
    	depthFirstSearch(node.right);
    }
}