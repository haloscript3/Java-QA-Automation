package Recap;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to store ?");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] array = new int[input];
        int i = 0;
        while(i<=array.length-1)
        {
            System.out.println("Enter the values");
            int values = scan.nextInt();
            array[i]=values;
            i++;
        }
        for (int j =0;j< array.length;j++ )
        {
            System.out.print(array[j]+" ");
        }
    }
}
