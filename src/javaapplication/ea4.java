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
public class ea4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en C:");
    float cel = leer.nextFloat();
    float far = (cel*1.8f)+32;
        System.out.println("La temperatura en F es: " + far);
}
}