package com.practice.one;

// Given two strings, write a method to decide if one is a permutation of the other.

public class CheckPermutation {

    // The sort() method puts characters from a string in order.

    String sort(String s) {

        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);

    }

    // We can then use the permutation() method to ask if the two sorted strings are equal to one another.

    boolean permutation(String s, String t) {

        if (s.length() != t.length()) {

            return false;

        }

        return sort(s).equals(sort(t));

    }

    public static void main(String[] args) {

    }

}
