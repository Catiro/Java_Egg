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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Realizar un programa que llene una matriz de tamaño NxM con valores
         * aleatorios y muestre la suma de sus elementos.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero de filas y columnas para la matriz");
        int n= leer.nextInt();
        int m = leer.nextInt();
        int suma = 0;
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "  "); 
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los elementos de la matriz es " + suma);
    }
    
}
