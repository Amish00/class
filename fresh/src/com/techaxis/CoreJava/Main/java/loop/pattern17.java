package com.techaxis.CoreJava.Main.java.loop;

public class pattern17 {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");

        }
    }
}
