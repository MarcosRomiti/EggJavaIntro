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
public class ex7v2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int n = leer.nextInt(),c=0,max=0,min=99999;
        double prom=0;
        int[] vec=new int[n];
        do {
            vec[c]=leer.nextInt();
            
            prom=vec[c]+prom;
            if (vec[c]<min) {
                min=vec[c];
                
            }
            if (vec[c]>max) {
                    max=vec[c];
                }
            c++;
        } while(c<n);
        prom=prom/n;
        System.out.println("El número máximo ingresado fué "+max+" el mínimo fue "+min+" y el promedio es "+prom);
}
}