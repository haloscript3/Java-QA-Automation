
package Coding;
import java.util.Scanner;
public class GiftCard {
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);

        int balance = 100;

        String[] items = {
                "Smartphones", "Laptop", "Charger", "USB cable",
                "Headphones", "Pants", "Hat", "Socks", "Blanket", "Pillow"
        };
        int[] prices = {
                300, 400, 15, 10,
                30, 50, 25, 5, 60, 40
        };

        String item = scan.nextLine();
        boolean found = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(item)) {
                found = true;
                if (prices[i] > balance) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                } else {
                    balance -= prices[i];
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + balance + "$");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid item!");
        }
        scan.close();
	}
}
