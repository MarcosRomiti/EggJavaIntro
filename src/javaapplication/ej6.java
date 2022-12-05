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
public class ej6 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
   
    int num1, num2;
    
    System.out.println("Ingrese dos números enteros");
   
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    
    if (num1>num2) {
        
        System.out.println(num1 + " es mayor que " + num2);
    
    }else {
                
        System.out.println(num1 + " no es mayor que " + num2);
                
    
    }
    }
}