package com.practice.two;

public class MyLinkedList {

    MyNode head;
    MyNode current;

    public MyLinkedList() {

        this.head = null;
        this.current = null;

    }

    public MyLinkedList(int data) {

        this.head = new MyNode(data);
        this.current = this.head;

    }

    public MyLinkedList(MyNode node) {

        this.head = node;
        this.current = node;

    }

    public void goToTop() {

        this.current = this.head;

    }

    public boolean isEmpty() {

        return this.head == null;

    }

    public boolean goNext() {

        if(this.current.isLastElement()) {

            return false;

        } else {

            this.current = this.current.getNext();
            return true;
        }

    }

    public boolean find(int data) {

        if (!this.isEmpty()) {

            this.goToTop();

            do {

                if (this.current.getData() == data) {

                    return true;

                }

            } while(this.goNext());

        }

        return false;

    }

    public int getCurrentValue() {

        int returnValue = 0;

        if (!this.isEmpty()) {

            returnValue = this.current.getData();

        }

        return returnValue;

    }

    public void addNode(MyNode node) {

        if (this.isEmpty()) {

            this.current = node;
            this.head = node;

        } else {

            node.setNext(this.current.getNext());
            this.current.setNext(node);

        }

    }

    public void addNode(int data) {

        this.addNode(new MyNode((data)));

    }

    public void goToEnd() {

        while(this.goNext()) {

        }

    }

    public void appendNode(MyNode node) {

        this.goToEnd();
        this.current.setNext(node);

    }

    public void removeNode(int data) {

        this.goToTop();
        MyNode previous = this.head;

        if (this.current.getData() == data) {

            this.head = this.head.getNext();
            this.current = this.head;

        } else {

            while(this.goNext()) {

                if (this.current.getData() == data) {

                    previous.setNext(this.current.getNext());
                    break;

                }

                previous = this.current;

            }

        }

    }

}
