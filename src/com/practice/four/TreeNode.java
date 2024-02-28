package com.practice.four;

public class TreeNode {

    public String name;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(String name, TreeNode left, TreeNode right) {

        this.name = name;
        this.left = left;
        this.right = right;

    }

    // In-order traversal means to "visit" (often, print) the left branch, then the current node, and finally, the right branch.

    void inOrderTraversal(TreeNode node) {

        if (node != null) {

             inOrderTraversal(node.left);
             System.out.println(node);
             inOrderTraversal(node.right);

        }

    }

    // Pre-order traversal visits the current node before its child nodes (hence the name "pre-order").

    void preOrderTraversal(TreeNode node) {

        if (node != null) {

            System.out.println(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);

        }

    }

    // Post-order traversal visits the current node after its child nodes (hence the name "post-order").

    void postOrderTraversal(TreeNode node) {

        if (node != null) {

            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node);

        }

    }

}
