package com.bootcampexercise.module6;

/**
 * Dog class implements Animal interface.
 */
public class Dog implements Animal {

    /**
     * Dog sound implementation
     */
    @Override
    public void makeSound() {
        System.out.println("Dog says: 'Woof Woof'!");
    }

    /**
     * Dog sleep implementation
     */
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}