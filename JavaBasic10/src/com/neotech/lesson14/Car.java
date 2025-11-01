package com.neotech.lesson14;
public class Car {
    //What features/properties/attributes does car have ?
    //speed , make , model , color ,mpg , year //VARIABLES

    //what actions does a car do ?
    //drive(),stop(),transportPeople() // METHODS;

    //FEATURES : VARIABLES
    int speed ;
    int year;
    int mpg;
    String make ;
    String model ;
    String color ;

    //BEHAVIORS : METHODS
    void drive()
    {
        System.out.println(make + " " + model + " drives");
    }
    //void means methods returns nothing

    void stop()
    {
        System.out.println(make + " " + model + " stops");
    }
    void transportPeople()
    {
        System.out.println(make + " " + model + " transports people");
    }

    //class is only the blueprint(structure,skeleton) that is made of
    // features and behaviors

    //what is an object?
    //object is an instance/example of a class

    //How do i create an object from class ?
    //I need the main method to create my objects

    public static void main(String[] args) {
        Car car1 = new Car(); // Instantiate

        //remember the scanner object
        //Scanner scan = new Scanner(System.in);

        //lets set some of car's properties

        car1.color = "Black";
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.mpg= 45;
        car1.speed=140;
        car1.year=2021;

        System.out.println("My car is a " + car1.make + " "+ car1.model + " - "+car1.year);
        System.out.println("----------------");

        //Can i also acces the behaviors of my car object ?

        car1.drive();
        car1.stop();
        car1.transportPeople();
    }
}
