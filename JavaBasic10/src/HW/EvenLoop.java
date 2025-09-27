package HW;


public class EvenLoop {
    public static void main(String[] args) {

        //1. Write a program using while loop that calculates the sum of the even numbers between 0 and 10.


        int  i = 0;
        int sum = 0 ;

        while (i < 10)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
 }
 }
