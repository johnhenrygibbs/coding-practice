package com.practice.one;

// Assume you have a method isSubstring which checks if one word is a substring of another.

// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").

public class StringRotation {

    // Regardless of where the pivot point is, a true rotated string (s2) will be contained within a concatenation of s1 + s1.

    boolean isRotation(String s1, String s2) {

        int len = s1.length();

        if (len == s2.length() && len > 0) {

            String s1s1 = s1 + s1;

            return isSubstring(s1s1, s2);

        }

        return false;

    }

    boolean isSubstring(String s1, String s2) {

        if (s1.contains(s2) || s2.contains(s1)) {

            return true;

        }

        return false;

    }

    public static void main(String[] args) {

    }

}
