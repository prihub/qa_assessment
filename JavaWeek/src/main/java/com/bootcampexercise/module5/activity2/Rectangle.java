package com.bootcampexercise.module5.activity2;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}