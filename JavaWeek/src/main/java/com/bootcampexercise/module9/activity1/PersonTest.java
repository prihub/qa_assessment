package com.bootcampexercise.module9.activity1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for Person class
 */
public class PersonTest {

    private Person person;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Starting Person tests");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Finished Person tests");
    }

    @Before
    public void setUp() {
        person = new Person();
    }

    @After
    public void tearDown() {
        person = null;
    }

    @Test
    public void testSetAndGetWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    @Test
    public void testSetAndGetHeight() {
        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight(), 0.0);
    }

    @Test
    public void testBMI() {
        assertEquals("Normal", person.getBodyMassIndex(70, 1.75f));
    }

    @Test
    public void testInvalidBMI() {
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75f));
    }
}