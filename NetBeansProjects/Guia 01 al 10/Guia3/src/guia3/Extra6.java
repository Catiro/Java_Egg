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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Leer la altura de N personas y determinar el promedio de estaturas
         * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas
         * en general.
         *
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a medir");
        int n = leer.nextInt();
        double j = 0;
        int i = 1;
        double k = 0;
        double l = 0;
        double altura;
        do {
            System.out.println("Ingrese la altura de la persona " + i);
            altura = leer.nextDouble();
            if (altura < 1.60){
              k++;  
              l = l + altura;
            }
            j = j + altura;
            i++; 
            
        } while (i <= n);
        System.out.println("La altura promedio de las " + n + " es de " + j/n );
        System.out.println("La altura promedio de las personas con estatura menor a 1.60m es de " + l/k );
    }

}
