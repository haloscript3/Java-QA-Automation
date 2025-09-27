package Coding;
import java.util.Scanner;
public class TemperatureCheck {
    public static void main(String[] args) {
        /*
        *     2. Create a Java program and name it TemperatureCheck.
                Create a variable to store temperature.
                Your program should check if the temperature is below 32
                If the temperature is below 32
                then it should print "Water will freeze with temperature __",
                otherwise should print "Water will NOT freeze with temperature __".*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature ");
        int temperature = scan.nextInt();

        if (temperature < 32) {
            System.out.println("Water will freeze with temperature " + temperature);
        }
        else
            System.out.println("Water will NOT freeze with temperature " + temperature);
    }

}
