package com.techaxis.CoreJava.Main.java.OPP.Encapsulation;

public class main {
    public static void main(String[] args) {
        Bank user1=new Bank(100000,123);
        user1.deposit(1000);
        user1.checkBalance();
        user1.witdrawl(1500);
        user1.checkBalance();
        System.out.println(user1);
    }
}
