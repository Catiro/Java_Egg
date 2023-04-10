/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    /*
    *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
    *La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrece los grados en Celsius: ");
        int grados = leer.nextInt();
        int far = 32 + (9 * grados / 5);
        
        System.out.println("El equivalente en grados Fahrenheit es = " + far );
        
    }
    
}
