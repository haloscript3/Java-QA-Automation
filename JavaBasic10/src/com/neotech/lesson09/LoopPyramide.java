package com.neotech.lesson09;

import javax.xml.transform.Source;
import java.util.Scanner;

public class LoopPyramide {
	
	public static void main(String[] args) 
	{
//		Ask the user to enter an integer and build the following pattern:
//			Hint: Use scanner, if user entered number 5, there should be 5 rows.
//			In the first row, 0 spaces, (2 * 5) - 1 stars
//			In the second row, 1 spaces, (2 * 4) - 1 stars
//			In the third row, 2 spaces, (2 * 3) - 1 stars
//			In the fourth row, 3 spaces, (2 * 2) - 1 stars
//			In the fifth row, 4 spaces, (2 * 1) - 1 stars
//
//			*********
//			 *******
//			  *****
//			   ***
//			    *



        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int space = 0;
        int stars = row*2-1;


        while (row > 0)
        {
            stars = row * 2 - 1;
            for (int i = 0;i<space;i++)
            {
                System.out.print(" ");
            }
            space++;
            for (int i = 0; i<stars;i++)
            {
                System.out.print("*");
            }
            System.out.println();
            row--;
        }

//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter an integer: ");
//                int n = scanner.nextInt();
//
//                // Generate the pattern
//                for (int row = 0; row < n; row++) {
//                    // Print spaces
//                    for (int space = 0; space < row; space++) {
//                        System.out.print(" ");
//                    }
//
//                    // Print stars
//                    int stars = (2 * (n - row)) - 1;
//                    for (int star = 0; star < stars; star++) {
//                        System.out.print("*");
//                    }
//
//                    // Move to next line
//                    System.out.println();
//                }
//
//                scanner.close();
            }
        }

