package com.bootcampexercise.module7.activity;

public class ArithmeticExceptionActivity {
        // 1 - main method
        public static void main(String args[]) {

            // 2 - Create an instance and call catchMe with 10 and 0
            ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
            obj.catchMe(10, 0);

            // 5 - Call catchMe with 10 and 2
            obj.catchMe(10, 2);
        }

        void catchMe(int num1, int num2) {

            try {
                int result = num1 / num2;   // this may cause ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException a) {
                System.out.println("Error: Cannot divide by zero!");

            } finally {
                // 4 - finally block message
                System.out.println("Thank you for using this program.");
            }
        }
}
