package com.stackroute.junit;

public class Between {
    public static String between(int i)       //This method verifies whether a number is between 20 and 30 and also even-Jerry or odd-Tom
    {

        String string = "";

        if (i > 20 && i < 30) {
            if (i % 2 == 0)
                string = "Jerry";
            else {
                string = "Tom";
            }
        } else
            string = "Error";
        return string;
    }
}
