package com.practice.two;

// Write code to remove duplicates from an unsorted linked list.

import java.util.HashSet;

public class RemoveDuplicates {

    void deleteDupes(LinkedListNode n) {

        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while (n != null) {

            if (set.contains(n.data)) {

                previous.next = n.next;

            } else {

                set.add(n.data);
                previous = n;

            }

            n = n.next;

        }

    }

    public static void main(String[] args) {

    }

}
