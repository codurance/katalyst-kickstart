package com.codurance.katalyst.kickstart;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorShould {

    Calculator summator;

    @Before
    public void setUp() {
        summator = new Calculator();
    }

    @Test
    public void returnSumOfNumbers() {
        assertEquals(6, summator.sum(4, 2));
    }

    @Test
    public void pleaseIgnoreMeIAmJustTestingMockito() {
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World");

        String result =iterator.next() + " " +iterator.next();

        assertEquals("Hello World", result);
    }

}