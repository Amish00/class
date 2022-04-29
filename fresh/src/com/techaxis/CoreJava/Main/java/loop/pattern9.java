package com.techaxis.CoreJava.Main.java.loop;

public class pattern9 {
    public static void main(String[] args) {
        char c=65;
        for(int i = 1; i<=5; i++) {
            for (int j = 1; j < 7-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c++;
            }
            c=65;
            System.out.println("  ");
        }
    }
}
