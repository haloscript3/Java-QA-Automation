package HW;

public class Lesson3Homework2 {
    public static void main(String[] args) {
//      Write a java program that converts mile to km and km to miles.
//      Use scale 1 mile = 1.609344.


        double mile = 132;
        double km = mile * 1.609344;

        System.out.println(mile + " Mile = " + km + " Km");
        km = 75;
        mile = km / 1.609344;
        System.out.println(km + " Km = " + mile + " Mile");
    }
}
