/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Realizar un algoritmo que calcule la suma de todos los elementos de
         * un vector de tamaño N, con los valores ingresados por el usuario.
         */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Infrese el tamaño del vector");
        
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        System.out.println("Ingrese los valores para cada posición del vector");
        int suma = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " | ");
        }
        System.out.println("");
        System.out.println("La suma del vector es: " + suma );
        
    }
    
    
    
}
