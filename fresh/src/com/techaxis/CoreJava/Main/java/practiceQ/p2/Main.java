package com.techaxis.CoreJava.Main.java.practiceQ.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mountain m1= new Mountain("mt Everest",849,"Solulhumbu");
        Mountain m2= new Mountain("mt Annapurna",6000,"Pokhara");
        Mountain m=new Mountain();
        m.cmpHeight(m1,m2);


    }

}
