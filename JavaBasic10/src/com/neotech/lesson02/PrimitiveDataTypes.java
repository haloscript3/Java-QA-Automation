package com.neotech.lesson02;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte age = 30;

//      not allowed cuz 128 bigger than 127
//      byte age2 = 128;

        short cityCount = 15000;
        System.out.println(age);
        System.out.println(cityCount);

//      this works but its waste of memory
        int var1 = 5;
        long var2 = 123123121234L;
        System.out.println(var1);
        System.out.println(var2);

//        how to use decimals
        double var3 = 34.21;
        float var4 = 44.67F;
        System.out.println(var3);
        System.out.println(var4);
        char dollar = 36;
        System.out.println(dollar);

        char dollar1 = '$';
        char a = '1';
        char space = ' ';


        boolean istrue = true;
    }

}
