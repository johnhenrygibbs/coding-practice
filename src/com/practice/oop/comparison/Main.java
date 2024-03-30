package com.practice.oop.comparison;

public class Main {

    public static void main(String[] args) {

        Student john = new Student(1, 3.5f);
        Student cassie = new Student (2, 4.0f);

        if (john.compareTo(cassie) < 0) {

            System.out.println(john.compareTo(cassie));
            System.out.println("Cassie has higher marks.");

        }

    }

}
