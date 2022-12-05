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
public class ea15 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] vec = new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i]=i;
        }
        for (int i = 0; i < 100; i++) {
            if (i==99){
            System.out.print(vec[i]);    
            }else{        
            System.out.print(vec[i]+", ");
        }
        }
}
}