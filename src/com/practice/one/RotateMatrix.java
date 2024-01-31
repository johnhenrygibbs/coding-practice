package com.practice.one;

// Given an image represented by an NxN matrix, where each pixel in the image is represented by an integer, write a method to rotate the image by 90 degrees. Can you do this in place?


public class RotateMatrix {

    // Implement a swap by index on each layer starting from the outermost and working inwards.

    boolean rotate(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) {

            return false;

        }

        // int n returns the number of rows.

        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {

            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {

                int offset = i - first;
                int top = matrix[first][i];

                // Set west side to north side.
                matrix[first][i] = matrix[last - offset][first];

                // Set south side to west side.
                matrix[last - offset][first] = matrix[last][last - offset];

                // Set east side to south side.
                matrix[last][last - offset] = matrix[i][last];

                // Set north side to east side and save as top.
                matrix[i][last] = top;

            }

        }

        return true;

    }

}
