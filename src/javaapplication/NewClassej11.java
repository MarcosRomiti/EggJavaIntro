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
public class NewClassej11 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una frase");
   
    frasear(leer.nextLine());
    
}
    public static void frasear(String fra){
    String x;
    int l = fra.length();
    for (int i=0; i<l; i++){
        
        x = fra.substring(i,i+1);
        switch (x) {
            case "a": x="@";
            break;
            case "e": x="#";
            break;
            case "i": x="$";
            break;
            case "o": x="%";
            break;
            case "u": x="*";
            break;
        }
        System.out.print(x);
        
    }
System.out.println(" ");
}
}

