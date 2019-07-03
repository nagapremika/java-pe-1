package com.stackroute.junit;

public class TargetChecker {
    public  String find(int guess, int target) {
  //Compares target and guess number

        String string = "";
        if (target > guess) {
            string = "Number guessed is less than original number";

        } else if (target == guess) {
            string = "Number guessed matches original number";

        } else if(target<guess){
            string = "Number guessed is more than original number";

        }
        else{
            string="Error";

        }
        return string;
    }
}
