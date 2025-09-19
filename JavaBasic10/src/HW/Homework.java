package HW;

public class Homework {
    public static void main(String[] args) {
        /*
         *
         *
         *
         * */

        double scale = 1.609344;
        //we can also define all the variables we will need at the top

        //convert miles to kilometer

        double mile = 5;
        double km = mile * scale;

        System.out.println(mile + " miles is " + km + " kilometers");
        System.out.println("            ");

        //convert km to mile

        km = 60;
        mile = km / scale;
        System.out.println(km + " km is " + mile + "miles");

    }
}
