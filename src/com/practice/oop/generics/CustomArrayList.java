package com.practice.oop.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // works as an index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {

        if(isFull()) {

            resize();

        }

        data[size++] = num;

    }

    private void resize() {

        int[] temp = new int[data.length * 2];

        // Copy the current items in the new array.

        for (int i = 0; i < data.length; i++) {

            temp[i] = data[i];

        }

        data = temp;

    }

    private boolean isFull() {

        return size == data.length;

    }

    public int remove() {

        // Doesn't actually delete the data.
        // Size also works as an index value.

        int removed = data[--size];
        return removed;

    }

    public int get(int index) {

        return data[index];

    }

    public int size() {

        return size;

    }

    public void set(int index, int value) {

        data[index] = value;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 14; i++) {

            list.add(2 * i);

        }

        System.out.println(list);

    }

}
