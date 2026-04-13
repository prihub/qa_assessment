package com.bootcampexercise.module10;

/**
 * Represents a student, extends Person
 */
public class Students extends Person {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // override introduce method
    @Override
    public void introduce() {
        System.out.println("I am studying in university " + schoolName);
    }
}
