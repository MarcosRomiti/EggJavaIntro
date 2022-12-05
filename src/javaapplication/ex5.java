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
public class ex5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double monto;
        boolean boo=false;
        do {
            System.out.print("Ingrese el tipo de clase de socio:");
        String clase=leer.nextLine();
        
        clase=clase.toLowerCase();
        switch (clase) {
            case "a":
                System.out.print("Ingrese el monto del tratamiento");
                monto=leer.nextDouble();
                monto=monto/2;
                System.out.println("Socio de clase A obtiene 50% de descuento, el monto a abonar es :"+monto);
                boo=true;
                break;
            case "b":
                System.out.print("Ingrese el monto del tratamiento");
                monto=leer.nextDouble();
                double desc =(monto*35)/100;
                monto=monto-desc;
                System.out.println("Socio de clase B obtiene el 35% de descuento, el monto a abonar es :"+monto);
                boo=true;
                break;
            case "c":
                System.out.print("Ingrese el monto del tratamiento");
                monto=leer.nextDouble();
                System.out.println("Socio de clase C no tiene beneficio");
                boo=true;
                break;
            default:
                System.out.println("Opción ingresada incorrecta, intente nuevamente.");
        }
        }while(boo==false);
        
    }
}
