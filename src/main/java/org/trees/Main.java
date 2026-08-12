package org.trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello dear students of the course 'Algorithmen & Datenstrukturen' :) !");
        System.out.println("Let us test your Code:");


        Tree<Integer> tree = new Tree<>();

        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        tree.depthFirstSearch();
    }
}