package com.practice.oop.interfaces;

public class PowerEngine implements Engine {
    @Override
    public void turnOn() {
        System.out.println("Power engine turn on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Power engine turn off.");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate.");
    }

    @Override
    public void decelerate() {
        System.out.println("Power engine decelerate.");
    }

}
