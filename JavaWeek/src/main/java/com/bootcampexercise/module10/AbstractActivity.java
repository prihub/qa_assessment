package com.bootcampexercise.module10;

/**
 * Demonstrates usage of Employee and Students classes
 */
public class AbstractActivity {

    public static void main(String[] args) {

        // create Employee object and call introduce
        Employee emp = new Employee("John", 30, "Developer", "ABC Corp", 5000);
        emp.introduce();

        System.out.println();

        // create Student object and call introduce
        Students student = new Students();
        student.setName("Alice");
        student.setAge(20);
        student.setSchoolName("XYZ University");

        student.introduce();
    }
}