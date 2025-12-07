package com.neotech.lesson22.Homework;

public class PrivateHomework {
    /*
    * Homework 3:
    Create a class with 3 overloaded private methods.
    Then call each overloaded methods with specific arguments and observe the results.*/
    private static void mercy ()
    {
        System.out.println("Mercy is in New York");
    }
    private static void  mercy(String city)
    {
        System.out.println("Mercy is in " + city);
    }
    private static void mercy (String city , String county)
    {
        System.out.println("Mercy is in "+ city + "," + county);
    }

    public static void main(String[] args) {

    }
}
