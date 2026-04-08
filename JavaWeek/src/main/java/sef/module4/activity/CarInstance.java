package sef.module4.activity;

public class CarInstance {
    public static void main(String[] args) {

        // Create car object
        Car car1 = new Car();

        car1.name = "Toyota";
        car1.color = "Black";
        car1.modelNo = 2023;

        // Print only car name
        System.out.println("Car Name: " + car1.name);

        // Print all attributes
        System.out.println("Car Details:");
        System.out.println("Name: " + car1.name);
        System.out.println("Color: " + car1.color);
        System.out.println("Model No: " + car1.modelNo);
    }
}
