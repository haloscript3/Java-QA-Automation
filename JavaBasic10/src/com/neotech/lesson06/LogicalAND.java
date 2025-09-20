package com.neotech.lesson06;

public class LogicalAND {
    // declare a number (int)
    // if the number is between 1 and 10 --> call it a small number
    // if the number is between 11 and 100 --> call it a medium number
    // if the number is between 101 and 1000 --> call it a large number
    // numbers more than 1000 are out of range

    public static void main(String[] args) {

        int number = 40;

        if (number >= 1 && number <= 10) {
            System.out.println("It is a small number");
        } else if (number >= 11 && number <= 100) {
            System.out.println("It is a medium number");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("It is a large number");
        } else {
            System.out.println("Out of range!!!");
        }
    }
}
