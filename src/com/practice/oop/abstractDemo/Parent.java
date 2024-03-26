package com.practice.oop.abstractDemo;

// You can't create objects of an abstract class.

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {

        this.age = age;
        VALUE = 12345;

    }

    static void hello() {

        System.out.println("Hello!");

    }

    void normal() {
        System.out.println("This is a normal method.");
    }

    abstract void career();
    abstract void partner();

}
