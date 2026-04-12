package com.bootcampexercise.module2.activity3;

/**
 * Demonstrates finding the largest of three numbers
 */
public class FindLargest {

    public static void main(String[] args) {

        int x = 10;
        int y = 88;
        int z = 2;

        int largest; // stores the largest value

        // check which number is largest
        if (x >= y && x >= z) {
            largest = x;
        }
        else if (y >= x && y >= z) {
            largest = y;
        }
        else {
            largest = z;
        }
        System.out.println("Largest number is: " + largest);
    }
}