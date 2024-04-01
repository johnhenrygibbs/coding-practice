package com.practice.oop.comparison;

public class Student implements Comparable<Student> {

    int num;
    float grade;

    public Student(int num, float grade) {
        this.num = num;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return grade + " " + num;
    }

    @Override
    public int compareTo(Student o) {

        // If diff is equal to 0 it means both are equal.

        // If diff is less than 0 it means o is bigger.

        // Else o is smaller than this.

        int diff = (int)(this.grade - o.grade);

        return diff;

    }

}
