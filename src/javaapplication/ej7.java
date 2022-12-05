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
public class ej7 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int num;
        System.out.println("Ingrese el tipo de motor:");
        num = leer.nextInt ();
    switch (num){   
        case 1:
            System.out.println("La bomba es una bomba de agua"); 
            break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
        case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println("No existe un valor válido para tipo de bomba");
    }     
  }
}