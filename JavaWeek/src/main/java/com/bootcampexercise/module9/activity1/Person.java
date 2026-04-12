package com.bootcampexercise.module9.activity1;

/**
 * Represents a person with height and weight.
 * Provides functionality to calculate BMI.
 */
public class Person {

    private int weightKg;
    private float heightMeter;

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public float getHeightMeter() {
        return heightMeter;
    }

    public void setHeightMeter(float heightMeter) {
        this.heightMeter = heightMeter;
    }

    /**
     * Calculates BMI and returns category.
     * Includes validation for invalid or unrealistic values.
     */
    public String getBodyMassIndex(int weightKg, float heightMeter) {

        // Validation checks
        if (weightKg <= 0 || heightMeter <= 0) {
            return "Invalid input";
        }

        if (weightKg > 500 || heightMeter > 3) {
            return "Unrealistic values";
        }

        double bmi = weightKg / (heightMeter * heightMeter);

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