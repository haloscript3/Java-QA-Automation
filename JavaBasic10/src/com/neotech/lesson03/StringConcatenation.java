package com.neotech.lesson03;


public class StringConcatenation {
    public static void main(String[] args) {
//        + operator concatenates (Joins) Strings

        System.out.println("Hello" + " - " + "World");

        String language = "Java";

        System.out.println("I love Java!");
        System.out.println("I love " + language + "!");

        String s1 = "I love ";
        String s2 = " programing!";

        System.out.println(s1 + language + s2);

//        Spacing matters in java

        System.out.println("Maya");
        System.out.println("              Maya");
        System.out.println("Maya");

//        string + number

        System.out.println("whu is everybody scared of number " + 13);

//        string + number ===> String

        String s3 = "Hello " + 13;
        System.out.println(s3);
        String s4 = s3 + 1;
        System.out.println(s4);
        System.out.println("i have " + 2 + 2 + "cats");

    }
}
