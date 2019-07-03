package com.stackroute.junit;

import static java.lang.Integer.parseInt;

public class VowelAndConsonantChecker<string1> {
    public String letter(String character)     //This method  prints vowel or consonant
    {
        int i;
        String string="";
        String string1="";
        if(character==null)
            string1="Error";
else {
            for (i = 0; i < character.length(); i++) {

                switch (character.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        string = "vowel";
                        break;
                    default:
                        string = "Consonant";
                }
                string1 = string1 + " " + string;
            }

        }


        return string1;
    }
}
