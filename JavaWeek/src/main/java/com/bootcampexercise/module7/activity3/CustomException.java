package com.bootcampexercise.module7.activity3;

/**
 * Custom exception for invalid user.
 */
public class CustomException extends Exception {

    /**
     * Returns custom error message.
     */
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}