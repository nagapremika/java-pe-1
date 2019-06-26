package com.stackroute.junit;

public class Reverse {  //This class reads a string and calls reverse method


    public static String reverse(String word) {       //This method reverses the string
        String str = "";
        if (word == null) {
            str = "Error";

        }
        else if(word=="")
            str="Empty String";
        int length=word.length();
        for(int i=length-1;i>=0;i--)
            str=str+word.charAt(i);
        return str;

    }
}