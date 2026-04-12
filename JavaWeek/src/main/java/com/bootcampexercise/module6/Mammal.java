package com.bootcampexercise.module6;

/**
 * Mammal class uses Animal interface to demonstrate polymorphism.
 */
public class Mammal {

    // Stores the animal type (Cat/Dog)
    private Animal pet;

    // Stores the name of the mammal
    private String name;

    /**
     * Constructor to set mammal name
     *
     * @param name name of the mammal
     */
    public Mammal(String name) {
        this.name = name;
    }

    /**
     * Assigns an animal (Cat or Dog)
     *
     * @param pet Animal implementation passed from main class
     */
    public void setPet(Animal pet) {
        this.pet = pet;
    }

    /**
     * Calls sleep method of assigned animal
     */
    public void sleep() {
        System.out.println(name + " is sleeping...");
        // Calling method from Animal interface
        pet.sleep();
    }

    /**
     * Calls sound method of assigned animal
     */
    public void speak() {
        System.out.println(name + " is making sound...");
        // Calling method from Animal interface
        pet.makeSound();
    }
}