package com.neotech.lesson04;

public class IfElse {

    public static void main(String[] args) {

        //Let us assume we have $5000 in our account

        int myBalance = 5000;
        int myRequest = 7000;

        if (myRequest <= myBalance) { //I have enough, so this is allowed
            System.out.println("Enjoy it!!!");
        } else //no need for a condition here (this means every other situation)
        {    //in this case, it means if myRequest > myBalance
            System.out.println("Request Denied!!! You requested "
                    + myRequest + " but you only have " + myBalance + "!!!");

        }


        System.out.println("-----------------------");

        int hours = 5;

        if (hours >= 10) {
            System.out.println("Good Job!");
        } else {
            System.out.println("You need to study more!!!!");
        }

    }

}