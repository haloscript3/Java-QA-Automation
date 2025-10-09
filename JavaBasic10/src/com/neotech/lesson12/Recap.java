package com.neotech.lesson12;

public class Recap {
    public static void main(String[] args) {
        int[] grades = new int[5]; // [0, 0, 0, 0, 0]

        // How do i get the size of the array?
        System.out.println("The size of the array is " + grades.length);

        System.out.println("The grade with index 2 is " + grades[2]);

        System.out.println("The grade in position 3 is " + grades[2]);

        // 0 1 2 3 4 -> indexes
        // 0 0 0 0 0 -> values

        // lets change the grade in position 4
        grades[3] = 85;

        // grades[5] = 100; -> will give an error at runtime
        // grades[0] = "Ten"; --> will give an error at compile time

        grades[2] = 100;
        // 0 0 100 85 0

        grades[4] = 90;
        // 0 0 100 85 90

        grades[0] = 100;
        // 100 0 100 85 90

        grades[1] = 95;
        // 100 95 100 85 90

        grades[0] = 96;

        grades[0] = 99;

        // lets find the avg of the grades
        int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
        int avg = total / 5;
        System.out.println("Avg is " + avg);

        // 2nd way
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        System.out.println("The sum is " + sum);
        System.out.println("The avg is " + sum / grades.length);

        String[] cities = { "Istanbul", "Tirana", "Bangkok", "Los Angeles", "Mumbai", "Rabat" };

        System.out.println("There are " + cities.length + " cities");

        // print the last city
        System.out.println("The last city is " + cities[cities.length - 1]); // cities[5]

        // print the cities in order
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }

        System.out.println();

        // print the cities in reverse order
        // last index = cities.length - 1
        for (int i = cities.length - 1; i >= 0; i--){
            System.out.print(cities[i] + " ");
        }
    }
}
