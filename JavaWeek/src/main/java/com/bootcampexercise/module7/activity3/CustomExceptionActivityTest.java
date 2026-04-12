package com.bootcampexercise.module7.activity3;

/**
 * Validates user against predefined list.
 */
public class CustomExceptionActivityTest {

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {

        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        try {
            test.validateUser("John");    // valid
            test.validateUser("Alex");    // invalid

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Checks if user exists in validUsers list.
     */
    void validateUser(String name) throws CustomException {

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        int isValidUser = 0;

        for (int i = 0; i < validUsers.length; i++) {
            if (validUsers[i].equals(name)) {
                isValidUser = 1;
                break;
            }
        }

        if (isValidUser == 0) {
            // Throwing custom exception for invalid user
            throw new CustomException();
        } else {
            System.out.println("Welcome to Payroll program");
        }
    }
}
