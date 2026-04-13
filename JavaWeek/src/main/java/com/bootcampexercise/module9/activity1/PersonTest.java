package com.bootcampexercise.module9.activity1;

import junit.framework.TestCase;

/**
 * Unit tests for Person class
 */
public class PersonTest extends TestCase {

    private Person person;

    // initialize object before each test
    protected void setUp() {
        person = new Person();
    }

    // cleanup after each test
    protected void tearDown() {
        person = null;
    }

    // test getters and setters
    public void testSetAndGetWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    public void testSetAndGetHeight() {
        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight());
    }

    // test BMI calculation
    public void testGetBodyMassIndex() {
        String result = person.getBodyMassIndex(70, 1.75f);
        assertEquals("Normal", result);
    }
}