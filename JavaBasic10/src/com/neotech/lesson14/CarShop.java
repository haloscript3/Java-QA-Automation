package com.neotech.lesson14;

public class CarShop {
    public static void main(String[] args) {

        Car car1= new Car();//Instantiating

        car1.make = "Honda";
        car1.model = "Civic";
        car1.color = "White";
        car1.mpg = 40;
        car1.speed= 120;
        car1.year = 2025;

        System.out.println(car1.make + " "+ car1.model + " "+ car1.color + " "+ car1.year);

        car1.drive();
        car1.stop();
        car1.transportPeople();

        Car car2 = new Car();

        car2.color = "Red";
        car2.make = "BMW";
        car2.model = "E39 M5";
        car2.mpg = 30;
        car2.speed= 300;
        car2.year = 2002;

        System.out.println("---------------");

        car2.drive();
        car2.stop();
        car2.transportPeople();

        // declare and instantiate
        Car car3 = new Car();
        //declare
        Car car4;
    }
}
