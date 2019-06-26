package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static com.stackroute.junit.Repeat.repeat;
import static org.junit.Assert.*;

public class RepeatTest {
    public Repeat rep;

    @Before
    public void setUp() {
        System.out.println("Before");
        rep= new Repeat();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        rep = null;
    }

    @Test
    public void givenIntegerAndStringShouldReturnString() {
        //arrange

        //Act
        String result= repeat("Stack",3);
        //Assert
        assertEquals("Stackackackack", result);

    }
 @Test
    public void givenStringAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= repeat("",5);
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= repeat(null,2);
        //Assert
        assertEquals("Error", result);

    }


}