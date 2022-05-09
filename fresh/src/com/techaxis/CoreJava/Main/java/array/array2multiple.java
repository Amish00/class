package com.techaxis.CoreJava.Main.java.array;

import java.util.Scanner;

public class array2multiple {
        public static void main(String[] args) {
            Scanner scanfObj = new Scanner(System.in);
            int a[][] = new int[3][3];
            int b[][] = new int[3][3];
            int m[][] = new int[3][3];
            int i, j,s;
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
            System.out.println("matrix A*B ");
            for( i=0;i<3;i++){
                for( j=0;j<3;j++){
                    m[i][j]=0;
                    for(int k=0;k<3;k++)
                    {
                        m[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }
        }
}
