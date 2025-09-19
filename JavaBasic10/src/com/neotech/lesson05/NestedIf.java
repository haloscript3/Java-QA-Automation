package com.neotech.lesson05;

public class NestedIf {

    public static void main(String[] args) {

        boolean isSchoolDay = false;
        boolean isMorning = false;

        if (isMorning) {
            System.out.println("Good morning");

            // second condition: school day OR not
            if (isSchoolDay) {
                System.out.println("You have to be at school!");
            } else {
                System.out.println("You should be home!");
            }

        } else {
            System.out.println("Good afternoon");
        }

    }

}