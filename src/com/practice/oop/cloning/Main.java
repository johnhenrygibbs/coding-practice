package com.practice.oop.cloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Human john = new Human(34, "John Gibbs");

        Human twin = (Human)john.clone();
        System.out.println(twin.age + " " + twin.name);

    }

}
