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
public class ea18 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    rellenar();
       
}
    public static void rellenar(){
         int[][] vec1=new int[4][4];
    int[][] vec2=new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vec1[i][j]=(int)(Math.random()*(9-1))+1;
                vec2[j][i]=vec1[i][j];
            }
        }
        imprimir(vec1, vec2);
    }
    public static void imprimir(int vec1[][],int vec2[][]){
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(vec1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(vec2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}