package com.bootcampexercise.module5.activity2;

public class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    // Implement abstract methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}