package com.techaxis.CoreJava.Main.java.OPP.Encapsulation;

public class main {
    public static void main(String[] args) {
        int l,b,area,perimeter;
//        Bank user1=new Bank(100000,123);
//        user1.deposit(1000);
//        user1.checkBalance();
//        user1.witdrawl(1500);
//        user1.checkBalance();
//        System.out.println(user1);

        Rectangle rectangle=new Rectangle(12,5);
       l= rectangle.getLength();
       b=rectangle.getBreadth();

       area=l*b;
       perimeter=2*(l+b);
        System.out.println("Area of rectangle: "+ area +", Perimeter of rectangle: "+ perimeter);

        Rectangle rectangle1=new Rectangle();
        l= rectangle1.getLength();
        b=rectangle1.getBreadth();

        area=l*b;
        perimeter=2*(l+b);
        System.out.println("Area of rectangle1: "+ area +", Perimeter of rectangle1: "+ perimeter);

    }
}
