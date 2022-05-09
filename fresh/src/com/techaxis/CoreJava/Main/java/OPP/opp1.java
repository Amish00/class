package com.techaxis.CoreJava.Main.java.OPP;

import java.util.Scanner;
class Product{
    private double pid;
    private   String pname;
    private double cost;
    public Product(){

    }
    public void Setdata(){
        System.out.println("enter product id");
        Scanner s=new Scanner(System.in);
        pid=s.nextDouble();
        System.out.println("enter product name");
        pname=s.next();
        System.out.println("enter product cost");
        cost=s.nextDouble();

    }
    public void Showdata(){
        System.out.println("product id: "+pid);
        System.out.println("product name: "+pname);
        System.out.println("product cost: "+cost);
    }

}
public class opp1 {

    public static void main(String[] args) {
        Product p=new Product();
        p.Setdata();
        p.Showdata();
    }

}
