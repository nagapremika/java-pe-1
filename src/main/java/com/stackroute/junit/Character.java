package com.stackroute.junit;

public class Character {
    public String letter(String c)     //This method  prints vowel or consonant
    {
        int i;
        String string="";
        String string1="";
        if(c==null)
            string1="Error";
        else {
            for (i = 0; i < c.length(); i++) {
                if (!((c.charAt(i) >= 'a' && c.charAt(i) <= 'z') || (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z'))) {
                    string = "Error";
                } else {
                    switch (c.charAt(i)) {
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
                            string = " vowel";
                            break;
                        default:
                            string = " Consonant";
                    }

                }
                string1 = string1 + string;
            }
        }
        return string1;
    }
}
