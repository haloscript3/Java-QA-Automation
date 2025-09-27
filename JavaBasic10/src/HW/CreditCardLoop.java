package HW;

import java.util.Scanner;

public class CreditCardLoop {
    public static void main(String[] args) {
        //4. Create a program that will be asking the user to apply for a credit card 10 times.
        //As soon you get a "yes" from the user program should stop asking.

        Scanner scan = new Scanner(System.in);
        String answer;
        int i = 0;
        do {
                System.out.println("Would you apply for credit card");
                answer = scan.next();
                if (answer.equals("yes"))
                    break;
                else
                    i++;
            }while (!(i>10));
    }
}
