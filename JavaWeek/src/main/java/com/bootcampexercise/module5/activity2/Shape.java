package com.bootcampexercise.module5.activity2;

// Abstract class
public abstract class Shape {

    public String color;

    public Shape() {
    }

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}