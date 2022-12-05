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
public class ea7 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una palabra");
    String palabra = leer.nextLine();
    boolean boo = palabra.toLowerCase().equals("eureka");
        if (boo) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
}
}