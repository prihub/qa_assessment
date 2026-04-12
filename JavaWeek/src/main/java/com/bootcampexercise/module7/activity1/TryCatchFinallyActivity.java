package com.bootcampexercise.module7.activity1;

/**
 * Demonstrates exception handling using try-catch-finally.
 */
public class TryCatchFinallyActivity {

    /**
     * Calls catchMeIfYouCan() method.
     */
    public static void main(String[] args) {

        TryCatchFinallyActivity activity = new TryCatchFinallyActivity();
        activity.catchMeIfYouCan(); // calling non-static method
    }

    /**
     * Demonstrates handling of ArrayIndexOutOfBoundsException.
     */
    void catchMeIfYouCan() {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            // Intentional mistake: loop exceeds array bounds
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value: " + numbers[i]);
            }

        } catch (IndexOutOfBoundsException error) {
            // Handles invalid index access
            System.out.println("Error: Index out of range.");

        } finally {
            // Always executes
            System.out.println("Execution completed.");
        }
    }
}