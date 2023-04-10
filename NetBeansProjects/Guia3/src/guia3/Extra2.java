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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un
         * valor diferente a cada una. A continuación, realizar las
         * instrucciones necesarias para que: B tome el valor de C, C tome el
         * valor de A, A tome el valor de D y D tome el valor de B. Mostrar los
         * valores iniciales y los valores finales de cada variable. Utilizar
         * sólo una variable auxiliar.
         * 
         */
        Scanner leer = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3; 
        int d = 4; 
        int e = b;
        
        System.out.println("Valores iniciales:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        
        b = c;
        c = a;
        a = d;
        d = e;
        
        System.out.println("Valores finales:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        
    }
    
}
