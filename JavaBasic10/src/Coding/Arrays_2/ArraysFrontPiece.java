package Coding.Arrays_2;

import java.util.Scanner;

public class ArraysFrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i=0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        System.out.print("[" + num[0]);
        if (size > 1)
            System.out.print(", "+num[1]);
        System.out.print("]");
    }
}
