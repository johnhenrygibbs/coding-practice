package com.practice.oop;

// Outside classes cannot be static, because they are not dependent on other classes.

// Only nested classes can be static.

class Test {

    String name;

    public Test(String name) {
        this.name = name;
    }

    // Providing toString() method in this class will override the default toString() method in Java, called via println(), which returns the class name and hash value.

    @Override
    public String toString() {
        return name;
    }

}

public class InnerClass {

    public static void main(String[] args) {

        Test a = new Test("John");
        Test b = new Test("Matt");

        System.out.println(a);
        System.out.println(b);

    }

}
