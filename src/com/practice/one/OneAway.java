package com.practice.one;

// There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character.

// Given two strings, write a function to check if they are one edit (or zero edits) away.

public class OneAway {

    // The length of each string determines which function to return.

    boolean oneEditAway(String first, String second) {

        if (first.length() == second.length()) {

            return oneEditReplace(first, second);

        } else if (first.length() + 1 == second.length()) {

            return oneEditInsert(first, second);

        } else if (first.length() - 1 == second.length()) {

            return oneEditInsert(second, first);

        }

        return false;

    }

    // Strings that are one replacement away means that they're different precisely in one place.

    boolean oneEditReplace(String s1, String s2) {

        boolean foundDifference = false;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                if (foundDifference) {

                    return false;

                }

                foundDifference = true;

            }

        }

        return true;

    }

    // Strings that are one insertion or one removal away can be handled together.

    // These strings are identical except for one index where a shift occurs.

    boolean oneEditInsert(String s1, String s2) {

        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 < s1.length()) {

            if (s1.charAt(index1) != s2.charAt(index2)) {

                if (index1 != index2) {

                    return false;

                }

                index2++;

            } else {

                index1++;
                index2++;

            }

        }

        return true;

    }

}
