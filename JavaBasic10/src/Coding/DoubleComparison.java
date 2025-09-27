package Coding;
public class DoubleComparison {
    public static void main(String[] args) {
        /*
        * * 1. Create a Java program and name it DoubleComparison.
    Declare 2 double values and if the value of first the variable is higher then the second,
    print “Double value __ is larger than __ .”
    Otherwise print...


*/



        double num1 = 10.0;
        double num2 = 20.0;

       if (!(num1 == num2))
       {
           if(num1>num2)
           {
               System.out.println(num1 + " is bigger than " + num2);
           }
           else
           {
               System.out.println(num2 +" is bigger than "+ num1);
           }
       }
       else
       {
           System.out.println(num1 + "is equal to" + num2);

       }

    }
}
