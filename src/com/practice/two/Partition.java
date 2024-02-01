package com.practice.two;

// Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.

public class Partition {

    // One solution is to grow the list at the head and the tail.

    // Elements bigger than the pivot element are put at the tail and elements smaller than the pivot element are put at the head.

    MyNode partition(MyNode node, int x) {

        MyNode head = node;
        MyNode tail = node;

        while (node != null) {

            MyNode next = node.next;

            // Each time we insert an element, we update either the head or tail.

            if (node.data < x) {

                node.next = head;
                head = node;

            } else {

                tail.next = node;
                tail = node;

            }

            node = next;

        }

        tail.next = null;

        // Since the head has changed, we need to return it to the user.

        return head;

    }

}
