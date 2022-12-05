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
public class ea9 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase:");
        String palabra = leer.nextLine();
        String letra = palabra.substring(0,1);
        System.out.println(letra);
        boolean boo = letra.equals("A");
        if (boo) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
}
}