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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Escriba un programa que averigüe si dos vectores de N enteros son
         * iguales (la comparación deberá detenerse en cuanto se detecte alguna
         * diferencia entre los elementos).
         */
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vect = new int[n];
        int[] vect1 = new int[n];
        boolean veri = true;
        

        for (int i = 0; i < n; i++) {
            vect[i] = leer.nextInt();//(int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            vect1[i] = leer.nextInt();//(int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            if (vect[i] != vect1[i]) {
                veri = false;
                break;
            }
        }
        if (veri){
            System.out.println("Los vectores son identicos");
        } else {
            System.out.println("Los vectores son diferentes");
        }

    }

}
