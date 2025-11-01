package Coding.Arrays_3;

import java.util.Scanner;

public class DArray_FindMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<=rows-1; i++)
        {
            for(int j=0; j<=cols-1; j++)
            {
                arr[i][j]=inp.nextInt();
            }
        }

        //Write your code below
        int max = arr[0][0];
        for(int i=0; i<=rows-1; i++){
            for(int j=0; j<=cols-1; j++){
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
