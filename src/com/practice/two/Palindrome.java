package com.practice.two;

// Implement a function to check if a linked list is a palindrome.

public class Palindrome {

    // One solution is to reverse the linked list and compare the two lists against one another.

    boolean isPalindrome(MyNode head) {

        MyNode reversed = reverseAndClone(head);

        return isEqual(head, reversed);

    }

    MyNode reverseAndClone(MyNode node) {

        MyNode head = null;

        while (node != null) {

            MyNode n = new MyNode(node.data);
            n.next = head;
            head = n;
            node = node.next;

        }

        return head;

    }

    boolean isEqual(MyNode one, MyNode two) {

        while (one != null && two != null) {

            if (one.data != two.data) {

                return false;

            }

            one = one.next;
            two = two.next;

        }

        return one == null && two == null;

    }

}
