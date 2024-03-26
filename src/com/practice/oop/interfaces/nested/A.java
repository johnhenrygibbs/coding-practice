package com.practice.oop.interfaces.nested;

// Top-level interface has to be declared as public or the default.

// The nested interface can be public, private, or protected.

public class A {

    // Nested interface example.

    public interface NestedInterface {

        boolean isOdd(int num);

    }

}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {

        return (num & 1) == 1;

    }
}
