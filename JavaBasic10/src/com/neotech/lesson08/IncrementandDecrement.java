package com.neotech.lesson08;

public class IncrementandDecrement {
    public static void main(String[] args) {
        //increment --> increase
        //decrement --> decrease

        int x = 5;

        x = x + 1; //what is now the value of x? 6, so we updated the value
        //of x by 1

        System.out.println(x);

        //we can update values with shorthand operators
        x += 1; //+= ---> x = x + 1

        System.out.println(x);


        x++; //increment ---> add one to x

        System.out.println(x);


        //Lets check out decrement


        int y = 10;

        System.out.println(y); //print y

        y--; //decrement y

        System.out.println(y); // print y


        System.out.println(y--); // print y first, then decrement

        System.out.println(y);
        //The order of operations matters. In this case, we printed first
        //and then decremented.


        // Increment (++)   ---> Pre-increment (++x) --> it means increment first, then do the operation
        // Increment (++)   ---> Post-increment (x++) --> it means perform the operation first, then increment

        // Decrement (--)   ---> Pre-decrement (--x)  ---> it means decrement first, then do the operation
        // Decrement (--)   ---> Post-decrement (x--) ---> it means perform the operation first, then decrement

        int z = 10; //assign 10 to z
        int w = z++; // post-increment --> assign the value of z to w, then increment z

        System.out.println("z = " + z);
        System.out.println("w = " + w);


        int var1 = 5;
        int var2;

        System.out.println("var1 = " + var1);

        var2 = var1--; // Post-decrement
        //this is whats going on step by step:
        // var2 = var1; (value of var1 is 5, so var2 now is 5)
        //var1 = var1 - 1 (decrement, so var1 becomes 4)

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}
