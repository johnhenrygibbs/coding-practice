package com.practice.oop.interfaces;

public interface Engine {

    // Variables will be static and final in interfaces.

    static final int price = 78000;

    void turnOn();
    void turnOff();
    void accelerate();
    void decelerate();

}
