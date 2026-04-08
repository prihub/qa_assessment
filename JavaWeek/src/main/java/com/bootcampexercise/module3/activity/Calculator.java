package com.bootcampexercise.module3.activity;

public class Calculator {
    // Constant for calculator type
    public static final String CALC_TYPE_BASIC = "Basic";

    private String calculatorType;

    // Constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter
    public String getCalculatorType() {
        return calculatorType;
    }

    // Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Multiply method (array input)
    public int multiply(int[] numbers) {
        int result = 1;

        for (int num : numbers) {
            result = result * num;
        }

        return result;
    }

    // Divide method
    public int divide(int a, int b) {
        return a / b;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }
}
