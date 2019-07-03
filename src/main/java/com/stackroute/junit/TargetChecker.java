package com.stackroute.junit;

public class TargetChecker {
    public  String find(Integer guess, int target) {
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
