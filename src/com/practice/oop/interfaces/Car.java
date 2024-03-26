package com.practice.oop.interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("I brake like a normal car.");
    }

    @Override
    public void turnOn() {
        System.out.println("I turn on like a normal car.");
    }

    @Override
    public void turnOff() {
        System.out.println("I turn off like a normal car.");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car.");
    }

    @Override
    public void decelerate() {
        System.out.println("I decelerate like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car.");
    }

}
