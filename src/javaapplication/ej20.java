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
public class ej20 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Vamos a hacer una matriz mágica! ingrese un valor que definirá el tamaño de la matriz, entre 1 y 9");
    int n = leer.nextInt();
    int[][] matriz=new int[n][n];
    int[] columna=new int[n], fila= new int[n];
    int diag1=0, diag2=0,c=0;
    
    System.out.println("Ahora vamos a ingresar los números de la matriz mágica:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Posición["+i+"]["+j+"] ");
                matriz[i][j]=leer.nextInt();
            }
        }
        
        System.out.println("Así quedó la matriz:"); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(""); 
            
        }
        for (int i = 0; i < n; i++) {
            fila[i]=0;
            columna[i]=0;
        }
        
        System.out.println("El resultado de la suma de las columnas es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                fila[i]=matriz[i][j]+fila[i];
            }
            System.out.print(" "+fila[i]+" ");
        }
        System.out.println(" ");
        
        System.out.println("La suma de las columnas es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columna[i]=matriz[j][i]+columna[i];
            }
            System.out.print(" "+columna[i]+" ");
        }
        System.out.println(" ");
        
        System.out.println("La suma de las diagonales es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    diag1=matriz[i][j]+diag1;
                }
            }
        }
        System.out.print(" "+diag1+" ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j==n-1) {
                diag2=matriz[i][j]+diag2;
            }
            }
        }
        System.out.println(diag2);
        System.out.println(" ");
        
        for (int i = 0; i < n; i++) {
            if ((fila[i]==columna[i]) && (diag1==diag2) && (fila[i]==diag1)) {
                c++;
            }
        }
        if (c==n) {
            System.out.println("Es una matriz mágica!");
        }else{
            System.out.println("No es una matriz mágica...");
        }
}
}