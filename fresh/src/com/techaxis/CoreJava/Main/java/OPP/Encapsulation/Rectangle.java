package com.techaxis.CoreJava.Main.java.OPP.Encapsulation;

public class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    Rectangle(){
        length=100;
        breadth=100;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
