package com.techaxis.CoreJava.Main.java.array;

import java.util.Scanner;

public class array2sub {
    public static void main(String[] args) {
        Scanner scanfObj = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sub[][] = new int[3][3];
        int i, j,multi;
        System.out.println("Enter A");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = scanfObj.nextInt();
            }
        }
        System.out.println("Enter B");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = scanfObj.nextInt();
            }
        }
        System.out.println("matrix A");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println("matrix B");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "\t ");
            }
            System.out.println();
        }

        for (i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                sub[i][j]=a[i][j]-b[i][j];

            }
        }

        System.out.println("matrix A-B ");
        for (i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
    }
}
