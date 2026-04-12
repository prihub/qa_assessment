package com.bootcampexercise.module5.activity1;

/**
 * Employee_I class inherits Person_I.
 * It adds employee-specific details like salary and job title.
 */
public class Employee_I extends Person_I {

    // Stores job title of employee
    private String employeeJobTitle;

    // Stores salary of employee
    private double employeeSalary;

    /**
     * Sets job title for employee
     * @param employeeJobTitle value passed from main class (InheritanceActivity)
     */
    public void setJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }

    /**
     * Sets salary for employee
     * @param employeeSalary value passed from main class (InheritanceActivity)
     */
    public void setSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    /**
     * Returns full employee information
     * This method uses inherited variables from Person_I (personName, personAge)
     * @return formatted employee details
     */
    public String getEmployeeDetails() {
        return "Name: " + personName +
                ", Age: " + personAge +
                ", Job Title: " + employeeJobTitle +
                ", Salary: " + employeeSalary;
    }
}