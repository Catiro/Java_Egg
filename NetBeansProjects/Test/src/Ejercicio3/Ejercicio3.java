/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;


/**
 *
 * @author jrv11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
  //  Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.

    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    String frase;
    System.out.println("Ingrese una frase");
    
    
    frase = leer.nextLine();
    System.out.println("En MAYUSCULAS: " + frase.toUpperCase( ));
    System.out.println("En minusculas: " + frase.toLowerCase() );

            
   }
            
}

