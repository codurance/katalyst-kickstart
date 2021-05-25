package com.codurance.katalyst.kickstart;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class CalculatorShould {

    private Calculator calculator;

    private int num1;
    private int num2;
    private int expectedResult;

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 2, 3, 5 },
                { 6, 0, 6 },
                { 4, -2, 2 }
        });
    }

    public CalculatorShould(int num1, int num2,
                            int expectedResult){
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * This method demonstrates a very basic unit test
     */
    @Test
    public void returnSumOfNumbers() {
        assertEquals(6, calculator.sum(4, 2));
    }

    /**
     * This method demonstrates a parametrized test case
     */
    @Test
    public void returnSumOfNumbersParametrized() {
        assertEquals(this.expectedResult, calculator.sum(this.num1, this.num2));
    }

    /**
     * This method demonstrates assertJ fluent assertions
     * More info here: https://assertj.github.io/doc/#assertj-core-quick-start
     */
    @Test
    public void returnSumOfNumbersAssertJ() {
        assertThat(calculator.sum(2, 3)).isEqualTo(5);
    }


}