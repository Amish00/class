package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    Person(){}
    Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
