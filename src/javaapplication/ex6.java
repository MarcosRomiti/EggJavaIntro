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
public class ex6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int p=leer.nextInt();
        System.out.println("Ingrese las alturas de las personas");
        double[] alt = new double[p];
        double prom=0;
        int c=0;
        for (int i = 0; i < p; i++) {
            System.out.print("Persona "+(i+1)+": ");
            alt[i]=leer.nextDouble();
            if (alt[i]<1.61) {
                prom=alt[i]+prom;
                c++;
            }
        }
        prom=prom/c;
        prom=Math.round(prom);
        System.out.println("El promedio de la altura de las personas de menos de 1.60m es: "+prom);
    }
}
