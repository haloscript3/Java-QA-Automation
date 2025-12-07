package Coding.Logic;

import java.util.Scanner;

public class RepeatSeparator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String sep = input.nextLine();
        int count = input.nextInt();

        String result = "";

        for (int i = 0; i < count; i++) {
            result += word;
            if (i < count - 1) {
                result += sep;
            }
        }

        System.out.println(result);
    }
}
