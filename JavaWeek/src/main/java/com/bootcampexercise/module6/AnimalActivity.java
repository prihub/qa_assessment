package com.bootcampexercise.module6;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Use interfaces to declare identifiers
        AnimalInterface cat = new Cat();
        AnimalInterface dog = new Dog();

        Mammal mammal = new Mammal("Charlie");

        // Set animal to cat
        mammal.setAnimal(cat);

        // Execute methods
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        // Set animal to dog
        mammal.setAnimal(dog);

        // Execute methods
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
