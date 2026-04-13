package com.bootcampexercise.module10;

/**
 * Abstract class representing a person
 */
public abstract class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // abstract method to be implemented by subclasses
    public abstract void introduce();
}