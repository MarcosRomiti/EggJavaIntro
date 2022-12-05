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
public class ea12 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int i=0, l=0;
    String palabra;
    System.out.println("***-Sistema RS232-***");
    do {    
    System.out.println("*-Ingrese un código-*");
        palabra = leer.nextLine();
        String l1 = palabra.substring(0,1);
        String l2 = palabra.substring(4,5);
        
        boolean boo1 = l1.equals("X");
        boolean boo2 = l2.equals("O");
        int lar = palabra.length();
        if ("&&&&&".equals(palabra)) {
            break;
        }
        if (boo1 && boo2 && lar==5) {
            System.out.println("Correcto, ingresado.");
            i++;
        }else{
            System.out.println("Incorrecto, intente nuevamente.");
            l++;
        }
    } while (!"&&&&&".equals(palabra));
        if ("&&&&&".equals(palabra)) {
            System.out.println("Fin de los envíos");
            System.out.println("Informes correctos: " + i);
            System.out.println("Informes incorrectos: " +l);
            System.out.println("Finalizado, saliendo...");
        }
}
}