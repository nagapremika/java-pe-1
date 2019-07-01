package com.stackroute.junit;

public class Target {   //Compares target and guess number
    public static String find(Integer guess, int target) {
        String string = "";
        if (target > guess) {
            string = "Number guessed is less than original number";
            return string;
        } else if (target == guess) {
            string = "Number guessed matches original number";
            return string;
        } else if(target<guess){
            string = "Number guessed is more than original number";
            return string;
        }
        else{
            string="Error";
            return string;
        }
    }
}
