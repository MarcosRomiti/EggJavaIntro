/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej21 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[][] vecm = new int[10][10];
    int[][] vecp = new int[3][3];
    int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                vecm[i][j]=(int)(Math.random()*(99-1))+1;
            }
        }
        System.out.println("Así quedó la matriz M:"); 
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("["+vecm[i][j]+"]");
            }
            System.out.println(""); 
            
        }
        System.out.println("Ingrese los números de la matriz P:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Posición["+i+"]["+j+"] ");
                vecp[i][j]=leer.nextInt();
            }
        }
        System.out.println("Así quedó la matriz P:"); 
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("["+vecp[i][j]+"]");
            }
            System.out.println(""); 
            
        }
        int b=0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (vecm[i][j]==vecp[0][0]) {
                    int n=-1,m=-1;
                    b=0;
                    int f=i+3,g=j+3,z=i,x=j;
                    for (int k = z; k < f; k++) {
                        n++;
                        for (int l = x; l < g; l++) {
                            m++;
                            if (vecm[k][l]==vecp[n][m]) {
                                b++;  
                                if (m==2) {
                                    m=-1;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if (b==9) {
            System.out.println("La matriz P está contenida dentro de la matriz M!");
        }else{
            System.out.println("La matriz P no fue hallada en la matriz M");
        }
}
}
