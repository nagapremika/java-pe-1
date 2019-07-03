package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberAdderTest {
    public NumberAdder add;

    @Before
    public void setUp() {

        add = new NumberAdder();
    }

    @After
    public void tearDown() {

        add = null;
    }

    @Test
    public void givenOneStringShouldReturnSum() {
        //arrange

        //Act
        String result= add.total("23 4 2");

        //Assert
        assertEquals("29", result);

    }
    @Test
    public void givenOneStringShouldReturnError() {
        //arrange

        //Act
        String result= add.total("23 4 p");

        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullShouldReturnError() {
        //arrange

        //Act
        String result= add.total("null");

        //Assert
        assertEquals("Error", result);

    }

}