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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una aplicación que nos pida un número por teclado y con una
         * función se lo pasamos por parámetro para que nos indique si es o no
         * un número primo, debe devolver true si es primo, sino false. Un
         * número primo es aquel que solo puede dividirse entre 1 y sí mismo.
         * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
         * embargo, 17 si es primo.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        boolean prim = primo(num);

        System.out.println("Es primo?");
        System.out.println(prim);

    }

    public static boolean primo(int num) {
        boolean prim = true;
        int j = 0;
        int i;

        if (num % 2 == 0) {
            prim = false;
        } else {
            for (i = 3; i < num / 2; i++) {
                if (num % i == 0) {
                    j++;
                }
            }

        }
        if (j > 0) {
            prim = false;
        }
        return prim;
    }

}
