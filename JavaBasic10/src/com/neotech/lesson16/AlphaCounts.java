package com.neotech.lesson16;

public class AlphaCounts {
    public static void main(String[] args) {
        /*
        * Homework 2:
    This exercies USES Replace() method, will learn it next class
    Create a String that should be combination of letters, numbers and special characters.
    * Find out how many alpha characters are there in the String. (alpha characters means letters)*/

        String str = "x%&#@123Ozy";
        int count = 0;

        for (int i = 0; i < str.length();i++)
        {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
            {
                count++;
            }
        }
        char ornek = str.charAt(0);

        System.out.println(count);


    }
}
