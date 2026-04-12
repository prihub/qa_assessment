package com.bootcampexercise.module9.activity1;

import junit.framework.TestCase;

/**
 * Unit tests for Person class.
 */
public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() {
        person = new Person();
    }

    protected void tearDown() {
        person = null;
    }

    /**
     * Tests setters and getters.
     */
    public void testSetAndGetValues() {
        person.setWeightKg(70);
        person.setHeightMeter(1.75f);

        assertEquals(70, person.getWeightKg());
        assertEquals(1.75f, person.getHeightMeter());
    }

    /**
     * Tests BMI calculation for normal case.
     */
    public void testBMI_Normal() {
        String result = person.getBodyMassIndex(70, 1.75f);
        assertEquals("Normal", result);
    }

    /**
     * Tests BMI for underweight case.
     */
    public void testBMI_Underweight() {
        String result = person.getBodyMassIndex(45, 1.75f);
        assertEquals("Underweight", result);
    }

    /**
     * Tests invalid input handling.
     */
    public void testBMI_Invalid() {
        String result = person.getBodyMassIndex(0, 1.75f);
        assertEquals("Invalid input", result);
    }

    /**
     * Tests unrealistic values.
     */
    public void testBMI_Unrealistic() {
        String result = person.getBodyMassIndex(600, 5f);
        assertEquals("Unrealistic values", result);
    }
}