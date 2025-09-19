package com.neotech.lesson04;

public class IfCondition {

    public static void main(String[] args) {

        //if condition offer selective execution

        int num = 150;

        if (num > 200) {//if num is greater than 200

            System.out.println("Today is Wednesday!!!");
        }


        System.out.println("Today is Tuesday!!!");


        int balance = 2000;
        int need = 2000;

        if (need <= balance)  //need is less, equal, more
        {
            System.out.println("You are allowed to withdraw!!");
        }


        System.out.println("End of main method!!");

    }

}