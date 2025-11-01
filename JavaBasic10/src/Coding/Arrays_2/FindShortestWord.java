package Coding.Arrays_2;

import java.util.Scanner;

public class FindShortestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i=0; i < 5; i++) {
            words[i] = input.next();
        }
        //write your code below
        String sshort = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < sshort.length())
            {
                sshort = words[i];
            }
        }
        System.out.println(sshort);
    }
}
