package com.bootcampexercise.module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates working with list of employees
 */
public class EmployeeList {

    public static void main(String[] args) {

        // create employee objects
        Employee e1 = new Employee("John", 30, "Developer", "ABC", 5000);
        Employee e2 = new Employee("Alice", 28, "Tester", "XYZ", 6000);
        Employee e3 = new Employee("Bob", 35, "Manager", "DEF", 8000);
        Employee e4 = new Employee("Eve", 26, "Analyst", "GHI", 5500);
        Employee e5 = new Employee("Tom", 40, "Lead", "JKL", 9000);

        // create list and add employees
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        // get and print highest paid employee
        String result = Employee.getHighestPaidEmp(empList);

        System.out.println("The Employee whose salary is the highest is: " + result);
    }
}
