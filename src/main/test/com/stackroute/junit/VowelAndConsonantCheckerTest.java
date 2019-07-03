package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelAndConsonantCheckerTest {
    public VowelAndConsonantChecker character;

    @Before
    public void setUp() {

        character = new VowelAndConsonantChecker();
    }

    @After
    public void tearDown() {

        character= null;
    }

    @Test
    public void givenOneStringShouldReturnVowelConsonant() {
        //arrange

        //Act
        String result= character.letter("Ed");
        //Assert
        assertEquals(" vowel Consonant", result);

    }

    @Test
    public void givenOneStringShouldReturnVowelVowel() {
        //arrange

        //Act
        String result= character.letter("ae");
        //Assert
        assertEquals(" vowel vowel", result);

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