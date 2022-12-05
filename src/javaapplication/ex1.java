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
public class ex1 {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int h,d,m;
         System.out.println("Ingrese la cantidad de minutos:");
         m=leer.nextInt();
         h=m/60;
         d=h/24;
         System.out.println("Equivalen a: "+h+" horas y "+d+" días");
}
}