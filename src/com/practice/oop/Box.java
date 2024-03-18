package com.practice.oop;

public class Box {

    double length;
    double width;
    double height;

    // You cannot override static methods in child classes, even though they can be inherited.

    // Overriding depends on objects. Static does not depend on objects. Hence, static methods cannot be overridden.

    static void greetMe() {

        System.out.println("Printing from the Box class.");

    }

    public Box() {

        this.length = -1;
        this.width = -1;
        this.height = -1;

    }

    // Cube constructor example.

    public Box(double side) {

        this.width = side;
        this.length = side;
        this.height = side;

    }

    public Box(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;

    }

     Box(Box old) {

        this.height = old.height;
        this.length = old.length;
        this.width = old.width;

    }

    public void info() {

        System.out.println("Running the box.");

    }

}
