package com.practice.oop.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {

        this.num = num;

    }

    // hashCode() gives a number representation of an object.

    @Override
    public int hashCode() {

        return num;

    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);

    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }

}
