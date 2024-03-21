package com.practice.oop.access;

public class A {

    // Access Modifiers

    // "public" you can access anywhere.

    // "private" you can only access at the class level.

    // "protected" you cannot access in a different package and not a subclass.

    // If no modifier is used, you can only access in the same package.

    public int num;
    private String name;
    protected int[] arr;

    public A(int num, String name) {

        this.num = num;
        this.name = name;
        this.arr = new int[10];

    }
}
