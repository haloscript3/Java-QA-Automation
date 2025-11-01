package Coding.Arrays_2;

import java.util.Scanner;

public class ArrayMakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++) {
            nums[i] = scan.nextInt();
        }


        int[] array2 = new int[size*2];
        array2[(size*2)-1]= nums[nums.length-1];
        System.out.print("[");
        for (int i = 0; i < array2.length; i++) {
            if (i==array2.length-1)
            {
                System.out.print(array2[i] + "]");
                break;
            }
            System.out.print( + array2[i]+ ", ");
        }
    }
}