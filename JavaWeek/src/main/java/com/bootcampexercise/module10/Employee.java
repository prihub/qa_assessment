package com.bootcampexercise.module10;
import java.util.List;
/**
 * Represents an employee, extends Person
 */
public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    // default constructor
    public Employee() {
    }

    // parameterized constructor
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // override introduce method
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
    /**
     * finds employee with highest salary from list
     */
    public static String getHighestPaidEmp(List<Employee> empList) {

        Employee highest = empList.get(0);

        // loop to compare salaries and find highest
        for (Employee emp : empList) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }

        return highest.getName();
    }
}