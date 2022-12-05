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
public class ej10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num, i, l;
    l=0;
        System.out.println("Ingrese 4 números:");
    do {
        num = leer.nextInt ();
        l++;
        System.out.print(num);
    for (i=0; i<num; i++){
        System.out.print("*");
    }
        System.out.println(" ");
    }while(l<4);
    
}
}