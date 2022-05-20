package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

import java.security.PrivateKey;

public class BcaStudent extends Students{
    protected String project;
    BcaStudent (){}
    BcaStudent(String name,int age,String address,double fee,String project){
        this.name=name;
        this.age=age;
        this.address=address;
        this.fee=fee;
        this.project=project;
    }

    public void setData(String name,int age,String address,double fee,String project){
        this.name=name;
        this.age=age;
        this.address=address;
        this.fee=fee;
        this.project=project;
    }


    @Override
    public String toString() {
        return "BcaStudent{" +
                "project='" + project + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", fee=" + fee +
                '}';
    }
}
