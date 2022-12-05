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
public class ea16 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número:");
        int n=leer.nextInt(),l=0, j=0;
        int[] vec=new int[n];
        System.out.println("Buscando..");
        for (int i = 0; i < n; i++) {
            vec[i] = (int)(Math.random()*10+1);
            System.out.println(vec[i]);
            
        }
        for (int i = 0; i < n; i++) {
            if (vec[i]==n && j==0) {
                System.out.println("EL número ingresado "+n+ " se encuentra en la posición "+i);
                j++;
            }else if(vec[i]==n && j>0){
                System.out.println("También se encuentra en la posición "+i);
            }else{
                l++;
            }
            if(l==n){
            System.out.println("El número ingresado "+n+" no fué allado");
            }
        }
}
}