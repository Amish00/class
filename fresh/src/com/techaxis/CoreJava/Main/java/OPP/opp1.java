package com.techaxis.CoreJava.Main.java.OPP;

import java.util.Scanner;
class product{
    private double pid;
    private   String pname;
    private double cost;
    public product(){

    }
    public void setdata(){
        System.out.println("enter product id");
        Scanner s=new Scanner(System.in);
        pid=s.nextDouble();
        System.out.println("enter product name");
        pname=s.next();
        System.out.println("enter product cost");
        cost=s.nextDouble();

    }
    public void showdata(){
        System.out.println("product id: "+pid);
        System.out.println("product name: "+pname);
        System.out.println("product cost: "+cost);
    }

}
public class opp1 {

    public static void main(String[] args) {
        product p=new product();
        p.setdata();
        p.showdata();
    }

}
