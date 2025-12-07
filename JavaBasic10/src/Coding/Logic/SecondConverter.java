package Coding.Logic;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {
                //YOUR CODE HERE:
                Scanner scan = new Scanner (System.in);
                int inputSeconds,hours,minutes,seconds;
                System.out.println("Enter seconds:");
                inputSeconds = scan.nextInt();

                seconds = inputSeconds % 60;
                minutes = (inputSeconds / 360);
                hours = minutes / 60;

                System.out.println(hours+" hours, "+minutes+" minutes, "+"and "+seconds+" seconds");

    }
    }
