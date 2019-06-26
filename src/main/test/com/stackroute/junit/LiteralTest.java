package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Literal.find;
import static com.stackroute.junit.Palindrome.palindrome;
import static org.junit.Assert.*;

public class LiteralTest {
    public Literal lit;

    @Before
    public void setUp() {
        System.out.println("Before");
        lit = new Literal();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        lit = null;
    }

    @Test
    public void givenOneCharacterShouldReturnCapitalLetter() {
        //arrange

        //Act
        String result= find('A');
        //Assert
        assertEquals("Capital Letter", result);

    }
    @Test
    public void givenOneCharacterShouldReturnSmallLetter() {
        //arrange

        //Act
        String result= find('a');
        //Assert
        assertEquals("Small Letter", result);

    }
    @Test
    public void givenOneCharacterShouldReturnDigit() {
        //arrange

        //Act
        String result= find('4');
        //Assert
        assertEquals("Digit", result);

    }
    @Test
    public void givenOneCharacterShouldReturnSymbol() {
        //arrange

        //Act
        String result= find('%');
        //Assert
        assertEquals("Special Symbol", result);

    }

}

