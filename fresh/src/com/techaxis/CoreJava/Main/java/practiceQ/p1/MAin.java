package com.techaxis.CoreJava.Main.java.practiceQ.p1;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        double fv;
        double iv;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter feet value of length");
        fv=scanner.nextInt();
        System.out.println("enter inch value of length");
        iv=scanner.nextInt();
        Distance d=new Distance();
        Volume v= new Volume();
        Distance d1= new Distance();
        d.setFeet(fv);
        d.setInch(iv);
        System.out.println("The feet value of length is "+d.getFeet());
        System.out.println("The inch value of length is "+d.getInch());
        System.out.println("The converted value is "+d.convertValueToFeet());

        double lcv =d.convertValueToFeet();
        v.setLength(lcv);
        System.out.println("enter feet value of width");
        fv=scanner.nextDouble();
        System.out.println("enter inch value of width");
        iv=scanner.nextDouble();

        d1.setFeet(fv);
        d1.setInch(iv);
        lcv=d1.convertValueToFeet();
        v.setWidth(lcv);

        System.out.println("enter feet value of height");
        fv=scanner.nextDouble();
        System.out.println("enter inch value of height");
        iv=scanner.nextDouble();
        Distance d2 = new Distance();
        d2.setFeet(fv);
        d2.setInch(iv);
        lcv=d2.convertValueToFeet();
        v.setHeight(lcv);

        double volumeCal=v.getLength()*v.getWidth()*v.getHeight();
        System.out.println("The Volume of the room is "+volumeCal);
    }
}
