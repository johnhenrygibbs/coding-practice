package com.practice.two;

// Implement a function to check if a linked list is a palindrome.

import java.util.Stack;

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

    // Another solution is an iterative approach.

    boolean isIterativePalindrome(MyNode head) {

        MyNode fast = head;
        MyNode slow = head;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {

            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;

        }

        if (fast != null) {

            slow = slow.next;

        }

        while (slow != null) {

            int top = stack.pop().intValue();

            if (top != slow.data) {

                return false;

            }

            slow = slow.next;

        }

        return true;

    }

}
