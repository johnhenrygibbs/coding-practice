package com.practice.methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Take an input of two numbers and print the sum.

        Scanner in = new Scanner(System.in);
        int numOne, numTwo, sum;

        System.out.print("Enter No. 1: ");
        numOne = in.nextInt();
        System.out.print("Enter No. 2: ");
        numTwo = in.nextInt();
        sum = numOne + numTwo;
        System.out.println("Sum = " + sum);

    }

}
