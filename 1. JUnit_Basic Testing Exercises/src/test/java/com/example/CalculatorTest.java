package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001); // delta for double comparison
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        calculator.divide(5, 0);
    }

    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }
}