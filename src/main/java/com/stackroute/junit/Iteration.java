package com.stackroute.junit;

public class Iteration {    //This class Iterates the numbers
    public static String loop(int number1){
String str="";


        for (int i = 1; i <= number1; i++) {
            for (int j = 1; j <= i; j++) {
                str=str+i;
            }

        }
        if(number1<0){
            str="Error";
            return str; }
        return str;
    }
}
