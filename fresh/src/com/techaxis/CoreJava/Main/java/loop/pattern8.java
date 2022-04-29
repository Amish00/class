package com.techaxis.CoreJava.Main.java.loop;

public class pattern8 {
    public static void main(String[] args) {
        int i,j,k,a=6;
        for( i = 1; i<6; i++) {

            for ( j = 1; j < 7-i; j++) {
                System.out.print(" ");
            }
            for(int h=0;h<i;h++){
                a--;
            }
            for( k=1;k<=i;k++){
                System.out.print(a+" ");
                a++;
            }
            a=6;
            System.out.println("  ");
        }
    }
}
