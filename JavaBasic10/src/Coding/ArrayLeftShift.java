package Coding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int f = nums[0];
        int from = 1 ;
        for(; from<nums.length;from++)
        {
            nums[from-1] = nums[from];
        }
        nums[from-1] = f;
        // DO not touch this part. It is to print out an Array
        System.out.println(Arrays.toString(nums));
    }
}
