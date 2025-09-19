package com.neotech.lesson04;

public class CompoundOperator {

    public static void main(String[] args) {

        // aka shorthand operator

        int num = 100; // declare a variable and assign it value
        System.out.println(num);

        //I re-assigned its value
        num = 150;
        System.out.println(num);

        num = num + 50;
        System.out.println(num);

        //another form to do the same operation
        num += 100; //num = num + 100
        System.out.println(num);

        //we can do the same for subtraction
        num -= 100;
        System.out.println(num);

        num /= 5;  //num = num / 5;
        System.out.println(num);

        num *= 6; //num = num * 6;
        System.out.println(num);

        num %= 8; //num = num % 8
        System.out.println(num);


    }

}