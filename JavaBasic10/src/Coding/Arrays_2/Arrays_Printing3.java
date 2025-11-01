package Coding.Arrays_2;

import java.util.Scanner;

public class Arrays_Printing3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"apple","banana","kiwi", "grape", "milk", "soda"};

        //write your code below
        for (int i = 0; i < 4; i++)
        {
            System.out.println(arr[i]+ ", "+ arr[i+1]+ ", " + arr[i+2]);
        }
    }
}
