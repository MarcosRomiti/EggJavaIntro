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
public class ex2 {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int a,b,c,d;
         System.out.println("Ingrese los 4 valores:");
         System.out.print("A: ");
         a=leer.nextInt();
         System.out.println("");
         System.out.print("B: ");
         b=leer.nextInt();
         System.out.println("");
         System.out.print("C: ");
         c=leer.nextInt();
         System.out.println("");
         System.out.print("D: ");
         d=leer.nextInt();
         System.out.println("Con los números ingresados los valores son A: "+a+" B: "+b+" C:"+c+" D: "+d);
         int aux=a;
         a=d;
         d=c;
         c=b;
         b=aux;
         System.out.println("Con los valores cambiados queda así A: "+a+" B: "+b+" C:"+c+" D: "+d);
}
}