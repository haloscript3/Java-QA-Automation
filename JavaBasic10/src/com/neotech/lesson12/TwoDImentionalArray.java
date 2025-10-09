package com.neotech.lesson12;

public class TwoDImentionalArray {
    public static void main(String[] args) {
        int[][] numbers = new int[2][4];// 2 rows and 4 columns

        // lets initialize the elements of the first row
        numbers[0][0] = 3;
        numbers[0][1] = 5;
        numbers[0][2] = 7;
        numbers[0][3] = 2;

        // 3 5 7 2
        // 0 0 0 0

        // lets initialize the elements of the second row
        numbers[1][0] = 7;
        numbers[1][1] = 9;
        numbers[1][2] = 4;
        numbers[1][3] = 1;

        // 3 5 7 2
        // 7 9 4 1

        // how can i get the value of 9?
        System.out.println(numbers[1][1]);

        int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // write the value of 6?
        System.out.println(numbers2[1][2]);

        // can i re-assign a value?
        numbers2[0][1] = 11;
        // 1 11 3
        // 4 5 6
        // 7 8 9

        // print it
        System.out.println(numbers2[0][1]);
    }
}
