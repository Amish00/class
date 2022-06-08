package com.techaxis.CoreJava.Main.java.OPP.practiceQ.p5;

public class Square extends Rectangle{
    protected double side;

    public Square() {
        super(1.0, 2.0, "red", false);
    }

    public Square(double side) {
        super(1.0, 2.0, "red", false);
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled,side,side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
