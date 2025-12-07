package Coding.Arrays4;
import java.util.Arrays;
import java.util.Scanner;
public class Shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] array = str.split("_");
        int min = array[0].length();
        //Write your code here
        int count = 0;
        for(int i = 0 ; i < array.length;i++)
        {
            if (min>array[i].length())
            {
                min = array[i].length();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == min)
                count++;
        }

        String[] array2 = new String[count];
        int j= 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == min)
            {
                array2[j++] = array[i];
            }
        }
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array2));


    }
}
