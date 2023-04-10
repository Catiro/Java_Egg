/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = leer.nextInt();
        System.out.println("El doble de " + numero + " es = " + numero*2 );
        System.out.println("El triple de " + numero + " es = " + numero*3 );
        System.out.println("La Raiz cuadrada de " + numero + " es = " + sqrt(numero) );
    }
    
}
