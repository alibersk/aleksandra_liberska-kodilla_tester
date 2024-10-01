package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testExponPositiveNumber() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(390625, exponResult, delta);
    }

    @Test
    public void testExponFraction() {
        Calculator calculator = new Calculator();
        double a = 1.2;
        double b = 2.2;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(1.49347, exponResult, delta);
    }

    @Test
    public void testExponBasisZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 8;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(0, exponResult, delta);
    }

    @Test
    public void testExponExponentZero() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 0;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(1, exponResult, delta);
    }

    @Test
    public void testExponBasisNegative() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = 3;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(-125, exponResult, delta);
    }

    @Test
    public void testExponExponentNegative() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = -3;
        double delta = 0.0001;
        double exponResult = calculator.expon(a, b);
        assertEquals(0.008, exponResult, delta);
    }
}
