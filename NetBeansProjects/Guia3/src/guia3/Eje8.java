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
public class Eje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Dibujar un cuadrado de N elementos por lado utilizando el carácter
         * “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
         * dibujar lo siguiente:
         *
         */
        Scanner leer = new Scanner(System.in);
        int a;
        int b;
        System.out.println("ingrese un numero");
        int n = leer.nextInt();
        for (a = 1; a <= n; a++) {
            for (b = 1; b <= n; b++) {
                if (a > 1 && a < n && b > 1 && b < n) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");

        }
    }
}
