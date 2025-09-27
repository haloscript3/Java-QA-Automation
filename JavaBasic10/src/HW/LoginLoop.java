package HW;

import java.util.Scanner;

public class LoginLoop {
    public static void main(String[] args) {
       // 2. Write a program that asks user to enter his/her username and password until user enters them correctly.*/
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Register / username and password");
        String registerUsername = scan.next();
        String registerPassword = scan.next();
        String u,p;

        System.out.println("Enter username and password ");
        do
        {
            u = scan.next();
            p = scan.next();
        }while (!(u.equals(registerUsername) && p.equals(registerPassword)));

        System.out.println("Login success");
    }
}