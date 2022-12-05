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
public class ea10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor máximo:");
        int max = leer.nextInt();
        int suma =0;
        System.out.println("Ahora ingrese números hasta que se supere el valor máximo ingresado:");
        do {     
            int num = leer.nextInt();
            suma=suma+num;
        } while (suma<max);
        System.out.println("La suma de los números ingresados es: " + suma);
}
}