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
public class ea11 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
 
    menu();
    
    System.out.println("desea volver al menú principal (S) o salir (N)?");
                String op3 = leer.nextLine();
                String opmm = op3.toLowerCase();
                switch (op3) {
                    case "n":
                        System.out.println("Gracias por utilizar el servicio, hasta luego.");
                        break;
                    case "s":
                        menu();
                        break;
                }
}
    public static void menu(){
    Scanner leer = new Scanner(System.in);  
        System.out.println("Bienvenido a calculadora sencilla, ingrese dos números par acceder al menú");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("MENU");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Ingresar nuevos números");
        System.out.println("6: Salir");
        int op = leer.nextInt();
        switch (op) {
            case 1:
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
                break;
            case 4:
                System.out.println(num1 + " ./. " + num2 + " = " + (num1/num2));
                break;
            case 5:
                menu();
                break;
            case 6:
                System.out.println("Seguro que quiere salir?");
                String op2 = leer.nextLine();
                String opm = op2.toLowerCase();
                switch (op2) {
                    case "s":
                        System.out.println("Gracias por utilizar el servicio, hasta luego.");
                        break;
                    case "n":
                        menu();
                        break;
                }
                
                
        }
    }
}