package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ReverseStringTest {
    public ReverseString reverse;

    @Before
    public void setUp() {

        reverse = new ReverseString();
    }

    @After
    public void tearDown() {

        reverse = null;
    }

    @Test
    public void givenOneStringShouldReturnReverse() {
        //arrange

        //Act
        String result= reverse.reverseString("london");
        //Assert
        assertEquals("nodnol", result);

    }
    @Test
    public void givenNullShouldReturnError() {
        //arrange

        //Act
        String result= reverse.reverseString(null);
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenEmptyStringShouldMessage() {
        //arrange

        //Act
        String result= reverse.reverseString("");
        //Assert
        assertEquals("Empty String", result);

    }

}