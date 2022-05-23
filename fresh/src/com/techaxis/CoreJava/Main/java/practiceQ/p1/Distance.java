package com.techaxis.CoreJava.Main.java.practiceQ.p1;

public class Distance {
    private double feet;
    private double inch;

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public double convertValueToFeet(){
        double cv = feet + (inch / 12);
        return cv;
    }
}
