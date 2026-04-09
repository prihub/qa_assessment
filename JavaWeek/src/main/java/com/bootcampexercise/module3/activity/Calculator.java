package com.bootcampexercise.module3.activity;

public class Calculator {

    // public static final variable
    public static final String CALC_TYPE_BASIC = "Basic";

    private String calculatorType;

    // Constructor
    public Calculator(String type) {
        this.calculatorType = type;
    }

    // Getter
    public String getCalculatorType() {
        return calculatorType;
    }

    // Add
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // Divide
    public int divide(int a, int b) {
        return a / b;
    }

    // Multiply using array
    public int multiply(int[] numbers) {

        int result = 1;

        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }

        return result;
    }
}
