package com.bootcampexercise.module2.activity8;

/**
 * Finds the largest number in an array
 */
public class FindInArray {

    public static void main(String[] args) {

        // Define Array
        int[] n = {12, 45, 7, 89, 23, 56, 78, 90, 34, 67,
                11, 22, 33, 44, 55, 66, 77, 88, 99, 10};

        int largest = n[0];

        // loop checks each element and updates largest when a bigger number is found
        for (int i = 1; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}