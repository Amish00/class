package com.techaxis.CoreJava.Main.java.practiceQ.p2;

public class Mountain {
    private String name;
    private double height;
    private String location;

    public Mountain() {
    }

    public Mountain(String name, double height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
public void cmpHeight(Mountain m1,Mountain m2){
        if(m1.getHeight()>m2.getHeight()){
          m1.display();
        }
        else {
            m2.display();
        }
}

    private void display() {
        System.out.println("Name of Mountain "+name+ " Height of Mountain = "+height+ "Location of mountain = "+location);
    }


}
