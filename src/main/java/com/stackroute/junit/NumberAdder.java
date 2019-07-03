package com.stackroute.junit;

public class NumberAdder {     //total() method adds the numbers in number string
  public   String total(String number)//Method to add numbers in String
    {
        int sum=0;

        String string="";
        String[] array=number.split(" ");
        int arrayOfNum[] = new int[array.length];
try{
        for(int i=0;i<array.length;i++) {
            arrayOfNum[i] = Integer.parseInt(array[i]);

        }
}
catch(Exception exception){
  string="Error";
 return string;
    }
        for(int i=0;i<array.length;i++) {
            sum=arrayOfNum[i]+sum;

        }
        string=""+sum;
        return (string);
    }
}
