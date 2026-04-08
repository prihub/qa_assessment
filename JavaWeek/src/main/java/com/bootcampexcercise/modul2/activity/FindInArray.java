package com.bootcampexcercise.modul2.activity;

public class FindInArray {
    public static void main(String[] args) {

        // Create an array of 20 numbers
        int[] n = {12, 45, 7, 89, 23, 56, 91, 34, 67, 10,
                5, 78, 32, 44, 99, 1, 60, 25, 80, 15};

        // Assume the first element is the largest
        int largest = n[0];

        // Loop through the array to find the largest number
        for (int i = 1; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
        }

        // Print the largest number
        System.out.println("Largest number in the array is: " + largest);
    }
}
