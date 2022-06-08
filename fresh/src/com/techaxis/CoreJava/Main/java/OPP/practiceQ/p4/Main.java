package com.techaxis.CoreJava.Main.java.OPP.practiceQ.p4;

public class Main {
    public static void main(String[] args) {
        Programmer employee= new Programmer(1,"ram","patan") ;
        System.out.println("id= "+employee.getId());
        System.out.println("name= "+employee.getName());
        System.out.println("address= "+employee.getAddress());
        System.out.println("Salary= "+ employee.getsalary());
    }

}
