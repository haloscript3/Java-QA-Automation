package Coding;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // your code
        String list = "";
        do
        {
            System.out.println("Please enter guest name:");
            list += input.next() + ", ";
            System.out.println("Do you want to enter new guest name:");
        }while(input.next().equals("yes"));
        System.out.println("Guest's list: " +list);
    }
}
