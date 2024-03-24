package com.practice.oop.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {

        this.num = num;
        this.gpa = gpa;

    }

    // hashCode() gives a number representation of an object.

    @Override
    public int hashCode() {

        return num;

    }

    @Override
    public boolean equals(Object obj) {

        return this.num == ((ObjectDemo)obj).num;

    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(34, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(34, 78.9f);

        if (obj1 == obj2) {

            System.out.println("Object one is equal to object two.");

        }

        if (obj1.equals(obj2)) {

            System.out.println("Object one is equal to object two.");

        }

        // The getClass() method is stored in heap memory.

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }

}
