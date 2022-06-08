package com.techaxis.CoreJava.Main.java.OPP.practiceQ.p4;

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public int getsalary() {
        return 1000;
    }
}
