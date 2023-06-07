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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una aplicación que a través de una función nos convierta una
         * cantidad de euros introducida por teclado a otra moneda, estas pueden
         * ser a dólares, yenes o libras. La función tendrá como parámetros, la
         * cantidad de euros y la moneda a convertir que será una cadena, este
         * no devolverá ningún valor y mostrará un mensaje indicando el cambio
         * (void). El cambio de divisas es: 0.86 libras es un 1 € 1.28611 $ es
         * un 1 € 129.852 yenes es un 1 €
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los €");
        int cantidad = leer.nextInt();
        String moneda;
        
        System.out.println("Ingrese a que moneda desea transformar:");
        System.out.println("a. Libra");
        System.out.println("b. Dolar");
        System.out.println("c. Yen");
        moneda = leer.nextLine   ();

        transformar(cantidad, moneda);
    }

    private static void transformar(int cantidad, String moneda) {
        switch (moneda.toLowerCase()) {
            case "a":
                System.out.println(cantidad + "€ son " + cantidad * 0.86 + " Libras");
                break;
            case "b":
                System.out.println(cantidad + "€ son " + cantidad * 1.28611 + " Dolares");
                break;
            case "c":
                System.out.println(cantidad + "€ son " + cantidad * 129.852 + " Yenes");
                break;
            default:
                System.out.println("La opción ingresada no es valida. Intenta nuevamente");
                break;

        }
    }

}
