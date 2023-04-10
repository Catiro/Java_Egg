/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Diseñe una función que pida el nombre y la edad de N personas e
         * imprima los datos de las personas ingresadas por teclado e indique si
         * son mayores o menores de edad. Después de cada persona, el programa
         * debe preguntarle al usuario si quiere seguir mostrando personas y
         * frenar cuando el usuario ingrese la palabra “No”.
         */
        Scanner leer = new Scanner(System.in);
        String opt;
        String esc;

        do {
            esc = datos();
            System.out.println(esc);
            System.out.println("Desde continuar? (si/no)");
            opt = leer.nextLine();

        } while (!opt.equalsIgnoreCase("no"));
        System.out.println("Salio del programa");

    }

    public static String datos() {
        Scanner leer = new Scanner(System.in);
        String nombre, escribir;
        int edad;
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        if (edad >= 18){
            escribir = nombre + " es mayor de edad";
        } else {
            escribir = nombre + " es menor de edad";
        }
        
        return escribir;
    }

}
