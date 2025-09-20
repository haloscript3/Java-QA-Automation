package com.neotech.lesson06;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        if (num1>num2)
            System.out.println(num1+" is larger than " + num2);
        else if (num2>num1)
            System.out.println(num2+" is larger than " + num1);
        else
            System.out.println("both equal");
        scan.close();
    }
}
