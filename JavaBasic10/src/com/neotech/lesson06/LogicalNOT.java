package com.neotech.lesson06;

public class LogicalNOT {
    public static void main(String[] args) {

        // NOT operator will invert/negate the boolean expression
        // != --> NOT equal

        boolean var1 = false;
        System.out.println(var1);
        System.out.println(!var1);

        var1 = !true;
        System.out.println(!var1);

        int score = 50;
        if (!(score < 0 || score > 100)) {
            System.out.println("Your score is " + score);
        } else {
            System.out.println("Wrong score!");
        }

        boolean hateJava = false;
        System.out.println("Do you love java? " + !hateJava);

    }
}
