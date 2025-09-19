package com.neotech.lesson05;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Write a program.
         * Create a variable day (1-7)
         * For every weekday, print
         *       "Today is Monday and we are working!"
         * for weekend , print
         *       "We are on break on Weekends"
         * */


        byte day = 2;

        if (day == 1)
            System.out.println("Today is Monday and we are working!");
        else if (day == 2)
            System.out.println("Today is Tuesday and we are working!");
        else if (day == 3)
            System.out.println("Today is Wednesday and we are working!");
        else if (day == 4)
            System.out.println("Today is Thursday and we are working!");
        else if (day == 5)
            System.out.println("Today is Friday and we are working!");
        else
            System.out.println("We are on break on Weekends");

        //handle all cases

        if (day < 1)
            System.out.println("Wrong value");
        else if (day < 6)
            System.out.println("It is weekday");
        else if (day < 8)
            System.out.println("its weekend");
        else
            System.out.println("wrong value");

    }
}
