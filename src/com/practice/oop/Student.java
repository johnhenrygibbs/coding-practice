package com.practice.oop;

// OOP 1 | Introduction & Concepts - Classes, Objects, Constructors, Keywords

public class Student {

    String name;
    int number;
    int grade;

    Student() {

        this.name = "John";
        this.number = 1;
        this.grade = 90;

    }

    void greetMe() {

        System.out.println("Hello! My name is " + this.name);

    }

}
