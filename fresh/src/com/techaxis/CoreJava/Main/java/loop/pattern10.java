package com.techaxis.CoreJava.Main.java.loop;

public class pattern10 {
    public static void main(String[] args) {
        char c=70;
        int i,j,k;
        for( i = 1; i<6; i++) {

            for ( j = 1; j < 7-i; j++) {
                System.out.print(" ");
            }
            for(int h=0;h<i;h++){
                c--;
            }
            for( k=1;k<=i;k++){
                System.out.print(c+" ");
              c++;
            }
            c=70;
            System.out.println("  ");
        }
    }
}
