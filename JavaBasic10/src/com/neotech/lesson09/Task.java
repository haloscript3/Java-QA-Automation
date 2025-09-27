package com.neotech.lesson09;

public class Task {
    public static void main(String[] args) {
//        1. Print numbers from 1 to 100 in 1 line with space
//        Print numbers from 100 to 1
//        Print even numbers from 20 to 1 (2 ways)
//        Print odd numbers between 20 and 50 (2 ways)

        for (int i = 0;i <=100; i++)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 100; i >=0; i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 20; i>=1;i--)
        {
            if (i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 20; i>=1;i-=2)
        {
                System.out.print(i+" ");
        }
        System.out.println();

        for (int i=21;i<=49;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=20;i<=50;i++)
        {
            if (!(i%2==0))
            {
                System.out.print(i+" ");
            }
        }


    }
}
