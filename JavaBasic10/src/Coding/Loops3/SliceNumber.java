package Coding.Loops3;
import java.util.Scanner;
public class SliceNumber {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = scan.nextInt();

        //WRITE YOUR CODE HERE
        //123

        while (num % 10 > 0)
        {
            System.out.println(num % 10);
            num = (num / 10);
        }
    }
}
