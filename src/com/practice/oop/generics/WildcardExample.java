package com.practice.oop.generics;

import java.util.Arrays;
import java.util.List;

// T should either be Number or its subclasses.

public class WildcardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // works as an index value

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list) {

        // Do something.

        // Here you can only pass Number type. You can't pass the subclasses of Number.

    }

    public void getListWithSubclasses(List<? extends Number> list) {

        // Do something.

        // Here you can pass Number and also the subclasses of Number, such as Integer and Float.

    }

    public void add(T num) {

        if(isFull()) {

            resize();

        }

        data[size++] = num;

    }

    private void resize() {

        Object[] temp = new Object[data.length * 2];

        // Copy the current items in the new array.

        for (int i = 0; i < data.length; i++) {

            temp[i] = data[i];

        }

        data = temp;

    }

    private boolean isFull() {

        return size == data.length;

    }

    public T remove() {

        // Doesn't actually delete the data.
        // Size also works as an index value.

        T removed = (T)(data[--size]);
        return removed;

    }

    public T get(int index) {

        return (T)data[index];

    }

    public int size() {

        return size;

    }

    public void set(int index, T value) {

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

        WildcardExample<Integer> list = new WildcardExample<>();

        for (int i = 0; i < 14; i++) {

            list.add(2 * i);

        }

        System.out.println(list);

    }

}
