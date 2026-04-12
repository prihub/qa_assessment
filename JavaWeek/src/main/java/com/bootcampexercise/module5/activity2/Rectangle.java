package com.bootcampexercise.module5.activity2;

/**
 * Rectangle class implements area and perimeter logic.
 * Dimensions are provided externally from AbstractActivity.
 */
public class Rectangle extends Shape {

    // Variable: length of rectangle (set from Activity class)
    public double length;

    // Variable: breadth of rectangle (set from Activity class)
    public double breadth;

    /**
     * Calculates area of rectangle
     *
     * @return length * breadth
     */
    @Override
    public double calculateArea() {
        return length * breadth;
    }

    /**
     * Calculates perimeter of rectangle
     *
     * @return 2 * (length + breadth)
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}