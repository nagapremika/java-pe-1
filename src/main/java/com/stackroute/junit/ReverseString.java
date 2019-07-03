package com.stackroute.junit;

public class ReverseString {  //This class reads a string and calls reverse method


    public  String reverseString(String word) {       //This method reverses the string
        String string = "";
        if (word == null) {
            string = "Error";
        }
        else if(word=="") {
            string="Empty String";
        }
        else {
            int length = word.length();
            for (int i = length - 1; i >= 0; i--) {
                string = string + word.charAt(i);
            }
        }
        return string;

    }
}