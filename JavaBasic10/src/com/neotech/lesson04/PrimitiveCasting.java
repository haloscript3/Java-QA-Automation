package com.neotech.lesson04;

public class PrimitiveCasting {

    public static void main(String[] args) {
        //What primitive data types do we have???
        //byte, short, int, long, float, double, char, boolean

        //Why do you think we should have 6 different types for numbers?

        //sort by size
        //byte --> short  --> int --> long --> float --> double


        double d1 = 3.5; //no casting
        System.out.println(d1);

        double d2 = 5; //casting happened (from int to double)
        System.out.println(d2);

        //compiler error --> I would lose data
        //	int num = 5.5;
        //	System.out.println(num);


        //we are telling Java to convert double into integer
        //we will lose the decimal
        int num2 = (int) 6.5;
        System.out.println(num2);


        byte b1 = (byte) 5250;
        System.out.println(b1);
        //   00001111
        //   100000000100010000000000
        //	 00000000000000000000000000000000000000000000000000000000

        int num3 = 50;
        byte b2 = (byte) num3;
        System.out.println(b2);

        //another narrowing example
        long L1 = 17L;
        int num4 = (int) L1;
        System.out.println(num4);

        long L2 = 1453463465475647L;
        int num5 = (int) L2;
        System.out.println(num5);

        //smaller container to larger ---> widening (automatically)
        int num6 = 150; //could be a byte, fiting it into an int

        //larger container to smaller ---> narrowing (Java will NOT do it automatically)
        int num7 = (int) 5.5; //Java will not allow this without me specifying it


        //I can specify even for smaller to larger
        float f1 = (float) num6;

    }

}