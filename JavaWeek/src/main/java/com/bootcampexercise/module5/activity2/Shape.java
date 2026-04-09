package com.bootcampexercise.module5.activity2;

// Abstract class
public abstract class Shape {

    private String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}