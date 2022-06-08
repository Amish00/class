package com.techaxis.CoreJava.Main.java.ExceptionHandling;

public class Person {
    int id;
    String name;
    String address;
    String phoneNum;
    String occupation;

    public Person() {}

    public Person(int id, String name, String address, String phoneNum, String occupation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
