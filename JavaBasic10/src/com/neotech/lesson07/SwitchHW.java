package com.neotech.lesson07;

import java.util.Scanner;

public class SwitchHW {
    public static void main(String[] args) {
        /*
        *
        * Homework 1

            Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
            * any other grade --> Not Acceptable. At the end your program should print which grade was entered by the user
            * with explanation.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D): ");
        String grade = scanner.nextLine().toUpperCase();

        String explanation;
        switch (grade) {
            case "A":
                explanation = "Excellent";
                break;
            case "B":
                explanation = "Good";
                break;
            case "C":
                explanation = "Average";
                break;
            case "D":
                explanation = "Bad";
                break;
            default:
                explanation = "Not Acceptable";
        }
        System.out.println("You entered grade: " + grade + " -> " + explanation);
    }
}
