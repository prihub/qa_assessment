package com.bootcampexercise.module7.activity;

public class CustomExceptionActivityTest {
    // 1 - main method
    public static void main(String[] args) {

        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try {
            obj.validateUser("John");
            obj.validateUser("Mike");
            obj.validateUser("Alex"); // invalid user
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomException {

        // array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // flag stores 1 if match found
        int flag = 0;

        for (int i = 0; i < 4; i++) {

            // 2 - check if name matches array value
            if (name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }

        // 3 - if flag is zero throw exception
        if (flag == 0) {
            throw new CustomException();
        }

        // 4 - if valid user
        else {
            System.out.println("Welcome to Payroll program");
        }
    }
}
