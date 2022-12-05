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
public class ea13 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int i, j, num;
        System.out.println("Ingrese un número");
    num= leer.nextInt();
        for (i=0;i<num;i++) {
            for (j=0;j<num;j++) {
                if ((i>0 && i<(num-1)) && (j>0 && j<(num-1))) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    
}
}