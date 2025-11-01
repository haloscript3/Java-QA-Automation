package com.neotech.lesson16;

public class StringReplaceHW {
    public static void main(String[] args) {
        /*
        * Homework 1:
    This exercies USES Replace() method, will learn it next class
    Create a String that will hold a sentence.Write a program to get a new String without any spaces.

         */
//        String str1 = "java c javascript golang";
//        String str2 = "";
//
//        for (int i = 0; i < str1.length(); i++)
//            if (str1.charAt(i) != ' ')
//                str2 += str1.charAt(i);
//        System.out.println(str2);
//
        String str3 = "java c javascript golang";
        String str4 = "";
        str4 = str3.replace(" ","");
        System.out.println(str4);

    }
}
