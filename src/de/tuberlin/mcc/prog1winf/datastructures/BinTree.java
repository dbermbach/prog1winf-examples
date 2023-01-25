/**
 *
 */
package de.tuberlin.mcc.prog1winf.datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class BinTree {
    Node root;


    void insert(int val) {
        if (root == null) root = new Node(val);
        else root.insert(val);
    }

    void printInOrder() {
        if (root != null) System.out.println(root.inOrder());
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            l.add(i);
        }
        Collections.shuffle(l);
        BinTree b = new BinTree();
        System.out.println("In:");
        for (int i : l) {
            System.out.print(i);
            b.insert(i);
        }
        System.out.println("\nOut:");
        b.printInOrder();

    }

}


class Node {

    public int value;

    public Node left;

    public Node right;


    Node(int value) {
        super();
        this.value = value;
    }

    void insert(int val) {
        if (val < value) {
            if (left == null) left = new Node(val);
            else left.insert(val);
        } else if (val > value) {
            if (right == null) right = new Node(val);
            else right.insert(val);
        }
    }

    String inOrder() {
        String res = "";
        if (left != null) res += left.inOrder();
        res += value;
        if (right != null) res += right.inOrder();
        return res;
    }

}
