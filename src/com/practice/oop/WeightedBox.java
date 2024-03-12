package com.practice.oop;

public class WeightedBox extends Box {

    double weight;

    public WeightedBox() {

        this.weight = -1;

    }

    public WeightedBox(double length, double width, double height, double weight) {

        super(length, width, height); // Calls the parent class constructor.
        this.weight = weight;

    }
}
