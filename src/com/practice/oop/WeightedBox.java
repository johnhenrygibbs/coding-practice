package com.practice.oop;

public class WeightedBox extends Box {

    double weight;

    public WeightedBox() {

        this.weight = -1;

    }

    WeightedBox(double side, double weight) {

        super(side);
        this.weight = weight;

    }

    // Exactly like the "box5" example in Main.

    public WeightedBox(WeightedBox other) {

        super(other);
        weight = other.weight;

    }

    public WeightedBox(double length, double width, double height, double weight) {

        super(length, width, height); // Calls the parent class constructor.
        this.weight = weight;

    }

}
