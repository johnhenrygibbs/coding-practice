package com.practice.oop;

import static com.practice.oop.Message.message;

public class Main {

    public static void main(String[] args) {

        Student one = new Student();
        Student two = one;

        one.name = "New Name";
        System.out.println(two.name);

        one.greetMe();
        message();

    }

}
