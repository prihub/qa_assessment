package com.bootcampexercise.module2.activity7;

/**
 * Prints odd numbers less than 100 using while loop
 */
public class PrintNumWithWhile {

    public static void main(String[] args) {

        int n = 1;

        // loop runs while number is less than 100
        // prints only odd numbers by checking remainder
        while (n < 100) {

            if (n % 2 != 0) {
                System.out.println(n);
            }

            n++;
        }
    }
}
