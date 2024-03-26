package com.practice.oop.interfaces;

public class NewCar {

    private Engine engine;
    private Media player = new CDPlayer();

    public NewCar() {
        engine = new PowerEngine();
    }

    public NewCar(Engine engine) {
        this.engine = engine;
    }

    public void turnOn() {
        engine.turnOn();
    }

    public void turnOff() {
        engine.turnOff();
    }

    public void start() {
        player.start();
    }

    public void stop() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

}
