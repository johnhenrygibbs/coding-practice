package com.practice.oop;

// Outside classes cannot be static, because they are not dependent on other classes.

// Only nested classes can be static.

class Test {

    String name;

    public Test(String name) {
        this.name = name;
    }
}

public class InnerClass {

    public static void main(String[] args) {

        Test a = new Test("John");
        Test b = new Test("Matt");

    }

}
