package com.practice.oop.polymorphism;

public class Circle extends Shape {

    // Child class methods will override parent class methods.

    @Override
    void area() {

        System.out.println("Printing from circle.");

    }

}
