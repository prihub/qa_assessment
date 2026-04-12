package com.bootcampexercise.module5.activity1;

public class InheritanceActivity {
    /**
     * Main method - program execution starts here
     * This class is responsible for:
     * 1. Creating Person object
     * 2. Creating Employee object (inherits Person)
     * 3. Calling methods from both classes
     */
    public static void main(String[] args) {

        // =========================
        // PERSON OBJECT CREATION
        // =========================

        // Creating Person object (independent class usage)
        Person_I personObject = new Person_I();

        // Setting values using Person_I class methods
        personObject.setName("Sarah Johnson");
        personObject.setAge(21);

        // Output: Displaying person information
        System.out.println("Person Details (Person_I class object):");
        System.out.println(personObject.getPersonDetails());

        System.out.println("-----------------------------");

        // =========================
        // EMPLOYEE OBJECT CREATION
        // =========================

        // Creating Employee object (inherits Person_I)
        Employee_I employeeObject = new Employee_I();

        // Setting inherited variables from Person_I class
        // (These methods are defined in parent class but used via child object)
        employeeObject.setName("Shawn Cun");
        employeeObject.setAge(32);

        // Setting Employee_I specific fields
        employeeObject.setJobTitle("Developer");
        employeeObject.setSalary(70000.00);

        // Output: Displaying employee information (includes inherited + own fields)
        System.out.println("Employee Details (Employee_I class object using inheritance):");
        System.out.println(employeeObject.getEmployeeDetails());

        System.out.println("-----------------------------");

        // =========================
        // REUSING PERSON OBJECT
        // =========================

        // Output: Reusing Person_I object again
        System.out.println("Person Details Reused:");
        System.out.println(personObject.getPersonDetails());
    }
}

