package com.neotech.lesson16;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Homework1 {
//    Create a method createEmail(). Based on provided users firstName,
//    lastName and emailType, your method should return complete email address.
//            Example:
//    firstName -> john
//    lastName -> snow
//    emailType -> gmail
//return -> johnsnow@gmail.com

    String createEmail(String firstName , String lastName, String emailType)
    {
        String  email;
        email = firstName + lastName + "@" + emailType + ".com";
        return email;
    }
    public static void main(String[] args) {
        Homework1 hw = new Homework1();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name , last name and mailType ");
        String resultMail = hw.createEmail(scan.next(),scan.next(),scan.next());
        System.out.println(resultMail.isBlank());
    }
}
