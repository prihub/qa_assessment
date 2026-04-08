package com.bootcampexercise.module3.activity;

public class CalculatorClient {
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        // Calling all methods
        sum(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        module(a, b);
    }

    public static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    public static void divide(int a, int b) {
        System.out.println("Divide: " + (a / b));
    }

    public static void module(int a, int b) {
        System.out.println("Module (Remainder): " + (a % b));
    }
}
