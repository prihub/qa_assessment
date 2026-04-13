package com.bootcampexercise.module10;

import junit.framework.TestCase;

/**
 * Unit tests for Calculator class
 */
public class CalculatorTest extends TestCase {

    private Calculator calc;

    protected void setUp() {
        calc = new Calculator();
    }

    protected void tearDown() {
        calc = null;
    }

    // add method tests (int)
    public void testAddInt1() {
        assertEquals(5, calc.add(2, 3));
    }

    public void testAddInt2() {
        assertEquals(0, calc.add(-2, 2));
    }

    // add method tests (double)
    public void testAddDouble1() {
        assertEquals(5.5, calc.add(2.5, 3.0));
    }

    public void testAddDouble2() {
        assertEquals(0.0, calc.add(-2.5, 2.5));
    }

    // subtract tests
    public void testSubtract1() {
        assertEquals(2, calc.subtract(5, 3));
    }

    public void testSubtract2() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    // divide tests
    public void testDivideNormal() {
        assertEquals(2, calc.divide(10, 5));
    }

    public void testDivideByZero() {
        assertEquals(0, calc.divide(10, 0)); // exception case
    }

    // multiply tests
    public void testMultiplyNormal() throws Exception {
        assertEquals(20, calc.multiply(4, 5));
    }

    public void testMultiplyException() {
        try {
            calc.multiply(-2, 5);
            fail("Exception expected");
        } catch (InvalidInputException e) {
            assertEquals("Negative values not allowed", e.getMessage());
        }
    }
}