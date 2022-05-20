package com.techaxis.CoreJava.Main.java.OPP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person p=new Person("hari",15,"patan");
        System.out.println(p);
        Students s=new Students();
        System.out.println(s);
        Students student1=new Students("ram",20,"patan",1000.5);
        System.out.println(student1);
        BcaStudent bca=new BcaStudent("sam",10,"bara",164.15,"mero plan");
        System.out.println(bca);
        Teacher teacher=new Teacher();
        System.out.println(teacher);
    }
}
