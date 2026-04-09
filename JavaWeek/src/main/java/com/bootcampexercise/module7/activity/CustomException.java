package com.bootcampexercise.module7.activity;

// 1 - extend this class from Exception
public class CustomException extends Exception {

    // 2 - Override getMessage()
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}
