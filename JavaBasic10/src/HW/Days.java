package HW;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        /*
        * 2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
	        If any day from 1-5 → output "It is a weekday"
	        Any day from 6-7 → output "It is a weekend",
	        Any other day → output "Invalid day"
        ----------------------------------------------------------------
       */
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the day ");
        byte day = scan.nextByte();
        if (day>=1 && day <= 7)
        {
            if (day>=1 && day <= 5)
                System.out.println("Weekday");
            else
                System.out.println("Weekend");
        }
        else
            System.out.println("Invalid day");

        scan.close();
    }
}

