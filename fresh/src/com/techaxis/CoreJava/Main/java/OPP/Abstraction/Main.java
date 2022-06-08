package com.techaxis.CoreJava.Main.java.OPP.Abstraction;

public class Main {
    public static void main(String[] args) {
        RBB rbb = new RBB();
        System.out.println(rbb.getInterest()+"%");

        NIC nic = new NIC();
        System.out.println(nic.getInterest()+"%");
    }
}
