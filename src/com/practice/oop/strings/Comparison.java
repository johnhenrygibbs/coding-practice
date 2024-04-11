package com.practice.oop.strings;

public class Comparison {

    public static void main(String[] args) {

        String a = "John";
        String b = "John";

        System.out.println(a == b);

        // == checks if reference variables are pointing to the same object.

        // The two lines below creates values in heap outside the string pool.

        String name1 = new String("John");
        String name2 = new String("John");

        System.out.println(name1 == name2);

    }

}
