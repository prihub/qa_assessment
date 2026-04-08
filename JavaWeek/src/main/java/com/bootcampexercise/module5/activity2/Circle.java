package com.bootcampexercise.module5.activity2;

public class Circle extends Shape {

    double radius = 5;   // example value

    // Implement abstract methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}