package com.neotech.lesson22.Homework;

public class Overload {
    /*
    * Homework 2:
        Then call each overloaded methods with specific arguments and observe the results.
    * */

    public static void ozzy(String str)
    {
        System.out.println("I will" + str + "smoking!");
    }
    public static void ozzy(String str , int time)
    {
        System.out.println("I will " + str + "smoking in " + time );
    }
    public static void ozzy(String str , int time , String timeline)
    {
        System.out.println("I will " + str + " smoking in " + time + " " + timeline);
    }

    public static void main(String[] args)
    {
        ozzy("quit");
    }
}
