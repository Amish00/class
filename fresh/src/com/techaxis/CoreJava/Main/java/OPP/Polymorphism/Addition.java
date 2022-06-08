package com.techaxis.CoreJava.Main.java.OPP.Polymorphism;

public class Addition {
    public int getSum(){
        return 0;
    }
    public int getSum(int a){
        int sum = 0;
         sum+=a;
        return sum;
    }
    public int getSum(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }
    public double getSum(double a, double b){
        double sum;
        sum= a+b;
        return sum;
    }
    public double getSum(int a,double b){
        double sum;
        sum= a+b;
        return sum;
    }
}
