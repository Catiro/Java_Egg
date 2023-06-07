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
public class EjTeo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.


        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Nota del Alumno");

        int nota;
        
        nota = leer.nextInt();

        while (nota > 10 || nota < 0 ){

            System.out.println("La nota esta fuera de los parametros, vuelva a ingresar la nota");
            nota = leer.nextInt();
        }
    }
}
