package com.neotech.lesson05;

public class ElseIfCondition {
    public static void main(String[] args) {
        double d1 = 45.7;
        double d2 = 45.7;

//        how many possible conditions de we have
//        1) d1 is greater than d2
//        2) d2 is greater than d1
//        3) d1 is equal to d2

        if (d1 > d2)
            System.out.println(d1 + " is greater than " + d2);
        else if (d1 < d2)
            System.out.println(d1 + " is smaller than " + d2);
        else
            System.out.println(d1 + " is equal to " + d2);


    }
}
