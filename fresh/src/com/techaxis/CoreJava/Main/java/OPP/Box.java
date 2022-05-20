package com.techaxis.CoreJava.Main.java.OPP;

public class Box {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void displayArea(){
        System.out.println("The Area of the box is "+ (length*width) +"\n");
    }
/*
    public static void main(String[] args) {
         Box box1=new Box();
        box1.setLength(10);
        box1.setWidth(20);
        box1.displayArea();
    }
     */
}
