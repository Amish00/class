package com.techaxis.CoreJava.Main.java.collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
public class DateDemo {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalTime time = LocalTime.of(2,50,100);
        LocalTime time1 = LocalTime.of(10,40,00);


        System.out.println(time);

    }
}