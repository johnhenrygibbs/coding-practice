package com.practice.oop.abstractDemo;

// You can't create objects of an abstract class.

public abstract class Parent {

    int age;

    public Parent(int age) {

        this.age = age;

    }

    abstract void career();
    abstract void partner();

}
