package com.practice.one;

// Implement a method to perform basic string compression using the counts of repeated characters.

// For example, the string "aabcccccaaa" would become "a2b1c5a3".

// If the "compressed" string would not become smaller than the original string, return the original string.

public class StringCompression {

    String compress(String str) {

        // Using StringBuilder to create a resizable array will improve runtime as opposed to simply concatenating strings.

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {

            countConsecutive++;

            // If the next character is different from the current or we reach the end of the string, append the char and the count to compressed.

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {

                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;

            }

        }

        return compressed.length() < str.length() ? compressed.toString() : str;

    }

    public static void main(String[] args) {

    }

}
