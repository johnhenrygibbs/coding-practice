package com.practice.oop;

public class BoxPrice extends WeightedBox {

    double cost;

    BoxPrice() {

        super();
        this.cost = -1;

    }

    BoxPrice(BoxPrice other) {

        super(other);
        this.cost = other.cost;

    }

    public BoxPrice(double length, double width, double height, double weight, double cost) {

        super(length, width, height, weight);
        this.cost = cost;

    }

    public BoxPrice(double side, double weight, double cost) {

        super(side, weight);
        this.cost = cost;

    }

}
