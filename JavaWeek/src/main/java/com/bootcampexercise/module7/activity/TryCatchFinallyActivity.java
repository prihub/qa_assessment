package com.bootcampexercise.module7.activity;

public class TryCatchFinallyActivity {

    public static void main(String[] args) {
        // call catchMeIfYouCan
        TryCatchFinallyActivity activity = new TryCatchFinallyActivity();
        activity.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // use try with condition i <= 10 (this will cause exception)
        try {

            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }

        } catch (IndexOutOfBoundsException e) {

            // custom message
            System.out.println("Exception caught: Array index is out of bounds!");

        } finally {

            // always executed
            System.out.println("Finally block executed. Program finished.");

        }
    }
}