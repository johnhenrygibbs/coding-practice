package com.practice.oop.strings;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4};
        int num = 10;
        String name = "John Gibbs";
        System.out.println(name);

        // Strings are immutable for security reasons.

        String myName = "John";
        System.out.println(myName);

        myName = "Cassie";
        System.out.println(myName);

        // In this example, myName has not been changed, but rather another object ("Cassie") has been made in the heap.

    }

}
