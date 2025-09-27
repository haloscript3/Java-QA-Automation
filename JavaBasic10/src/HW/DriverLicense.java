package HW;

import java.util.Scanner;

public class DriverLicense {
    /*
    *       2. You are DMV representative and you need to ask customer their age.
            If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age ");
        byte age = scan.nextByte();

        if (age >= 18)
            System.out.println("Driver License is given");
        else
            System.out.println("Learners permit");

        scan.close();
    }
}
