package com.techaxis.CoreJava.Main.java.OPP.Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Addition addition= new Addition();
        System.out.println(addition.getSum());
        System.out.println(addition.getSum(1));
        System.out.println(addition.getSum(1,3));
        System.out.println(addition.getSum(5.5,6.5));
        System.out.println(addition.getSum(5,6.5));

    }

}
