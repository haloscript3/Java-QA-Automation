package HW;

public class DoubleComparison {
    public static void main(String[] args) {
        /*
         * 1. Create a Java program and name it DoubleComparison.
            Declare 2 double values and if the value of first the variable is higher then the second,
            print "Double value __ is larger than __ ."
            Otherwise print...


            2. Create a Java program and name it TemperatureCheck.
            Create a variable to store temperature.
            Your program should check if the temperature is below 32
            If the temperature is below 32
            then it should print "Water will freeze with temperature __",
            otherwise should print "Water will NOT freeze with temperature __".
         */


        double d1 = 4.2;
        double d2 = 7.2;

        if (d1 > d2) {
            System.out.println("Double value " + d1 + " is larger than " + d2);
        } else {
            System.out.println("Double value " + d1 + " is NOT larger than " + d2);
        }
    }

}
