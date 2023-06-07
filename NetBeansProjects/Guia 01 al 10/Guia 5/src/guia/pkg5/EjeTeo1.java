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
public class EjeTeo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de
         * compañeros de equipo y define su tipo de dato de tal manera que te
         * permita alojar sus nombres más adelante.
         * 
         */
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[6];
        String nombre;
        
        // Completar cada elemento de la matriz
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el nombre del compañero");
            nombre = leer.nextLine();
            equipo[i] = nombre;
        }
        
        for (int i = 0; i < 6; i++) {
            nombre = equipo[i];
            System.out.print(nombre + " , ");
           
        }
        System.out.println("");
        
        // For mejorado
        String aux = "";
        for (String elemento: equipo) {
            aux += elemento + " * ";
        }
        System.out.println(aux);
        
    }
    
}
