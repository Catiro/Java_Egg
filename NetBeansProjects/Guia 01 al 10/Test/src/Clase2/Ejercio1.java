/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;



/**
 *
 * @author jrv11
 */
public class Ejercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
        // El programa deberá después mostrar el resultado de la suma
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero que desea sumar");
        
        int num1;
        num1 = leer.nextInt();
        int num2;
        num2 = leer.nextInt();
        int suma;
        suma = num1 + num2;     
                
        System.out.println("El resultdo de la suma es = " + suma);
    }
}
       
          
   