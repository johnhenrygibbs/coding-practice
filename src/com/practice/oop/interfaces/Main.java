package com.practice.oop.interfaces;

// Two classes that are unrelated to each other can implement the same interface.

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.turnOn();
        car.accelerate();
        car.decelerate();

    }

}
