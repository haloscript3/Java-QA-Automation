package com.neotech.lesson16;
import java.util.Scanner;
public class ParentsName {
    /*
    * Homework 3:
    Write a program that reads two parent's first names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    If it is a boy get half from dad and half from mom.
    If it is a girl get half from mom and half from dad.

        Example Output:
            Mom's first name? Mary
            Dad's first name? Daniel
            Boy or Girl? boy
            Suggested baby name: DANRY
        Example Output:
            Mom's first name? Mary
            Dad's first name? Daniel
            Boy or Girl? girl
            Suggested baby name: MAIEL
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String mom = scan.next();
        System.out.println("Dad's first name?");
        String dad = scan.next();
        System.out.println("Boy or Girl?");
        String gender = scan.next();
        String name = "";

        if(gender.equalsIgnoreCase("boy"))
        {
            for (int i = 0; i < dad.length()/2; i++)
                name += dad.charAt(i);
            for (int i = mom.length()/2; i < mom.length() ; i++)
                name += mom.charAt(i);
        }
        if (gender.equalsIgnoreCase("girl"))
        {
            for (int i = 0; i < mom.length()/2; i++)
                name += mom.charAt(i);
            for (int i = dad.length()/2; i < dad.length() ; i++)
                name += dad.charAt(i);
        }
        System.out.println(name.toUpperCase());
    }
}
