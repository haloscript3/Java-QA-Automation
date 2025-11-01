package com.neotech.lesson14;

public class BiggestSmallest2D {
//    Homework 1:
//    Create an array of countries: north America countries,
//    south America countries, Europe countries, Asian countries, African countries.
//    Then print all values from that array using 2 different loops and calculate how many total
//    countries been stored.

    public static void main(String[] args) {
        String [][]  countries = {//parent
                {"USA","CANADA"}, // NA
                {"BRASIL","ARGENTINA","PERU"}, // SA
                {"DENMARK","GERMANY","FRANCE","TURKIYE"}, // EUROPE
                {"CHINA","JAPAN","KOREA"}, // ASIA
                {"CHAD","GHANA","EGYPT","KENYA","ETHIOPIA"} // AFRICA
        };

        //standard loop

        int total = 0;
        for (int i = 0 ; i< countries.length;i++)
        {
            for (int j = 0; j<countries[i].length;j++)
            {
                total++;
                System.out.print(countries[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(total);

        //----------------------------------------------------

        //foreach
        int total2= 0;
        for (String[] row: countries){
            for (String item:row){
                total2++;
            System.out.print(item+" ");
            }
        }
        System.out.println();
        System.out.println(total2);
    }
}
