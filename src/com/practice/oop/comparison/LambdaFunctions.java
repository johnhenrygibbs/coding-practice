package com.practice.oop.comparison;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            array.add(i + 1);

        }

        // item represents each element in the for loop.

        array.forEach((item) -> {
            System.out.println(item * 2);
        });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        array.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, prod));
        System.out.println(myCalculator.operate(5, 3, sub));

    }

    private int operate(int a, int b, Operation op) {

        return op.operation(a, b);

    }

}

interface Operation {

    int operation(int a, int b);

}
