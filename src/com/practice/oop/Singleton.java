package com.practice.oop;

// Create if you only want to have one object of a particular thing.

public class Singleton {

    // Using the private keyword ensures you can only run the constructor in this class.

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {

        // Check whether only one object is created or now.

        if (instance == null) {

            instance = new Singleton();

        }

        return instance;

    }

}
