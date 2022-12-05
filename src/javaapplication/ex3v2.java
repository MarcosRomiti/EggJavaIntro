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
public class ex3v2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un caracter:");
        String v=leer.nextLine();
        v=v.toLowerCase();
        int a=0;
        String[] c=new String[5];
        c[0]="a";
        c[1]="e";
        c[2]="i";
        c[3]="o";
        c[4]="u";
        for (int i = 0; i < 5; i++) {
            boolean boo=v.equals(c[i]);
            if (boo) {
                a++;
            }
        }
        if (a>0) {
            System.out.println("Es una vocal");
        }else{
            System.out.println("NO es una vocal");
        }
    }
}
