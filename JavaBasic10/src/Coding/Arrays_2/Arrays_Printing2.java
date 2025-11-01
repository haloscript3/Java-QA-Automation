package Coding.Arrays_2;
import  java.util.Scanner;
public class Arrays_Printing2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.next();
        }
        //write your code below

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ ", "+ arr[++i]+"\n");
        }

    }
}
