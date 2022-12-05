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
public class ex3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter:");
        String v=leer.nextLine();
        v=v.toLowerCase();
        boolean boo=false;
        switch (v) {
            case "a":
                boo=true;
                break;
            case "e":
                boo=true;
                break;
            case "i":
                boo=true;
                break;
            case "o":
                boo=true;
                break;
            case "u":
                boo=true;
                break;
            default:
                break;
        }
        if (boo) {
            System.out.println("Es una vocal");
        }else{
            System.out.println("NO es una vocal");
        }
        
    }
}
