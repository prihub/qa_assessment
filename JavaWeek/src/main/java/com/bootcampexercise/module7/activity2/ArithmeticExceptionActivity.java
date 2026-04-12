package com.bootcampexercise.module7.activity2;

/**
 * Demonstrates handling of ArithmeticException.
 */
public class ArithmeticExceptionActivity {

    /**
     * Entry point of the program.
     */
    public static void main(String args[]) {

        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();

        // Case 1: Will cause exception (division by zero)
        activity.catchMe(10, 0);

        // Case 2: Valid division
        activity.catchMe(10, 2);
    }

    /**
     * Performs division and handles ArithmeticException.
     */
    void catchMe(int n1, int n2) {

        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            // Always executes
            System.out.println("Thank you for using this program.");
        }
    }
}