package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Employee {
    protected int id;
   protected String name;
    protected int phoneNumber;

    Employee(){}

    public Employee(int id, String name, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    public  void showinfo(){
        System.out.println("id: "+ id +", name: "+ name +", PhoneNumber: "+phoneNumber );
    }
}
