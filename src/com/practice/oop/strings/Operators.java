package com.practice.oop.strings;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        // When you call println("a" + "b") you are creating a new object "ab".

        // int will be converted to Integer that will call toString().

        System.out.println("a" + 1);

        // This is the same as saying "a" + "1"

        System.out.println("John" + new ArrayList<>());
        System.out.println("John" + new Integer(46));

        // You can only use the + operator with primitives.

        // You can concatenate complex objects as long as there is at least one string in the mix.

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

    }

}
