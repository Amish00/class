package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Teacher extends Person{
    protected double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
