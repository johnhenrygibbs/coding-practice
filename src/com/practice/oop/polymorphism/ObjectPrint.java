package com.practice.oop.polymorphism;

// In Java, every object extends the Object class by default.

// For example, calling toString() when we want to print an object to the console.

public class ObjectPrint {

    int number;

    public ObjectPrint(int number) {

        this.number = number;

    }

    // However, we can generate our own toString() method, called at runtime, to override Java's default toString() method.

    @Override
    public String toString() {

        return "ObjectPrint{" + "number=" + number + '}';

    }

    public static void main(String[] args) {

        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);

    }

}
