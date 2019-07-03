package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class IterationTest {
    public Iteration iteration;

    @Before
    public void setUp() {

        iteration = new Iteration();
    }

    @After
    public void tearDown() {

        iteration = null;
    }

    @Test
    public void givenOneIntegerShouldReturnString() {
        //arrange

        //Act
        String result= iteration.loop ( 3);
        //Assert
        assertEquals("122333", result);

    }
    @Test
    public void givenOneIntegerShouldReturnLoop() {
        //arrange

        //Act
        String result= iteration.loop(5);
        //Assert
        assertEquals("122333444455555", result);

    }
    @Test
    public void givenIntegerLessThanOneShouldReturnError() {
        //arrange

        //Act
        String result= iteration.loop(-1);
        //Assert
        assertEquals("Error", result);

    }


}