package Coding;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Number of people:");
        int numberOfPpl = inp.nextInt();
        System.out.println("Check amount:");
        double checkAmount = inp.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = inp.next();
        double tipAmount = 0;
        if (serviceQuality.equals("Poor"))
            tipAmount = 0.5;
        else if (serviceQuality.equals("Fair"))
            tipAmount = .10;
        else if (serviceQuality.equals("good"))
            tipAmount = 0.15;
        else if (serviceQuality.equals("Great"))
            tipAmount = 0.20;
        else if (serviceQuality.equals("Excellent"))
            tipAmount = 0.25;

        System.out.print("Number of people entered: ");
        for (int i = 0; i < numberOfPpl; i++)
            System.out.print('&');
        double totalTip = checkAmount * tipAmount;
        System.out.println("\nTotal to pay: " + (checkAmount *= (tipAmount + 1)));
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + checkAmount / numberOfPpl);
        System.out.println("Tip per person: " + totalTip / numberOfPpl);
    }
}
