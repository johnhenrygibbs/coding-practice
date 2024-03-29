package com.practice.oop.polymorphism;

// Polymorphism is the act of representing the same thing in multiple ways.

// Types of Polymorphism

// 1. Compile time or static polymorphism (achieved via method overloading).

// 2. Runtime or dynamic polymorphism (achieved via method overriding).

// 3. Encapsulation (a.k.a. wrapping the implementation of the data members and methods in a class).

// 4. Abstraction, on the other hand, means hiding the unnecessary details and showing valuable information only.

// Abstraction solves design-level issues, while encapsulation is solving implementation-level issues.

public class Main {

    // In this example, we have more than one area() method in the package.

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        // Parent obj = new Child();

        // Here, the method called will depend on Child(). This is known as upcasting.

        // Big picture, this is how overriding works.

        // Java determines this by dynamic method dispatch, a call to an overridden method resolved at runtime rather than compile time.

        Shape upcast = new Circle();

    }

}
