package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class DigitTest {
    public Digit digit;

    @Before
    public void setUp() {
        System.out.println("Before");
        digit = new Digit();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        digit = null;
    }

    @Test
    public void givenOneIntegerShouldReturnValues() {
        //arrange

        //Act
        Digit.Result result= Digit.sum(4563);
        //Assert
        assertEquals("6543", result.order);
        assertEquals(10, result.total);
        assertEquals(false, result.value);

    }
    @Test
    public void givenFiveDigitIntegerShouldReturnValues() {
        //arrange

        //Act
        Digit.Result result= Digit.sum(71412);
        //Assert
        assertEquals("74211", result.order);
        assertEquals(6, result.total);
        assertEquals(false, result.value);

    }
    @Test
    public void givenOneIntegerShouldReturnValueTrue() {
        //arrange

        //Act
        Digit.Result result= Digit.sum(45683);
        //Assert
        assertEquals("86543", result.order);
        assertEquals(18, result.total);
        assertEquals(true, result.value);

    }

}