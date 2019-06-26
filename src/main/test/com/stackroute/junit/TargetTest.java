package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static com.stackroute.junit.Target.find;
import static org.junit.Assert.*;

public class TargetTest {
    public Target tar;

    @Before
    public void setUp() {
        System.out.println("Before");
        tar = new Target();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        tar = null;
    }

    @Test
    public void givenTwoIntegersShouldReturnMatch() {
        //arrange

        //Act
        String result= find(22,22);
        //Assert
        assertEquals("Number guessed matches original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsLesser() {
        //arrange

        //Act
        String result= find(55,64);
        //Assert
        assertEquals("Number guessed is less than original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsGreater() {
        //arrange

        //Act
        String result= find(63,45);
        //Assert
        assertEquals("Number guessed is more than original number", result);

    }



}