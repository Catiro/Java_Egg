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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
         * se muestre su equivalente en romano.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de Socio: ");

        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El equivalente de " + num + " es: I");
                break;
            case 2:
                System.out.println("El equivalente de " + num + " es: II");
                break;
            case 3:
                System.out.println("El equivalente de " + num + " es: III");
                break;
            case 4:
                System.out.println("El equivalente de " + num + " es: IV");
                break;
            case 5:
                System.out.println("El equivalente de " + num + " es: V");
                break;
            case 6:
                System.out.println("El equivalente de " + num + " es: VI");
                break;
            case 7:
                System.out.println("El equivalente de " + num + " es: VII");
                break;
            case 8:
                System.out.println("El equivalente de " + num + " es: VIII");
                break;
            case 9:
                System.out.println("El equivalente de " + num + " es: IX");
                break;
            case 10:
                System.out.println("El equivalente de " + num + " es: X");
                break;
            default:
                System.out.println("el numero ingresado no esta entre 1 y 10");
                break;
        }
    }

}
