package com.techaxis.CoreJava.Main.java.loop;

public class pattern11 {
    public static void main(String[] args) {
        for(int i = 1; i<=9; i++) {
            for (int j = 1; j < 10-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}