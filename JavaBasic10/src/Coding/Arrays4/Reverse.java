package Coding.Arrays4;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        for(int i = sentence.length()-1; i>=0;i--)
        {
            if (sentence.charAt(i) == '_'|| i == 0  )
            {
                int j = 1;
                if (i == 0)
                    j--;
                while (i+j<sentence.length()) //8
                {
                    if (sentence.charAt(i+j)=='_')
                        break;
                    System.out.print(sentence.charAt(i+j++));

                }
                System.out.println();
            }
        }


        //Java_is_fun
    }
}
