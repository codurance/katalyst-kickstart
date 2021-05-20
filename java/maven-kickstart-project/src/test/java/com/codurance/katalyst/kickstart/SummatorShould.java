package com.codurance.katalyst.kickstart;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummatorShould {

    Summator summator;

    @Before
    public void setUp() {
        summator = new Summator();
    }

    @Test
    public void returnSumOfNumbers() {
        assertEquals(6, summator.sum(4, 2));
    }

}