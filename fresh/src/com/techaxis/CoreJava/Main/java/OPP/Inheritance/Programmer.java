package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Programmer extends Employee{
    protected String language;
    protected double salary;

    Programmer(){}

    public Programmer(String language, double salary) {
        this.language = language;
        this.salary = salary;
    }

    public Programmer(int id, String name, int phoneNumber, String language, double salary) {
        super(id, name, phoneNumber);
        this.language = language;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", language='" + language + '\'' +
                ", salary=" + salary +
                '}';
    }
}
