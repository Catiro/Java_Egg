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
public class EjTeo5 {

    /**
     * @param args the command line arguments Realizar un programa que lea 4
     * números (comprendidos entre 1 y 20) e imprima el número ingresado seguido
     * de tantos asteriscos como indique su valor. Por ejemplo: 5 ***** 3 ***
     * 11*********** 2 **
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int numero;
        int j = 0;

        do {
            numero = leer.nextInt();
            if (numero <= 20 && numero >= 0) {
                j++;
                System.out.print(numero + " ");
                for (int i = 0; i < numero; i++) {
                    System.out.print("*");
                } 
                

                System.out.println("");
            } else {
                System.out.println("El numero ingresado no esta dentro del rango");
                break;
            }
        } while (j < 4);

    }
}
