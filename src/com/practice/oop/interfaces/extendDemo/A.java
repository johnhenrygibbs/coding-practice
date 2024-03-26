package com.practice.oop.interfaces.extendDemo;

public interface A {

    // Static interface methods should always have a body.

    // Call via the interface name.

    static void greeting() {

        System.out.println("Body is required.");

    }

    void fun();

}
