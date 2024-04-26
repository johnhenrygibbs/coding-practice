package com.practice.oop;

public class PatternQuestion {

    // Outer loop is for rows.

    // Inner for loop is for columns.

    public static void main(String[] args) {

        patternOne(4);
        System.out.println();
        patternTwo(4);
        System.out.println();
        patternThree(4);
        System.out.println();
        patternFour(4);
        System.out.println();
        patternFive(4);
        System.out.println();
        patternSix(5);
        System.out.println();
        patternSeven(5);

    }

    /*

    ****
    ****
    ****
    ****

     */

    static void patternOne(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    /*

     *
     **
     ***
     ****

     */

    static void patternTwo(int n) {

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

    /*

     ****
     ***
     **
     *

     */

    static void patternThree(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    /*

     1
     12
     123
     1234

     */

    static void patternFour(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(col);

            }

            System.out.println();

        }

    }

    /*

     *
     **
     ***
     ****
     ***
     **
     *

     */

    static void patternFive(int n) {

        // Once the row number is greater than n, the output will be different.

        // Otherwise, the column number is going to be equal to row only.

        // When it exceeds n, we need to figure out the condition to print the reverse.

        // It's actually subtracting the present row from the pattern's total number of rows.

        for (int row = 0; row < 2 * n; row++) {

            int totalColumnsInRow = row > n ? 2 * n - row : row;

            for (int col = 0; col < totalColumnsInRow; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    /*

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

     */

    static void patternSix(int n) {

        for (int row = 0; row < 2 * n; row++) {

            int totalColumnsInRow = row > n ? 2 * n - row : row;

            int spacesToPrint = n - totalColumnsInRow;

            for (int i = 0; i < spacesToPrint; i++) {

                System.out.print(" ");

            }

            for (int col = 0; col < totalColumnsInRow; col++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    /*

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

     */

    static void patternSeven(int n) {

        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {

                System.out.print("  ");

            }

            for (int col = row; col >= 1; col--) {

                System.out.print(col + " ");

            }

            for (int col = 2; col <= row; col++) {

                System.out.print(col + " ");

            }

            System.out.println();

        }

    }

}
