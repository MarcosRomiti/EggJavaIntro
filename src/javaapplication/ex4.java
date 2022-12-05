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
public class ex4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
    String rom="";
    do {    
    System.out.println("Ingrese un número entre el 1 y el 10 para convertirlo en romano");
        num=leer.nextInt();
        
        switch (num) {
            case 1:
                rom="I";
                break;
            case 2:
                rom="II";
                break;
            case 3:
                rom="III";
                break;
            case 4:
                rom="IV";
                break;
            case 5:
                rom="V";
                break;
            case 6:
                rom="VI";
                break;
            case 7:
                rom="VII";
                break;
            case 8:
                rom="VIII";
                break;
            case 9:
                rom="IX";
                break;
            case 10:
                rom="X";
                break;
            default:
                System.out.println("El número ingresado no está dentro del rango");
        }
        }while (num<1 || num>10);
      
        System.out.println("El número romano es: "+rom);
    }
}
