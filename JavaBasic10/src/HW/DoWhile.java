package HW;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        2. Write a program that asks the user to enter his/her username and password until the user enters them correctly.
        String u="Halo";
        String p = "123456";
        Scanner scan = new Scanner(System.in);
        String u1;
        String p1;

        do {
            System.out.println("Enter your username and passoword");
            u1 = scan.next();
            p1 = scan.next();
        }while (!(u1.equals(u)&& p1.equals(p)));
        System.out.println("Login success");
    }
}
