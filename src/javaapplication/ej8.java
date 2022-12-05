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
public class ej8 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int nota;
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = leer.nextInt ();
        
        while (nota<0 || nota>10){
             System.out.println("La nota no es válida, intente nuevamente");
             nota = leer.nextInt ();
}
        System.out.println("Correcto, la nota ingresada " + nota + " está entre 0 y 10");
}       
}