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
public class EjeTeo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Escribir un programa que procese una secuencia de caracteres
         * ingresada por teclado y terminada en punto, y luego codifique la
         * palabra o frase ingresada de la siguiente manera: cada vocal se
         * reemplaza por el carácter que se indica en la tabla y el resto de los
         * caracteres (incluyendo a las vocales acentuadas) se mantienen sin
         * cambios.
         *
         *
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cambio(frase);

    }

    public static String cambio(String frase) {
        int n = frase.length();
        String letra;
        String frase2 = "";
        for (int i = 0; i < n; i++) {
            letra = frase.substring(i, i + 1);
            switch (letra.toLowerCase()) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            frase2 = frase2 + "letra";

            System.out.print(letra);
        }
        System.out.println("");
        return frase2;
    }

}
