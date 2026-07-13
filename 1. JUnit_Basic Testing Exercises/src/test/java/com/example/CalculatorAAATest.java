package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Runs before EACH test method — fresh instance guarantees test isolation
        calculator = new Calculator();
        System.out.println("Setting up before test...");
    }

    @After
    public void tearDown() {
        // Runs after EACH test method — release resources / reset state
        calculator = null;
        System.out.println("Tearing down after test...");
    }

    @Test
    public void testAdd_AAA() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtract_AAA() {
        // Arrange
        int a = 50;
        int b = 20;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testDivideByZero_AAA() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act & Assert (combined here since we're testing an exception)
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }
}