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
public class ea14 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Conversor de euros a otras monedas");
    menu();
    }
    public static void menu(){
    Scanner leer = new Scanner(System.in);   
    String s1= "Libras", s2="Dólares", s3="Yenes";
        
        System.out.println("Elija a que moneda convertir");
        System.out.println("1: Libras");
        System.out.println("2: Dólares");
        System.out.println("3: Yenes");
        int op = leer.nextInt();
        System.out.println("Elija un monto:");
        double num = leer.nextDouble();
        switch (op) {
            case 1:
                double val1=0.86;
                calcular(val1, num, s1);
                break;
            case 2:
                double val2=1.28611;
                calcular(val2, num, s2);
                break;
            case 3:
                double val3=129.852;
                calcular(val3, num, s3);
                break;
            default:
                System.out.println("Opción incorrecta, intente nuevamente");
                menu();
        }
      
}
    public static void calcular(double v,double n, String s) {
        System.out.println("La cantidad de "+n+" Euros son "+(n*v)+" "+s);
        menu();
    }
}