package com.techaxis.CoreJava.Main.java.OPP;

public class Student {
    private int id;
    private String name;
    private String address;
    Student(){
        id= 1 ;
        name="Ram";
        address="Patan";
    }

    public void display(){
        System.out.println("Name: "+ name +"\nId: "+id+"\nAddress: "+address);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.display();

    }
}


