package com.practice.two;

public class DeleteMiddleNode {

    boolean deleteNode(Node n) {

        if (n == null || n.next == null) {

            return false;

        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;

    }

    public static void main(String[] args) {

    }

}
