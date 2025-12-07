package com.neotech.lesson24;

public class ComputerTest {
    public static void main(String[] args) {
        Computer cmp = new Computer("Laptop",  6,"Intel");
        cmp.getInfo();

        cmp = new Apple("iMac",16,"Apple Silicon");
        cmp.getInfo();


        Apple ap2 = (Apple) cmp;

        ap2.openingScreen();

        HP hp = new HP("Desktop",8,"AMD");
        hp.getInfo();

        Computer cmp1 = new Computer("Laptop",16,"Intel");
        Lenovo lv = new Lenovo("Laptop",16,"Intel");
        cmp1 = (Lenovo) lv;


        Computer[] objectHolder = {cmp,ap2,hp,lv,cmp1};

        for (Computer obj : objectHolder)
            obj.getInfo();

    }
}
