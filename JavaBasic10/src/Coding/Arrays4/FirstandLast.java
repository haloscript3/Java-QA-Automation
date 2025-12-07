package Coding.Arrays4;
import  java.util.Scanner;
public class FirstandLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"hello","why", "by", "apple", "note"};
        //TODO: Write your code below

        for(int i = 0; i < words.length;i++)
        {
            System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1));
        }

    }
}
