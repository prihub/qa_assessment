package com.bootcampexercise.module6;

// Dog class implements Animal
public class Dog implements AnimalInterface {

    // Implementation of animalSound()
    public void animalSound() {
        System.out.println("Dog says: 'Woof Woof'!");
    }

    // Implementation of sleep()
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
