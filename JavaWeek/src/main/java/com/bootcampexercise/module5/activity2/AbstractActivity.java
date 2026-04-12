package com.bootcampexercise.module5.activity2;

/**
 * AbstractActivity demonstrates abstraction where all shape values
 * are assigned in this class instead of inside shape classes.
 */
public class AbstractActivity {

    /**
     * Main method - program execution starts here
     */
    public static void main(String[] args) {

        // =========================
        // RECTANGLE OBJECT
        // =========================

        Rectangle rectangleObject = new Rectangle();

        // Setting rectangle properties (DONE HERE as requested)
        rectangleObject.setColor("Blue");
        rectangleObject.length = 10;
        rectangleObject.breadth = 5;

        // Output: Rectangle details
        System.out.println("Rectangle Color: " + rectangleObject.getColor());
        System.out.println("Rectangle Area: " + rectangleObject.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangleObject.calculatePerimeter());

        System.out.println("-----------------------------");

        // =========================
        // CIRCLE OBJECT
        // =========================

        Circle circleObject = new Circle();

        // Setting circle properties (DONE HERE as requested)
        circleObject.setColor("Red");
        circleObject.radius = 7;

        // Output: Circle details
        System.out.println("Circle Color: " + circleObject.getColor());
        System.out.println("Circle Area: " + circleObject.calculateArea());
        System.out.println("Circle Perimeter: " + circleObject.calculatePerimeter());
    }
}