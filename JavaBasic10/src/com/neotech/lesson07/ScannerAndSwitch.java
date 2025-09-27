package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {
    public static void main(String[] args) {
        // ask the user to enter his/her country
        // and print the language they speak

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your country:");

        String country = scan.nextLine();

        switch (country) {
            case "Spain":
                System.out.println("You speak Spanish!");
                break;
            case "Turkiye":
                System.out.println("You speak Turkish!");
                break;
            case "Kyrgzstan":
                System.out.println("You speak Kyrgyz!");
                break;
            case "Georgia":
                System.out.println("You speak Georgian!");
                break;
            case "America":
                System.out.println("You speak English!");
                break;
            case "Morocco":
                System.out.println("You speak Arabic!");
                break;

            default:
                System.out.println("I dont know about this one!");
                break;
        }

        if (country.equals("Spain")) {
            System.out.println("You speak Spanish!");
        } else if (country.equals("Turkiye")) {
            System.out.println("You speak Turkish!");
        } else if (country.equals("Kyrgzstan")) {
            System.out.println("You speak Kyrgyz!");
        } else if (country.equals("Georgia")) {
            System.out.println("You speak Georgian!");
        } else if (country.equals("America")) {
            System.out.println("You speak English!");
        } else if (country.equals("Morocco")) {
            System.out.println("You speak Arabic!");
        } else {
            System.out.println("I dont know about this one!");
        }

        scan.close();
    }
}
