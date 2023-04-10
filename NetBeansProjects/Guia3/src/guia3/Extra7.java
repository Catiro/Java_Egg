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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Realice un programa que calcule y visualice el valor máximo, el valor
         * mínimo y el promedio de n números (n>0). El valor de n se solicitará
         * al principio del programa y los números serán introducidos por el
         * usuario. Realice dos versiones del programa, una usando el bucle
         * “while” y otra con el bucle “do - while” 
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int i = 0;
        double max = 0;
        double min = 0;
        double j = 0;
        double num;
        System.out.println("Ingrese los numeros");
        while (i < n){
            i++;
            num = leer.nextDouble();
            if (i == 1){
            max = num;
            min = num;
            } else {
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            j = j + num;
            }
        }        
        System.out.println("El numero maximo ingresado es " + max);
        System.out.println("El numero minimo ingresado es " + min);
        System.out.println("El promedio de los numeros ingresados es " + j/n);
    }
    
}
