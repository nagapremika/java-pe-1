package com.stackroute.junit;

public class Sorting {
    int sum = 0, remainder, count = 0, i;

    public int sum(int input) {     //This method prints the number in descending order and gives sum of even numbers
        int temp = input;

        while (temp != 0) {
            remainder = temp % 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
            temp = temp / 10;
            count++;
        }
        sumCheck(sum);
        return sum;
    }

    public boolean sumCheck(int sum) {
        boolean result;
        if (sum < 15) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public int[] order(int input, int size) {

        int temp = input;

        int[] arr = new int[size];
        for (i = 0; size > i; i++) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }

        for (i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }
            }
        }


        return arr;

    }
}