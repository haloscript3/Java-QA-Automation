package com.neotech.lesson11;

public class Task {
    public static void main(String[] args) {
        char[] test = new char[6];
        int i = 0;
        char ascii = 65;
        while (i<test.length)
        {
            test[i] = ascii;
            i++;
            ascii++;

        }
        System.out.print(test[1]);

    }
}
