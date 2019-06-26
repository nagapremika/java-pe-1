package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class PalindromeTest {
    public Palindrome pal;

    @Before
    public void setUp() {
        System.out.println("Before");
        pal = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        pal = null;
    }

    @Test
    public void givenOneIntegerShouldReturnNotPalindrome() {
        //arrange

        //Act
       String result= palindrome(234342);
        //Assert
        assertEquals("234342 is not a palindrome", result);

    }
    @Test
    public void givenOneIntegerShouldReturnPalindromeLesser() {
        //arrange

        //Act
        String result= palindrome(63236);
        //Assert
        assertEquals("63236 is a palindrome and sum is less than 25", result);

    }
    @Test
    public void givenOneIntegerShouldReturnPalindromeGreater() {
        //arrange

        //Act
        String result= palindrome(63936);
        //Assert
        assertEquals("63936 is a palindrome and sum is greater than 25", result);

    }

}