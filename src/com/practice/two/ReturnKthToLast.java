package com.practice.two;

// Implement an algorithm to find the kth to last element of a singly linked list.

public class ReturnKthToLast {

    // One possible iterative solution places two pointers k nodes apart using the "runner" technique.

    MyNode nthToLast(MyNode head, int k) {

        MyNode p1 = head;
        MyNode p2 = head;

        // Move p1 k nodes into the list.

        for (int i = 0; i < k; i++) {

            if (p1 == null) {

                return null;

            }

            p1 = p1.next;

        }

        // Move them at the same pace until p1 reaches the end of the list.

        while (p1 != null) {

            p1 = p1.next;
            p2 = p2.next;

        }

        // At this point, p2 will equal the length of the linked list minus k (or k nodes from the end).

        return p2;

    }

    public static void main(String[] args) {

    }

}
