package com.practice.four;

// Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height.

public class MinimalTree {

    TreeNode createMinimalBST(int[] array) {

        return createMinimalBST(array, 0, array.length - 1);

    }

    TreeNode createMinimalBST(int[] array, int start, int end) {

        if (end < start) {

            return null;

        }

        int middle = (start + end) / 2;
        TreeNode n = new TreeNode(array[middle]);
        n.left = createMinimalBST(array, start, middle - 1);
        n.right = createMinimalBST(array, middle + 1, end);

        return n;

    }

}
