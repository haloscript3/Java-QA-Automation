package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = input.next();
        System.out.println("Your name is " + name);

        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("You are " + age  + "years old");

        System.out.println("What is your salaray");
        double salary = input.nextDouble();
        System.out.println("Your salary is " + salary);

        System.out.println("Are you happy ? true/false");
        boolean happy = input.nextBoolean();
        System.out.println("Happy:" + happy);
        input.close();
    }
}
