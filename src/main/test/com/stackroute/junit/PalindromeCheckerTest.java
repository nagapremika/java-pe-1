package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    public PalindromeChecker checker;

    @Before
    public void setUp() {

        checker = new PalindromeChecker();
    }

    @After
    public void tearDown() {

        checker = null;
    }

    @Test
    public void givenOneIntegerShouldReturnNotPalindrome() {
        //arrange

        //Act
       String result= checker.palindrome(234342);
        //Assert
        assertEquals("234342 is not a palindrome", result);

    }
    @Test
    public void givenOneIntegerShouldReturnPalindromeLesser() {
        //arrange

        //Act
        String result= checker.palindrome(63236);
        //Assert
        assertEquals("63236 is a palindrome and sum is less than 25", result);

    }
    @Test
    public void givenOneIntegerShouldReturnPalindromeGreater() {
        //arrange

        //Act
        String result= checker.palindrome(63936);
        //Assert
        assertEquals("63936 is a palindrome and sum is greater than 25", result);

    }

}