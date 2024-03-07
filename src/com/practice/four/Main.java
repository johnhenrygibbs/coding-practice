package com.practice.four;

public class Main {

    public static void main(String[] args) {

        Student one = new Student();
        Student two = one;

        one.name = "New Name";
        System.out.println(two.name);

        one.greetMe();

    }

}
