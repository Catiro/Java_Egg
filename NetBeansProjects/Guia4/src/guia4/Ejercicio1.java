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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una aplicación que le pida dos números al usuario y este pueda
         * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
         * tener una función para cada operación matemática y deben devolver sus
         * resultados para imprimirlos en el main.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Ingrese que operacion desea realizar (+,-,*,/)");
        double rta;
        String opt = leer.next();
        switch (opt) {
            case "+":
                rta = sumar(num,num2);
                System.out.println("La suma de " + num + " mas " + num2 + " es :" + rta);
                break;
            case "-":
                rta = restar(num, num2);
                System.out.println("La resta de " + num + " menos " + num2 + " es :" + rta);
                break;
            case "*":
                rta = multi(num, num2);
                System.out.println("La multiplicación de " + num + " por " + num2 + " es :" + rta);
                break;
            case "/":
                if (num2 != 0){
                rta = div(num, num2);
                System.out.println("La división de " + num + " sobre " + num2 + " es :" + rta);
                } else {
                    System.out.println("No se puede dividir sobre 0");
                }
                
                break;
            default:
                System.out.println("Operador no valido");
        }
    }

    public static double sumar(int num, int num2) {
        double b = num + num2;
        return b;
    }

    public static double restar(int num, int num2) {
        double b = num - num2;
        return b;
    }

    public static double multi(int num, int num2) {
        double b = num * num2;
        return b;
    }

    public static double div(double num, double num2) {
        double b = num / num2;
        return b;
    }
}
