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
public class ej13 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[][] equipo = new int [3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                equipo[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + equipo[i][j] + " ");
            }
            System.out.println(" ");
        }
}
}