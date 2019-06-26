package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static com.stackroute.junit.Reverse.reverse;
import static org.junit.Assert.*;

public class ReverseTest {
    public Reverse rev;

    @Before
    public void setUp() {
        System.out.println("Before");
        rev = new Reverse();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        rev = null;
    }

    @Test
    public void givenOneStringShouldReturnReverse() {
        //arrange

        //Act
        String result= reverse("london");
        //Assert
        assertEquals("nodnol", result);

    }
    @Test
    public void givenNullShouldReturnError() {
        //arrange

        //Act
        String result= reverse(null);
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenEmptyStringShouldMessage() {
        //arrange

        //Act
        String result= reverse("");
        //Assert
        assertEquals("Empty String", result);

    }

}