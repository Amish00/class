package com.techaxis.CoreJava.Main.java.loop;

public class pattern10 {
    public static void main(String[] args) {
        char c=70;
        for(int i = 1; i<6; i++) {
            for (int j = 1; j < 7-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(c+" ");
                c--;
            }
            c=70;
            System.out.println("  ");
        }
    }
}
