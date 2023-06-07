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
public class EjTeo4 {

    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual a
     * cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero
     * cero". El programa deberá calcular y mostrar el resultado de la suma de
     * los números leídos, pero si el número es negativo no debe sumarse. Nota:
     * recordar el uso de la sentencia break.
     *
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int numero, i, j;
        i = 0;
        j = 0;
        System.out.println("Ingrese un numero");

        do {

            numero = leer.nextInt();
            if (numero == 0) {
                System.out.println("El numero ingresado es igual a 0");
                break;
            } else if (numero > 0) {
                j = j + numero;
            }
            i = i + 1;

        } while (i < 20);

        System.out.println("La suma de los numeros ingresados es " + j);
    }

}
