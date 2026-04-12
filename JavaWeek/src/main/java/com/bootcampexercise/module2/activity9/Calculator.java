package com.bootcampexercise.module2.activity9;

/**
 * Simple calculator with basic operations
 */
public class Calculator {

    public static void main(String[] args) {

        // Print the output of the given functions respectively
        System.out.println("Sum: " + sum(10, 5));
        System.out.println("Subtract: " + subtract(10, 5));
        System.out.println("Multiply: " + multiply(10, 5));
        System.out.println("Divide: " + divide(10, 5));
        System.out.println("Modulus: " + modulus(10, 5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
}