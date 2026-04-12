package com.bootcampexercise.module5.activity2;

/**
 * Shape is an abstract base class for all shapes.
 * It enforces implementation of area and perimeter logic.
 */
public abstract class Shape {

    // Variable: stores color of the shape
    protected String shapeColor;

    /**
     * Sets color of shape
     *
     * @param shapeColor color value from activity class
     */
    public void setColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    /**
     * Gets color of shape
     *
     * @return shape color
     */
    public String getColor() {
        return shapeColor;
    }

    /**
     * Calculates area of shape
     */
    public abstract double calculateArea();

    /**
     * Calculates perimeter of shape
     */
    public abstract double calculatePerimeter();
}