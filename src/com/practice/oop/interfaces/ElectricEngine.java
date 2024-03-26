package com.practice.oop.interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void turnOn() {
        System.out.println("Electric engine turn on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Electric engine turn off.");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate.");
    }

    @Override
    public void decelerate() {
        System.out.println("Electric engine decelerate.");
    }

}
