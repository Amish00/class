package com.techaxis.lab1;

import static java.lang.System.out;

public class lab2 {
// control statement
public static void main(String[] args) {
    String user ="admin";
    String pass="pass";
    out.println("before if else statement");
    if (user == "admin" && pass == "pass"){
        out.println("Password and user name matched");

    }
    else {
        out.println("Either password or user name is invalid");
    }
    out.println("Out of the if else if else statement");
}
}