package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Between.between;
import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class BetweenTest {
    public Between bet;

    @Before
    public void setUp() {
        System.out.println("Before");
        bet = new Between();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        bet = null;
    }

    @Test
    public void givenOneIntegerShouldReturnTom() {
        //arrange

        //Act
        String result= between(23);
        //Assert
        assertEquals("Tom", result);

    }


    @Test
    public void givenOneIntegerShouldReturnJerry() {
        //arrange

        //Act
        String result= between(26);
        //Assert
        assertEquals("Jerry", result);

    }
    @Test
    public void givenOneIntegerShouldReturnError() {
        //arrange

        //Act
        String result=between(63936);
        //Assert
        assertEquals("Error", result);

    }


}