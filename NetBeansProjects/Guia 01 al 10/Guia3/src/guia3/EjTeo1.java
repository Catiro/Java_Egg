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
public class EjTeo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba dos numeros");
        int num, num2;
        num = leer.nextInt();
        num2 = leer.nextInt();

        if (num > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (num > 25 || num2 > 25) {
            System.out.println("Al menos un numero es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }

    }

}
