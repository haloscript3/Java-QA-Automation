package HW;

public class ArrayHW {
    public static void main(String[] args) {
//        Homework 1:
//        Create an array of cars and store 6 elements into it. Print all values from the array.
//
//        Homework 2:
//        Create an array on integers and calculate the sum of all elements in an array.
//
//                Homework 3:
//        Create an array of countries. While retrieving all values from an array print capital for each country.


        String[] cars = {"Porsche","Tesla","Alfa Romeo","E39 M5","Mercedes","Renault"};

        for (int i = 0 ; i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        System.out.println("-----------------------------------------");

        int[] integers = {65,324,5,2,8456,91022};
        int sum = 0;
        for (int i = 0; i<integers.length;i++)
        {
            sum += integers[i];
        }
        System.out.println(sum);
        System.out.println("------------------------------------------");

        String [][] countries ={{"United States","Washington D.C"},{"Germany","Berlin"},{"France","Paris"},
                {"Italy","Rome"},{"China","Beijing"}};

        for (int i = 0; i< countries.length;i++)
            System.out.println(countries[i][0]+ " Capital = "+ countries[i][1]);

        System.out.println();
        int i = 0;
        while( i < countries.length)
        {
            System.out.println(countries[i][0]+ " Capital = "+ countries[i][1]);
            i++;

        }



    }
}
