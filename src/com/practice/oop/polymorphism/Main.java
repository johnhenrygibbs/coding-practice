package com.practice.oop.polymorphism;

// Polymorphism is the act of representing the same thing in multiple ways.

// Types of Polymorphism

// 1. Compile time or static polymorphism (achieved via method overloading).

// 2.

public class Main {

    // In this example, we have more than one area() method in the package.

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

    }

}
