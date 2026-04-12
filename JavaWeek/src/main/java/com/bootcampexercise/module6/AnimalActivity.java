package com.bootcampexercise.module6;

/**
 * AnimalActivity demonstrates interface and polymorphism.
 */
public class AnimalActivity {

    public static void main(String[] args) {

        // =========================
        // INTERFACE REFERENCE
        // =========================

        // Using interface reference for Dog
        Animal dog = new Dog();

        dog.makeSound();
        dog.sleep();

        System.out.println("-----------------------------");

        // =========================
        // USING MAMMAL WITH CAT
        // =========================

        Mammal mammal = new Mammal("My Pet");

        // Setting Cat
        mammal.setPet(new Cat());

        mammal.sleep();
        mammal.speak();

        System.out.println("-----------------------------");

        // =========================
        // USING MAMMAL WITH DOG
        // =========================

        // Changing to Dog
        mammal.setPet(new Dog());

        mammal.sleep();
        mammal.speak();
    }
}