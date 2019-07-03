package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    public RepeatString object;

    @Before
    public void setUp() {

        object= new RepeatString();
    }

    @After
    public void tearDown() {

        object = null;
    }

    @Test
    public void givenIntegerAndStringShouldReturnString() {
        //arrange

        //Act
        String result= object.repeat("Stack",3);
        //Assert
        assertEquals("Stackackackack", result);

    }
 @Test
    public void givenStringAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= object.repeat("",5);
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= object.repeat(null,2);
        //Assert
        assertEquals(null, result);

    }


}