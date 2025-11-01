package Coding.Arrays_3;

import java.util.Arrays;

public class DArray_ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i <chessBoard.length ; i++) {
            char letter = 97;
            for (int j = 0; j < chessBoard[i].length ; j++) {
                chessBoard[i][j] =""+ (i+1) + letter ;
                letter++;
            }
        }


        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
    }
