package HW;

import java.util.Scanner;

public class CityandTemperature {
    public static void main(String[] args) {

        /* 3. Create a Java program that will ask user to input city and temperature.
            Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your city ");
        String city = scan.next();
        System.out.print("Enter your temperature ");
        double temperature = scan.nextDouble();
        double celsius = (temperature - 32) * (5.0/9.0);
        System.out.println(celsius);
        
        scan.close();
    }
}

//IT IS FN+F7 ON MY MAC YOU HAVE TO FIND YOUR KEY