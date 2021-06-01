package com.codurance.katalyst.kickstart;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorShould {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method demonstrates a very basic unit test
     */
    @Test
    public void sum_numbers____simple_junit_test() {
        assertEquals(6, calculator.sum(4, 2));
    }

    /**
     * This method demonstrates assertJ fluent assertions
     * More info here: https://assertj.github.io/doc/#assertj-core-quick-start
     */
    @Test
    public void sum_numbers____using_AssertJ() {
        assertThat(calculator.sum(2, 3)).isEqualTo(5);
    }

    /**
     * This method demonstrates a parametrized test case using JUnitParams
     * More info here: https://github.com/Pragmatists/JUnitParams
     */
    @Test
    @Parameters({
            "2, 3, 5",
            "6, 0, 6",
            "4, -2, 2"
    })
    public void sum_numbers____parameterised_test(int num1, int num2, int result) {
        assertThat(calculator.sum(num1, num2)).isEqualTo(result);
    }

}