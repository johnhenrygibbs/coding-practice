package com.practice.oop.interfaces;

// Two classes that are unrelated to each other can implement the same interface.

public class Main {

    public static void main(String[] args) {

        Engine car = new Car();

        car.turnOn();
        car.accelerate();
        car.decelerate();

        Media carMedia = new Car();

        carMedia.stop();

        NewCar newCar = new NewCar();

        newCar.turnOn();
        newCar.start();
        newCar.upgradeEngine();
        newCar.turnOn();

    }

}
