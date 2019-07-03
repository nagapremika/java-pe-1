package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.lang.annotation.Target;

import static org.junit.Assert.*;

public class TargetCheckerTest {
    public TargetChecker target;

    @Before
    public void setUp() {

        target = new TargetChecker();
    }

    @After
    public void tearDown() {

        target = null;
    }

    @Test
    public void givenTwoIntegersShouldReturnMatch() {
        //arrange

        //Act
        String result= target.find(22,22);
        //Assert
        assertEquals("Number guessed matches original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsLesser() {
        //arrange

        //Act
        String result=target.find(55,64);
        //Assert
        assertEquals("Number guessed is less than original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsGreater() {
        //arrange

        //Act
        String result= target.find(63,45);
        //Assert
        assertEquals("Number guessed is more than original number", result);

    }



}