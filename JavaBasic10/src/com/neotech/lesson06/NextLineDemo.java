package com.neotech.lesson06;

import java.util.Scanner;

public class NextLineDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine(); // grabs the full line until enter is pressed

        System.out.println("You entered: " + fullName);

        System.out.println("Enter your full name:");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        System.out.println("Last name is " + lastName);

        scanner.close();
    }
}
