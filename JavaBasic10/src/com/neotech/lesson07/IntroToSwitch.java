package com.neotech.lesson07;

public class IntroToSwitch {
    public static void main(String[] args) {
        // given the day number, print the day name
        int number = 5;
        String day;

        if (number == 1) {
            // System.out.println("Monday");
            day = "Monday";
        } else if (number == 2) {
            // System.out.println("Tuesday");
            day = "Tuesday";
        } else if (number == 3) {
            // System.out.println("Wednesday");
            day = "Wednesday";
        } else if (number == 4) {
            // System.out.println("Thursday");
            day = "Thursday";
        } else if (number == 5) {
            // System.out.println("Friday");
            day = "Friday";
        } else if (number == 6) {
            // System.out.println("Saturday");
            day = "Saturday";
        } else if (number == 7) {
            // System.out.println("Sunday");
            day = "Sunday";
        } else {
            // System.out.println("Invalid number");
            day = "Invalid entry";
        }

        System.out.println("--------IF/ELSE version--------");
        System.out.println(number + " represents " + day);

        // using the switch-case statement
        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid entry";
                break;
        }

        System.out.println("--------Switch/Case version--------");
        System.out.println(number + " represents " + day);

    }
}
