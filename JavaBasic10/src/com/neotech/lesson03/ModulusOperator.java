package com.neotech.lesson03;

public class ModulusOperator {
    public static void main(String[] args) {

        int a = 13;
        int b = 5;

        int div = a / b;  //result: 2 , the rest is discarded/lost


        System.out.println("div --> " + div);

        double d1 = 13;
        double d2 = 5;

        double res = d1 / d2;

        System.out.println("res -->" + res);


        //13 % 5
        //What is the largest number in 13 that is fully divisible by 5 ?
        //10 --> remainder 13-10 --> 3

        int remainder = 13 % 5;
        System.out.println("remainder --> " + remainder);

        int num1 = 17; //I have 17 toy cars
        int num2 = 4; //I want to split those 17 cars for 4 kids

        int rem = num1 % num2;
        System.out.println("rem -->" + rem);

        //1,3,5,9,11,13             /2 --->1
        // 2,4,6,8,10,12,14         /2 --->0
    }
}
