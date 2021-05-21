package com.codurance.katalyst.kickstart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorShould {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void returnSumOfNumbers() {
        assertEquals(6, calculator.sum(4, 2));
    }

}