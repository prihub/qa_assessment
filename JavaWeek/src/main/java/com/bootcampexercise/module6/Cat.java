package com.bootcampexercise.module6;

/**
 * Cat class implements Animal interface.
 */
public class Cat implements Animal {

    /**
     * Cat sound implementation
     */
    @Override
    public void makeSound() {
        System.out.println("Cat says: 'Meow Meow'!");
    }

    /**
     * Cat sleep implementation
     */
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}