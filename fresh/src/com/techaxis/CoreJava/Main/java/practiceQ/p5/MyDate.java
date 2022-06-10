package com.techaxis.CoreJava.Main.java.practiceQ.p5;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDate date1=LocalDate.of(1992,01,01);
        System.out.println(date1.isAfter(date));
        System.out.println(date);
    }
}
