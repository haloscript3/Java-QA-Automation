package Coding;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char start = scan.next().charAt(0);
            char end = scan.next().charAt(0);
            // Write your code here
            while(start<=end)
                System.out.print(start++);
        }
}
