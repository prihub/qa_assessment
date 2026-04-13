package com.bootcampexercise.module10;

/**
 * Demonstrates interface implementation
 */
public class InterfaceActivityClass {

    public static void main(String[] args) {

        // create bike object and call methods
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println();

        // create car object and call methods
        Car car = new Car();
        car.start();
        car.stop();
    }
}
