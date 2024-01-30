package com.practice.two;

public class MyNode {

    int data;
    MyNode next = null;

    public MyNode(int data) {

        this.data = data;
        this.next = null;

    }

    public MyNode(int data, MyNode next) {

        this.data = data;
        this.next = next;

    }

    public int getData() {

        return this.data;

    }

    public void setNext(MyNode next) {

        this.next = next;

    }

    public MyNode getNext() {

        return this.next;

    }

    public boolean isLastElement() {

        return this.next == null;

    }

}
