package HW;

public class Allergic {
    public static void main(String[] args) {
        /*
        * Homework 1:
        Write a java program to check if a patient has allergies.
        If the patient does not have allergies print "You're healthy!".
        If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy
        and print a statement telling the patient
        "Don't eat ___". (fill the line with the food names – peanut, seafood etc.)

        * */

        boolean allergic = true;
        boolean peanut= false;
        boolean lactose = false;
        boolean bee = true;
        boolean seafood = false;

        if (allergic){
            if(peanut)
                System.out.println("Don't eat peanut");
            if (lactose)
                System.out.println("Don't eat lactose");
            if (bee)
                System.out.println("Dont eat honey");
            if (seafood)
                System.out.println("Don't eat fish");
            else
                System.out.println("What is your allergies ?");
        }
        else
            System.out.println("You're healthy !");

    }
}
