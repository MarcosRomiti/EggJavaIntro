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
public class ea3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String frase = leer.nextLine();
    String fraseMin = frase.toLowerCase();
    String fraseMay = frase.toUpperCase();
        System.out.println("La frase original es: " + frase);
        System.out.println("La frase en minúsculas es: " + fraseMin);
        System.out.println("La frase en Mayusculas es: " + fraseMay);
        
}
}