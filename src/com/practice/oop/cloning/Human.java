package com.practice.oop.cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // This is shallow copy.
        Human twin = (Human)super.clone();

        // This is how you make a deep copy.
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {

            twin.arr[i] = this.arr[i];

        }

        return twin;

    }

}
