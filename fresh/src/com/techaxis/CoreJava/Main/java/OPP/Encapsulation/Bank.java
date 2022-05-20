package com.techaxis.CoreJava.Main.java.OPP.Encapsulation;

import java.util.Scanner;

public class Bank {
    private double balance;
    private int password;
    Bank(){
        balance=0;
        password=0;
    }

    public Bank(double balance, int password) {
        this.balance = balance;
        this.password = password;
    }

    public void witdrawl(double withdrawlamount){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter password to withdraw");
        int pass=scanner.nextInt();
        if(pass==this.password){
            if(this.balance>withdrawlamount){
                this.balance=this.balance-withdrawlamount;
                System.out.println("successfully withdrawl!!");
            }
            else {
                System.out.println("withdrawl amount is greater than actual balance");
            }

        }
        else {
            System.out.println("Password doesw not match!!!");
        }

    }
    public void deposit(double depositAmount){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter password to deposit");
        int pass=scanner.nextInt();
        if(pass==this.password){

            this.balance=this.balance+depositAmount;
            System.out.println("successfully deposited!!");

        }
        else {
            System.out.println("Password doesw not match!!!");
        }
    }
    public  void checkBalance(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter password to checkBalance");
        int pass=scanner.nextInt();
        if(pass==this.password){
            System.out.println("Your balance is: "+balance);
        }
        else {
            System.out.println("Password doesw not match!!!");
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", password=" + password +
                '}';
    }
}
