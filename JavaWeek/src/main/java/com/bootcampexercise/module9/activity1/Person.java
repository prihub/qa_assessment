package com.bootcampexercise.module9.activity1;

/**
 * Represents a person with weight and height
 */
public class Person {

    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * calculates BMI and returns category
     */
    public String getBodyMassIndex(int weight, float height) {

        // validate inputs
        if (weight <= 0 || height <= 0) {
            return "Invalid input";
        }

        if (weight > 500 || height > 3) {
            return "Unrealistic values";
        }

        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}