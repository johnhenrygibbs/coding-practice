package com.practice.oop.exceptions;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {

            // divide(a, b);

            String name = "John";

            if (name.equals("John")) {

                throw new MyException("Name is John.");

            }

            throw new Exception ("Just for fun.");

        // Add stricter exception catches first. In this case, subclasses before classes.

        } catch (MyException e) {

            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Catches a normal exception.");

        } finally {

            System.out.println("This will always execute.");

        }

    }

    static int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {

            throw new ArithmeticException("Please don't divide by zero.");

        }

        return a / b;

    }

}
