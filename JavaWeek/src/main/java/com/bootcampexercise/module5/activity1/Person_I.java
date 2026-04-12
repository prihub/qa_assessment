package com.bootcampexercise.module5.activity1;

/**
 * Person_I class represents a basic person.
 * This is the parent class used for inheritance.
 */
public class Person_I {

    // Stores the name of the person
    protected String personName;

    // Stores the age of the person
    protected int personAge;

    /**
     * Sets the name of the person
     * @param personName name value passed from other class
     */
    public void setName(String personName) {
        this.personName = personName;
    }

    /**
     * Sets the age of the person
     * @param personAge age value passed from other class
     */
    public void setAge(int personAge) {
        this.personAge = personAge;
    }

    /**
     * Returns basic person information
     * @return formatted string with name and age
     */
    public String getPersonDetails() {
        return "Name: " + personName + ", Age: " + personAge;
    }
}
