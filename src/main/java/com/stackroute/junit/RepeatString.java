package com.stackroute.junit;

import java.util.Objects;

public class RepeatString {
    public  String repeat(String word, int n)    //This  method  repeats the substring for n times
    {
        if(word==null) {
            return null;
        }
        int length=word.length();

        String str = "";
                    if (word.equals("")) {
                str = "Error";

            } else if (word.length()> 0) {
                String string = word.substring(length - n, length);
                for (int i = 0; i < n; i++) {
                    str = str + string;
                                 }
                        str = word + str;
            }


        return str;
    }
}

