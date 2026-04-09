package com.bootcampexercise.module6;

// Cat class implements Animal
public class Cat implements AnimalInterface {

    // Implementation of animalSound()
    public void animalSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    // Implementation of sleep()
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}
