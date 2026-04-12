package com.bootcampexercise.module2.activity5;

/**
 * Adds numbers from 50 to 100 using for loop
 */
public class AddWholeNum {

    public static void main(String[] args) {

        int sum = 0;

        // loop from 50 to 100 and keep adding each number to sum
        for (int i = 50; i <= 100; i++) {
            sum += i; // add each number from 50 till 100
        }

        // Print the result
        System.out.println("Sum of numbers from 50 to 100 is: " + sum);
    }
}
