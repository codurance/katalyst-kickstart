package com.codurance.katalyst.kickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoShould {

    public class MockedClass {

        public Boolean returnFalse() {
            return null;
        }
    }

    @Test
    public void mockInstanceMethods() {

        MockedClass mockedObject = mock(MockedClass.class);
        when(mockedObject.returnFalse()).thenReturn(false);

        assertFalse(mockedObject.returnFalse());
    }
}
