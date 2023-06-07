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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Escriba un programa que lea números enteros. Si el número es múltiplo
         * de cinco debe detener la lectura y mostrar la cantidad de números
         * leídos, la cantidad de números pares y la cantidad de números
         * impares. Al igual que en el ejercicio anterior los números negativos
         * no deben sumarse. Nota: recordar el uso de la sentencia break.
         *
         */
        Scanner leer = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num % 5 == 0){
                break;
            } else if (num % 2 == 0 && num > 0){
                par++;
            }else if (num > 0){
                impar++;
            }
        } while (num != 0);
        System.out.println("La cantidad de numeros pares ingresados es " + par);
        System.out.println("La cantidad de numeros impares ingresados es " + impar);
    }

}
