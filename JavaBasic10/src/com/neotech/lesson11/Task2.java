package com.neotech.lesson11;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of words: Java, Thursday, day, coding, is
        //Print the following sentence: Thursday is Java coding day


        String[] str = new String[5];
        str[0] = "Java";
        str[1] = "Thursday";
        str[2] = "day";
        str[3] = "coding";
        str[4] = "is";

        System.out.print(str[1]+" "+ str[4]+" "+ str[0]+" "+ str[3]+" "+str[2]);
    }
}
