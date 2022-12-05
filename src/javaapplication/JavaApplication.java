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
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    byte byte1;
    float float2;  
    short short3;
    int int4;
    long long5;
    float float6;
    double double7;
    boolean boo, boo1;
    char char1, char2;
    double double1, res1, res2;
    long res3;
   
    byte1=126;
    short3=25000;
    int4=1000;
    long5=123456789;
    float6=100.2f;
    double7=1000.123456;
    
    System.out.println("Ingrese su nombre");
    String nombre = leer.nextLine();
    
    System.out.println("Ingrese su edad");
    int edad = leer.nextInt();
    res3= long5 + short3;
    
    System.out.println("Ingrese True");
    boo1= leer.nextBoolean();
    
    System.out.println("Ingrese un símbolo");
    char2 = leer.next().charAt(0);
    
    System.out.println("Hola " + nombre + " tu edad es " + edad + ", y estás trabajando en Java");
    
    System.out.println(byte1 + "+" + int4 + "=" + (byte1 + int4));
    
    System.out.println(long5 + "+" + short3 + "=" + res3);
    
    System.out.println("Ingresaste " + boo1);
    
    System.out.println("El símbolo ingresado es " + char2);
    
    }
    
}
