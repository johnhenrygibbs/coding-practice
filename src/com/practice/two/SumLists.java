package com.practice.two;

// You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list.

// Write a function that adds the two numbers and returns the sum as a linked list.

public class SumLists {

    MyNode addLists(MyNode list1, MyNode list2) {

        return addLists(list1, list2, 0);

    }

    MyNode addLists(MyNode list1, MyNode list2, int carry) {

        if (list1 == null && list2 == null && carry == 0) {

            return null;

        }

        MyNode result = new MyNode();

        int value = carry;

        if (list1 != null) {

            value += list1.data;

        }

        if (list2 != null) {

            value += list2.data;

        }

        result.data = value % 10;

        if (list1 != null || list2 != null) {

            MyNode more = addLists(list1 == null ? null : list1.next, list2 == null ? null : list2.next, value >= 10 ? 1 : 0);

            result.setNext(more);

        }

        return result;

    }

}
