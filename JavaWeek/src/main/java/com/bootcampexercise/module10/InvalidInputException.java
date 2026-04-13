package com.bootcampexercise.module10;

/**
 * Custom exception for invalid inputs
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }
}