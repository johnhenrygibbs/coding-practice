package com.practice.two;

// Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.

public class DeleteMiddleNode {

    boolean deleteNode(LinkedListNode n) {

        if (n == null || n.next == null) {

            return false;

        }

        // One solution is to copy the data from the next node and then delete the next node.

        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;

    }

    public static void main(String[] args) {

    }

}
