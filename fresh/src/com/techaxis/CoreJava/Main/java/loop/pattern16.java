package com.techaxis.CoreJava.Main.java.loop;

public class pattern16 {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<6;i++) {
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a--;
            }
            a=5;
            System.out.println(" ");
        }
    }
}
