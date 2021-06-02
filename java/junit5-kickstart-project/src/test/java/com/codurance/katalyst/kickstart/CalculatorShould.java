package com.codurance.katalyst.kickstart;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorShould {

    private Calculator calculator;


    @BeforeEach
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
     * This method demonstrates a parametrized test case
     */
    @ParameterizedTest(name="#{index} - Test with Argument={0},{1},{2}")
    @CsvSource({
            "2, 3, 5",
            "6, 0, 6",
            "4, -2, 2"
    })
    public void sum_numbers____parameterised_test(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, calculator.sum(num1, num2));
    }


}