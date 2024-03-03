package com.practice.four;

public class BinarySearchTree {

    public class Node {

        int key;
        Node left;
        Node right;

        public Node(int key) {

            this.key = key;
            left = null;
            right = null;

        }

    }

    private Node root;

    public BinarySearchTree() {

        root = null;

    }

    public int getMinValue() {

        return 1;

    }

    public int getMaxValue() {

        return 1;

    }

    public void insert(int key) {

        root = insert(root, key);

    }

    public Node search(int key) {

        return search(root, key);

    }

    public Node delete(int key) {

        return root;

    }

    public int findCeil(int input) {

        return 1;

    }

    public int findFloor(int input) {

        return 1;

    }

    // Private methods.

    private Node insert(Node node, int key) {

        if (root == null) {

            root = new Node(key);
            return root;

        }

        if (node.key > key) {

            node.left = insert(node.left, key);

        } else {

            node.right = insert(node.right, key);

        }

        return node;

    }

    private Node search(Node node, int key) {

        if (node == null) return null;

        if (node.key == key) return node;

        else if (node.key > key) {

            return search(node.left, key);

        } else {

            return search(node.right, key);

        }

    }

    private Node delete(Node node, int key) {

        if (node == null) return null;

        if (node.key < key) {

            node.left = delete(node.left, key);

        } else if (node.key < key) {

            node.right = delete(node.right, key);

        } else {

            // Node is a leaf (first case).
            if (node.left == null && node.right == null) {

                return null;

            }

            // Node has 1 subtree (second case).
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            // Node has both subtrees (third case).


        }

    }

}
