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
public class ex8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c=0,suma=0,imp=0,par=0,m;
        System.out.println("Ingrese números enteros, para finalizar ingrese un múltiplo de 5");
        do {
            int num=leer.nextInt();
            if ((num%2)==0&&num>0) {
                par++;
            }else if ((num%2)!=0&&num>0) {
                imp++;
            }
            c++;
            m=num%5;
        } while (m!=0);
        System.out.println("La cantidad de números pares es "+par+" la cantidad de impares es "+imp);
        System.out.println("Y la cantidad total de números ingresados es "+c);
    }
}
