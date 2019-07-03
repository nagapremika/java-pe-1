package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class AlphabetCheckerTest {
    public AlphabetChecker alphabet;

    @Before
    public void setUp() {

        alphabet = new AlphabetChecker();
    }

    @After
    public void tearDown() {
       
        alphabet = null;
    }

    @Test
    public void givenOneCharacterShouldReturnCapitalLetter() {
        //arrange

        //Act
        String result= alphabet.find('A');
        //Assert
        assertEquals("Capital Letter", result);

    }
    @Test
    public void givenOneCharacterShouldReturnSmallLetter() {
        //arrange

        //Act
        String result= alphabet.find('a');
        //Assert
        assertEquals("Small Letter", result);

    }
    @Test
    public void givenOneCharacterShouldReturnDigit() {
        //arrange

        //Act
        String result= alphabet.find('4');
        //Assert
        assertEquals("Digit", result);

    }
    @Test
    public void givenOneCharacterShouldReturnSymbol() {
        //arrange

        //Act
        String result= alphabet.find('%');
        //Assert
        assertEquals("Special Symbol", result);

    }

}

