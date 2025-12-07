package com.neotech.lesson24;



//Homework:
//        ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//    ▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
//        ▪ Define some methods specific to the child classes.
//        ▪ Create objects of the child classes and store them in an array.
//        ▪ Loop through each object and execute available methods.
public class Computer {

    String deviceType ;
    int RAM ;
    String processor ;


    public Computer( String deviceType, int RAM , String processor) {
        this.deviceType = deviceType;
        this.RAM = RAM;
        this.processor = processor;
    }

    void getInfo()
    {
        System.out.println(" This pc is " + deviceType + " and got " + RAM + " GB ram and " +processor + " processor" );
    }
}

class Apple extends Computer {
    public Apple(String deviceType, int RAM, String processor) {
        super(deviceType, RAM, processor);
    }

    void getInfo()
    {
        System.out.println(" This pc is APPLE" + deviceType + " and got " + RAM + " GB ram and " +processor + " processor" );
    }
    void openingScreen()
    {
        System.out.println("🍏");
    }
}
class Lenovo extends Computer
{

    public Lenovo(String deviceType, int RAM, String processor) {
        super(deviceType, RAM, processor);
    }
    void getInfo()
    {
        System.out.println(" This pc is LENOVO" + deviceType + " and got " + RAM + " GB ram and " +processor + " processor" );
    }
}
class HP extends Computer
{

    public HP(String deviceType, int RAM, String processor) {
        super(deviceType, RAM, processor);
    }
    void getInfo()
    {
        System.out.println(" This pc is HP" + deviceType + " and got " + RAM + " GB ram and " +processor + " processor" );
    }
}
class Dell extends Computer
{

    public Dell(String deviceType, int RAM, String processor) {
        super(deviceType, RAM, processor);
    }
    void getInfo()
    {
        System.out.println(" This pc is DELL" + deviceType + " and got " + RAM + " GB ram and " +processor + " processor" );
    }
}

