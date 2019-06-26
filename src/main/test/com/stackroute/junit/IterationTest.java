package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Iteration.loop;
import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class IterationTest {
    public Iteration iter;

    @Before
    public void setUp() {
        System.out.println("Before");
        iter = new Iteration();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        iter = null;
    }

    @Test
    public void givenOneIntegerShouldReturnString() {
        //arrange

        //Act
        String result= loop ( 3);
        //Assert
        assertEquals("122333", result);

    }
    @Test
    public void givenOneIntegerShouldReturnLoop() {
        //arrange

        //Act
        String result= loop(5);
        //Assert
        assertEquals("122333444455555", result);

    }
    @Test
    public void givenIntegerLessThanOneShouldReturnError() {
        //arrange

        //Act
        String result= loop(-1);
        //Assert
        assertEquals("Error", result);

    }


}