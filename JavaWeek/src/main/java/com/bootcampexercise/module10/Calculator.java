package com.bootcampexercise.module10;

/**
 * Provides basic calculator operations
 */
public class Calculator {

    // add method (int)
    public int add(int a, int b) {
        return a + b;
    }

    // overloaded add method (double)
    public double add(double a, double b) {
        return a + b;
    }

    // subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // divide method with exception handling
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    // multiply method with custom exception
    public int multiply(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Negative values not allowed");
        }
        return a * b;
    }
}
