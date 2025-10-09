package HW;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Array2Dk {
    public static void main(String[] args) {
//        1. Create a 2D array where you will store the following values:
//        - Mr, Mrs, Ms, Miss
//                -Smith, Jordan, Jackson, Obama.
//
//                After storing values print the following:
//        Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//                * Be careful because they are mixed.


        Scanner scan = new Scanner(System.in);
        String[][] name = new String[4][2];


        for (int row = 0;row<name.length;row++)
        {
            for (int col = 0 ; col < name[row].length;col++)
            {
                if (col==0)
                {
                    System.out.print("Enter pronounce");
                    name[row][col]= scan.next();
                }
                else
                {
                    System.out.print("Enter name");
                    name[row][col]= scan.next();
                }

            }

        }
        for (int i = 0 ; i< name.length;i++)
        {
            System.out.println(name[i][0]+" "+name[i][1]);
        }

    }
}
