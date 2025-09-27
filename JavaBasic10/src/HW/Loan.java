package HW;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        /*
        *  These are extra examples that you don't need to submit.
        * Use Scanner
        * 1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
        * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
        * */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your need ");
        int loan = scan.nextInt();
        if (loan > 0 && loan <= 200000)
            System.out.println("Accepted");
        else
            System.out.println("Rejected");

        scan.close();
    }
}
