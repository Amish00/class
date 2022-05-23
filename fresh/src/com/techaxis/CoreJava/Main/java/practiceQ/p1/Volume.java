package com.techaxis.CoreJava.Main.java.practiceQ.p1;

public class Volume {
    private double length;
    private double width;
    private double height;
Volume(){}
    public Volume(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}


