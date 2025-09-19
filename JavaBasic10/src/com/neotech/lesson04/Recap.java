package com.neotech.lesson04;

public class Recap {

    public static void main(String[] args) {
        //arithmetic operators

        //PEMDAS

        int num1 = 5 + 5 + 5;
        System.out.println(num1);


        int num2 = 5 + 5 * 5;
        System.out.println(num2);

        //lets print directly into the console
        System.out.println(5 * 5 + 5 / 5);


        int number1 = 15;
        int number2 = 2;

        // since div is an integer, the decimal point will be dropped
        int div = number1 / number2;
        System.out.println("div --> " + div);


        int rem = number1 % number2;
        System.out.println("rem ---> " + rem);


        System.out.println("Addition vs Concatenation");

        int a = 10;
        int b = 10;

        String x = "Java";
        String y = "Tuesday";


        System.out.println(x + " " + y); // Java Tuesday
        System.out.println(x + y + a);     // JavaTuesday10

        System.out.println(x + a + b);   //Java1010
        //Java + 10 (String + int) --> String
        //Java10 + 10 (String + int) --> String --> Java1010
        System.out.println(x + (a + b)); //Java20

        System.out.println("" + a + b); //1010   --> string
        System.out.println(a + b); //20
        System.out.println(a + b + x + y); //20JavaTuesday

        System.out.println(x + y + a * b); //JavaTuesday100

        //Compiler Error
        //System.out.println(a * x);


        //+ for int, addition
        //+ for String, concatenation
        //int + int ---> int (Addition)
        //String + int ---> String (Concat)
        //int + String ---> String (Concat)
        //String * int ---> error, not allowed

        System.out.println(""); //empty string
        System.out.println(" "); //blank string (not empty, has a space)


    }

}