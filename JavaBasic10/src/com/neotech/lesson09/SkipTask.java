package com.neotech.lesson09;

public class SkipTask {
    public static void main(String[] args) {
        for (int i = 0; i<=10;i++)
        {
            if (i == 3 || i == 6 || i==9)
            {
                continue;
            }
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 0; i<=10;i++)
        {
            if(i>=27 && i<= 33)
            {
                continue;
            }
            System.out.print(i + "");
        }

    }
}
