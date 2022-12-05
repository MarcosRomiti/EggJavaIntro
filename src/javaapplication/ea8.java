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
public class ea8 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 caracteres:");
        String frase = leer.nextLine();
        int l = frase.length();
        if (l==8) {
            System.out.println("Correcto, contiene 8 caracteres");
        }else if (l<8){
            System.out.println("Incorrecto, contiene menos de 8 caracteres");
        }else{
            System.out.println("Incorrecto; contiene mas de 8 caracteres");
        }
}
}