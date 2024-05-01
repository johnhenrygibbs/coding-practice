package com.practice.methods;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        String message = greet();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String uniqueMessage = myGreeting(name);
        System.out.println(uniqueMessage);

    }

    private static String myGreeting(String name) {

        String message = "Hello, " + name;
        return message;

    }


    static String greet() {

        String greeting = "How are you?";

        return greeting;

    }

}
