package HW;

import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {
        /*
        * Use Scanner
        Use AND,OR Operator

        1. Ask the user to enter the height in inches. Person should be classified as one of the following:
	        • short (under 60 inch)
	        • medium (between 60 -72 inch)
	        • tall (over 72 inch)

        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your height on inches = ");

        int height = scan.nextInt();

        if (!(height<0))
        {
            if (height < 60)
                System.out.println("You are short");
            else if (height >= 60 && height <= 72 )
                System.out.println("You are medium");
            else
            System.out.println("You are tall ");
        }
        else
            System.out.println("Wrong input");
        scan.close();

    }
}
