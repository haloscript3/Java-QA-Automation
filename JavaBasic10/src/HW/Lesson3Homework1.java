package HW;

public class Lesson3Homework1 {
    public static void main(String[] args) {

//      1. Write a java program to display the area and perimeter
//      of a circle that has a radius of 5. Use pi = 3.


        int pi, radius, area, perimeter;

        pi = 3;
        radius = 5;
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        System.out.println("circle`s radius is " + radius);
        System.out.println("circle`s area is " + area);
        System.out.println("circle`s perimeter is " + perimeter);

    }
}
