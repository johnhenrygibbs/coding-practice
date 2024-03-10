package com.practice.oop;

// Example to show initialization of static variables.

public class StaticBlock {

    static int a = 4;
    static int b;

    // Static block will only run once when the object is created.

    static {

        System.out.println("Inside of the static block.");
        b = a * 5;

    }

    public static void main(String[] args) {

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }

}
