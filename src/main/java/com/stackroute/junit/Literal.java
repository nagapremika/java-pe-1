package com.stackroute.junit;

public class Literal {
    public static String find(char character)     //This method  prints uppercase or lower case or digit or symbol
    {
        String string="";
        if(Character.isUpperCase(character))
            string="Capital Letter";
        else if(Character.isLowerCase(character))
           string= "Small Letter";
        else if(Character.isDigit(character))
            string="Digit";
        else
            string="Special Symbol";
        return string;
    }
}
