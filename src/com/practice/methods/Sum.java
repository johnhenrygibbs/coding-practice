package com.practice.methods;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        sum();

    }

    static void sum() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. 1: ");
        int numOne = in.nextInt();
        System.out.print("Enter No. 2: ");
        int numTwo = in.nextInt();
        int sum = numOne + numTwo;
        System.out.println("Sum = " + sum);

    }

    // Below is the syntax of a method.

    /*

        access modifier, return type, name () {
            // body
            return statement;
        }

    */

}
