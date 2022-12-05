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
public class ea17 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número para el tamaño del vector:");
        int n=leer.nextInt(),h=0, j=0, k=0, l=0,m=0,d ;
        int[] vec=new int[n];
        for (int i = 0; i < n; i++) {
            vec[i] = (int)(Math.random()*(99999-1))+1;
            System.out.print(vec[i]+", ");
            
            String numCadena= String.valueOf(vec[i]);
            d = numCadena.length();
            switch (d) {
                case 1:
                    h++;
                    break;
                case 2:
                    j++;
                    break;
                case 3:
                    k++;
                    break;
                case 4:
                    l++;
                    break;
                case 5:
                    m++;
                    break;
            }
            System.out.println("");
            }
        
        System.out.println("El vector de tamaño "+n+" contiene la cantidad de:");
        System.out.println(+h+" números de UN dígito");
        System.out.println(+j+" números de DOS dígitos");
        System.out.println(+k+" números de TRES dígitos");
        System.out.println(+l+" números de CUATRO dígitos");
        System.out.println("y "+m+" cantidad de números de CINCO dígitos");
}
}