package com.neotech.lesson04;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println(6 < 8);

        int a = 6;
        int b = 8;

        System.out.println(a > b);  //false
        System.out.println(a < b); //true

        int c = 8;

        System.out.println(c == b); //true


        // = --> is an assignment operator ( int number = 5;)
        // == --> checks if two values are equal (for some data types)
        // != --> this mean not equal

        System.out.println(c != b);  //false


        System.out.println("--------------------");

        double d1 = 15.5;
        double d2 = 8.5;

        boolean result = d1 > d2;
        System.out.println(result); //true

        boolean result2 = d1 == d2;
        System.out.println(result2); //false

        boolean result3 = d1 >= d2;
        System.out.println(result3);  //true
    }
}
