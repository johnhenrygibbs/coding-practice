package com.practice.oop.comparison;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student john = new Student(1, 89f);
        Student cassie = new Student (2, 99f);
        Student dan = new Student (3, 95f);
        Student brad = new Student (4, 77f);
        Student dave = new Student (5, 96f);

        Student[] list = {john, cassie, dan, brad, dave};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        if (john.compareTo(cassie) < 0) {

            System.out.println(john.compareTo(cassie));
            System.out.println("Cassie has higher marks.");

        }

    }

}
