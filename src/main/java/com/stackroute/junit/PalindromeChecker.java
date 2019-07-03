package com.stackroute.junit;

public class PalindromeChecker{
    public  String  palindrome(int i){       //This method prints whether the number is palindrome and sum is less than or greater than 25
        int  number = i;
        int remainder, swap = 0, s = 0;
        while (number != 0) {
            remainder = number % 10;
            swap = swap * 10 + remainder;
            number = number / 10;

        }
        if (i == swap) {
            while(swap!=0) {
                remainder = swap % 10;
                s = s + remainder;
                swap = swap / 10;
            }
            if (s > 25){
                String str=i+" is a palindrome and sum is greater than 25";
            return str;
            }
            else{
                String str=i+" is a palindrome and sum is less than 25";
            return str;
            }


        } else {
            String str=i+" is not a palindrome";
            return str;
        }


    }
}
