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
public class ej9 {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num, i, suma;
    i=0;
    suma=0;
         System.out.println("Ingrese 20 números enteros, para detenerse antes ingrese 0");
    do {
         num = leer.nextInt ();
         i++;
         if (num>0){
         suma=suma+num;
         }
         if (num==0){
            break;
         }
     }while(i<5);
    
    if (num==0){
        System.out.println("Se campturó el número 0, la suma de los números ingresados es "+ suma);
    } else {
        System.out.println("Se ingresaron los 20 números, la suma de los números ingresados es "+ suma);
    }
}
}