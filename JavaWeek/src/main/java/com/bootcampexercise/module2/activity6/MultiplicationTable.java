package com.bootcampexercise.module2.activity6;

/**
 * Prints multiplication tables from 11 to 20
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        // outer loop selects numbers from 11 to 20
        for (int i = 11; i <= 20; i++) {

            System.out.println("Table of " + i);

            // inner loop multiplies selected number with 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}