/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

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
         * Dado un tiempo en minutos, calcular su equivalente en días y horas.
         * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
         * calcular su equivalente: 1 día, 2 horas. *
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        double min = leer.nextDouble();
        double dias;
        dias = Math.floor(min/1440);
        double horas;
        horas = Math.floor(min/60)- 24*dias;
        
        
        System.out.println("El equivalente es: " + dias + " dias, " +  horas + " horas");

    }

}
