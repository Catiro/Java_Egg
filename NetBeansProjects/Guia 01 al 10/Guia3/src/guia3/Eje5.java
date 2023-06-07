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
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Escriba un programa en el cual se ingrese un valor límite positivo,
         * y a continuación solicite números al usuario hasta que la suma de
         * los números introducidos supere el límite inicial.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el limite: ");
        int limite = leer.nextInt();
        int j = 0;
        int num;

        while (limite < 0) {
            System.out.println("el limite es menor que 0 ingresa uno nuevo ");
            limite = leer.nextInt();
        }
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            j = j + num;

        } while (j <= limite);

    }

}
