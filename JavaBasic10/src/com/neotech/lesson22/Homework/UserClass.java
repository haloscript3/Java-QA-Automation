package com.neotech.lesson22.Homework;

public class UserClass {
    /*
    * Homework 4:
    Write program: UserClass that has a constructor that
    initializes instance variable name and mobile number.
    Create a subclass UserInfo that will have user address
    variable and it also being initialized through constructor
    call. Print users name, mobile number and address in
    userDetails method. Test your code.*/

    String name ;
    int number;
    UserClass(String name,int number)
    {
        this.name = name;
        this.number = number;
    }
}

 class UserInfo extends UserClass
{
    String address;
    UserInfo(String name, int number,String address)
    {
        super(name, number);
        this.address = address;
    }
    void userDetails()
    {
        System.out.println(this.name +  " " + this.number +" " +  this.address);
    }
}
