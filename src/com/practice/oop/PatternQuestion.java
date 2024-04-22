package com.practice.oop;

public class PatternQuestion {

    // Outer loop is for rows.

    // Inner for loop is for columns.

    public static void main(String[] args) {

        patternOne(4);

    }

    static void patternOne(int n) {

        // Step 1: How many rows you have is how many times the outer loop will run.

        for (int row = 1; row <= n; row++) {

            // Step 2: For every row number, identify how many columns there are. And what type of elements are there?

            for (int col = 1; col <= row; col++) {

                // Step 3: What do you need to print?

                System.out.print("*");

            }

            // When one row is printed, we need to add a newline.

            System.out.println();

        }

    }

}
