package com.practice.oop;

import static com.practice.oop.Message.message;

public class Main {

    public static void main(String[] args) {

        Human john = new Human(34, "John", 100000, true);
        Human matt = new Human (39, "Matt", 100000, true);

        System.out.println(Human.population);

        Student one = new Student();
        Student two = one;

        one.name = "New Name";
        System.out.println(two.name);

        one.greetMe();
        message();

    }

}
