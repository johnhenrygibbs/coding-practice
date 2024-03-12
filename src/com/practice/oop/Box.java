package com.practice.oop;

public class Box {

    double length;
    double width;
    double height;

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
