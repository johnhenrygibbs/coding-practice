package com.practice.one;

// Implement an algorithm to determine if all characters in a string are unique.

public class IsUnique {

    boolean isUniqueChars(String str) {

        // Assuming an ASCII string, the length can not be larger than 128 characters.

        if (str.length() > 128) {

            return false;

        }

        // Create an array of booleans with default values set to false.

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {

            // Set val to be equal to the numerical representation the ASCII character found at the index.

            int val = str.charAt(i);

            if (char_set[val]) { // If that character is already present, return false.

                return false;

            }

            // Otherwise, flip its value to true.

            char_set[val] = true;

        }

        return true;

    }

    public static void main(String[] args) {

    }

}
