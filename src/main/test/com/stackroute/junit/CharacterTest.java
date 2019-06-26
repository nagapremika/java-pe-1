package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class CharacterTest {
    public Character character;

    @Before
    public void setUp() {
        System.out.println("Before");
        character = new Character();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        character= null;
    }

    @Test
    public void givenOneStringShouldReturnConsonantVowel() {
        //arrange

        //Act
        String result= character.letter("Ed");
        //Assert
        assertEquals(" vowel Consonant", result);

    }

    @Test
    public void givenIntegerShouldReturnError() {
        //arrange

        //Act
        String result= character.letter("2");
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullShouldReturnError() {
        //arrange

        //Act
        String result= character.letter(null);
        //Assert
        assertEquals("Error", result);

    }

}