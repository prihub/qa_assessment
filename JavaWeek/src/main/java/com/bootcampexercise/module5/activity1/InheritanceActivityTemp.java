package com.bootcampexercise.module5.activity1;

public class InheritanceActivityTemp {
    public static void main(String[] args) {

        // Create Person object
        Person_I myPerson = new Person_I();
        myPerson.setName("Sarah Johnson");
        myPerson.setAge(21);

        System.out.println("-----------------------------");

        // Create Employee object
        Employee_I myEmployee = new Employee_I();
        myEmployee.setName("Shawn Cun");
        myEmployee.setAge(32);
        myEmployee.setTitle("Developer");
        myEmployee.setSalary(70000.00);

        // Print Employee Info
        System.out.println("Employee Name: " + myEmployee.getName());
        System.out.println("Employee Age: " + myEmployee.getAge());
        System.out.println("Employee Title: " + myEmployee.getTitle());
        System.out.println("Employee Salary: " + myEmployee.getSalary());

        System.out.println("-----------------------------");

        // Print Person Info
        System.out.println("Person Name: " + myPerson.getName());
        System.out.println("Person Age: " + myPerson.getAge());

        System.out.println("-----------------------------");
    }
}
