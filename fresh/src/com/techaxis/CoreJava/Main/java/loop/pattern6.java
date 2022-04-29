package com.techaxis.CoreJava.Main.java.loop;

public class pattern6 {
    public static void main(String[] args) {
        for(int i = 1; i<6; i++) {
            for(int j=0;j<5-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
