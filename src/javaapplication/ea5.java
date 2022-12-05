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
public class ea5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        int num2 = num*2;
        int num3 = num*3;
        double num4 = Math.sqrt(num);
        System.out.println("el doble del número ingresado: " + num + " es: " + num2 + " , el triple es: " + num3 + " y la raíz cuadrada es: " + num4);
}
}