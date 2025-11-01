package Coding;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        // Write your code here
        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            if (!(count > 10))
                shoppingListReport += ", ";
            totalPrice += price;
            count++;
            System.out.println("Add one more item?");
            countinue = scan.next();
        } while (countinue.equalsIgnoreCase("yes") && count <= 10);

        System.out.println(shoppingListReport+"\nTotal price: " + totalPrice);
        scan.close();
    }
}
