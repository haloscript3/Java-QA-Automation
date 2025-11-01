package Coding.StringMethods1;
import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_"))
            System.out.println(email);
        else
        {
            String[] email2;
            email2 = email.split("[_@]");
            System.out.println(email2[1]+"_"+email2[0]+"@"+email2[2]);
        }
    }
}
