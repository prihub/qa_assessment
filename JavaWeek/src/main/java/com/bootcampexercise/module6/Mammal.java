package com.bootcampexercise.module6;

public class Mammal {

    private AnimalInterface myAnimal;
    private String name;

    // Constructor with parameter name
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(AnimalInterface animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is ...");
        // Use Animal sleep implementation
        myAnimal.sleep();
    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is ...");
        // Use Animal animalSound implementation
        myAnimal.animalSound();
    }
}
