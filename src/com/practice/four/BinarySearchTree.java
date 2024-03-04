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

    public int getMinValue(Node node) {

        Node current = node;
        while (current.left != null) current = current.left;
        return current.key;

    }

    public int getMaxValue(Node node) {

        Node current = node;
        while (current.right != null) current = current.right;
        return current.key;

    }

    public void insert(int key) {

        root = insert(root, key);

    }

    public Node search(int key) {

        return search(root, key);

    }

    public Node delete(int key) {

        return delete(root, key);

    }

    public int findCeil(int input) {

        return findCeil(root, input);

    }

    public int findFloor(int input) {

        return findFloor(root, input);

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
            if (node.left == null && node.right == null) return null;

            // Node has 1 subtree (second case).
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            // Node has both subtrees (third case).
            int replaceKey = getMinValue(node.right);
            node.key = replaceKey;
            node.right = delete(node.right, key);

        }

        return node;

    }

    private int findCeil(Node node, int input) {

        if (node == null) return -1;
        if (node.key == input) return node.key;
        if (node.key < input) return findCeil(node.right, input);

        int ceil = findCeil(node.left, input);
        if (ceil >= input) return ceil;
        else return node.key;

    }

    private int findFloor(Node node, int input) {

        if (node == null) return -1;
        if (node.key == input) return node.key;
        if (node.key < input) return findFloor(node.left, input);

        int floor = findFloor(node.right, input);
        if (floor >= node.key) return floor;
        else return node.key;

    }

    // Traversal methods.

    private void printPostOrder(Node node) {

        if (node == null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");

    }

    private void printPreOrder(Node node) {

        if (node == null) return;
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    private void printInOrder(Node node) {

        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);


    }

}
