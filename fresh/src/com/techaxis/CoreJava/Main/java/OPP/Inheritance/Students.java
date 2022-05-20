package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Students extends Person{
    protected double fee;
    Students(){}
    Students(String name, int age, String address, double fee){
        this.name= name;
        this.age= age;
        this.address=address;
        this.fee=fee;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", fee=" + fee +
                '}';
    }
}
