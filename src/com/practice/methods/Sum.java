package com.practice.methods;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        int answer = sumTwo();
        System.out.println(answer);

        int result = sumThree(20, 30);
        System.out.println(result);

    }

    // Pass the value of numbers when you are calling the method in Main class. We do that via parameters.

    static int sumThree(int a, int b) {

        int sum = a + b;
        return sum;

    }

    // Return the value instead.

    static int sumTwo() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. 1: ");
        int numOne = in.nextInt();
        System.out.print("Enter No. 2: ");
        int numTwo = in.nextInt();
        int sum = numOne + numTwo;
        return sum;

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
