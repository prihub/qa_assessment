package com.bootcampexcercise.modul2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Print multiplication tables from 11 to 20
        for (int i = 11; i <= 20; i++) {

            System.out.println("Multiplication Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // space between tables
        }
    }
}
