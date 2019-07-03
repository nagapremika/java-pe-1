package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class EvenOrOddCheckerTest {
    public EvenOrOddChecker checker;

    @Before
    public void setUp() {

        checker = new EvenOrOddChecker();
    }

    @After
    public void tearDown() {

        checker = null;
    }

    @Test
    public void givenOneIntegerShouldReturnTom() {
        //arrange

        //Act
        String result= checker.between(23);
        //Assert
        assertEquals("Tom", result);

    }


    @Test
    public void givenOneIntegerShouldReturnJerry() {
        //arrange

        //Act
        String result= checker.between(26);
        //Assert
        assertEquals("Jerry", result);

    }
    @Test
    public void givenOneIntegerShouldReturnError() {
        //arrange

        //Act
        String result=checker.between(63936);
        //Assert
        assertEquals("Error", result);

    }


}