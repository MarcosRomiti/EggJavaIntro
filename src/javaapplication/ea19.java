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
public class ea19 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    rellenar();
       
}
    public static void rellenar(){
    Scanner leer = new Scanner(System.in);
    int[][] vec1=new int[4][4];
    boolean res=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición["+i+"]["+j+"] ");
                vec1[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (vec1[i][j]==vec1[j][i]) {
                   res = true;
                }else{
                   res= false; 
                   break;
                }
            }
        }
        if (res) {
            System.out.println("La matriz SI es simétrica");
        }else{
            System.out.println("La matriz NO es simétrica");
        }
    }   
    
}

