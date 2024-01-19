package com.practice.one;

// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

public class URLify {

    void replaceSpaces(char[] str, int trueLength) {

        // Double the count of space characters found and add to length of string to account for the new characters to be inserted.

        int numberOfSpaces = countSpaces(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        // Add a null character if there are excess spaces.

        if (newIndex + 1 < str.length) {

            str[newIndex + 1] = '\0';

        }

        // Create an extra buffer by working backwards from the end to avoid overwriting.

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {

            // If we see a space, replace it with '%20' working backwards.

            if (str[oldIndex] == ' ') {

                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;

            // Otherwise, copy the original character and continue.

            } else {

                str[newIndex] = str[oldIndex];
                newIndex--;

            }

        }

    }

    // We need to count the extra spaces contained within a string represented as a character array.

    int countSpaces(char[] str, int start, int end, int space) {

        int count = 0;

        for (int i = start; i < end; i++) {

            if (str[i] == space) {

                count++;

            }

        }

        return count;

    }

    public static void main(String[] args) {

    }

}
