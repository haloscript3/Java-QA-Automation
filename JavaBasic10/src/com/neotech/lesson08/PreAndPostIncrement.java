package com.neotech.lesson08;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        // ++ ---> increment ---> add 1 to the variable
        // -- ---> decrement ---> subtract 1 from the variable


        //Difference between ++x   and   x++

        int x = 5;

        //-----------------
        //if increments (pre or post) are on a separate line, no confusion
        x++;

        System.out.println("x = " + x);

        ++x;

        System.out.println("x = " + x);
        //------------------

        //what if I combine actions

        int y = 20;

        x = y++;
        //two operations on this line:
        // an increment operation
        // an assignment operation
        //which happens first???
        // y++ ---> (++) is after (POST) the variable - post increment
        // for a post-increment
        //1. assignment x = y ===> (x = 20, y = 20)
        //2. increment y = y + 1 ===> (x = 20, y = 21)

        System.out.println("x = " + x);
        System.out.println("y = " + y);




        int a;
        int b = 20;

        //at this point --> b = 20
        a = ++b;

        //pre-increment
        //1. b = b + 1  ---> a is still unassigned, b = 21
        //2. a = b 		---> a = 21, b = 21

        System.out.println("a = " + a);
        System.out.println("b = " + b);




        //Difference between --x  and x--

        int c;
        int d = 5;

        System.out.println(--d);
        //decrement is happening first (d = d - 1)
        //then operation (printing) will happen


        c = --d; //pre-decrement
        //step 1: d = d - 1
        //step 2: c = d

        System.out.println("c = " + c);
        System.out.println("d = " + d);


        c = d--; //post-decrement
        // step 1: c = d (3)
        // step 2: d = d - 1 (3-1=2)

        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
