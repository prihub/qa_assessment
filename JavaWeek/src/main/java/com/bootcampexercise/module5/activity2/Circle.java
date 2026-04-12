package com.bootcampexercise.module5.activity2;

/**
 * Circle class implements area and perimeter logic.
 * Radius is set from AbstractActivity class.
 */
public class Circle extends Shape {

    // Variable: radius of circle (set from Activity class)
    public double radius;

    /**
     * Calculates area of circle
     *
     * Formula: π * r^2
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates perimeter (circumference)
     *
     * Formula: 2 * π * r
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}