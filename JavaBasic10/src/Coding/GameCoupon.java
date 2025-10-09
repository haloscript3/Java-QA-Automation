package Coding;
import java.util.Scanner;
public class GameCoupon {
    public static void main(String[] args) {
                //write your code here
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number of coupons:");
                int coupon = scan.nextInt();
                int remainder = 0;

                int candy = 10;
                int gumball = 3;
                if(!(coupon<10))
                {

                        remainder = coupon%candy;
                        System.out.println("Number of Candies: "+ coupon/candy);
                        System.out.println("Number of Gumballs: "+ remainder/gumball);
                }
                else
                    System.out.println("Not enough coupons");
            }
        }

