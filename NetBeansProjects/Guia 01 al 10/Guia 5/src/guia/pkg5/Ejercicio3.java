/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Recorrer un vector de N enteros contabilizando cuántos números son de
         * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         * 
         */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
     
        
        int[] vect = new int[n];
        int[] vect1 = new int[n];

        for (int i = 0; i < n; i++) {
            vect[i] = (int) (Math.random() * 99999);
           
            vect1[i] = Integer.toString(vect[i]).length();
        }
        int g,j,k,l,m;
        g=0;
        j=0;
        k=0;
        l=0;
        m=0;
       
        for (int elemento: vect1) {
            switch (elemento){
                case 1:
                    g++;
                    break;
                case 2:
                    j++;
                    break;
                case 3:
                    k++;
                    break;
                case 4:
                    l++;
                    break;
                case 5:
                    m++;
                    break;                          
            }
        }
            
       
        System.out.println("");
        System.out.println("Digitos |   Cantidad  ");
        System.out.println("    1   |    " + g);
        System.out.println("    2   |    " + j);
        System.out.println("    3   |    " + k);
        System.out.println("    4   |    " + l);
        System.out.println("    5   |    " + m);
        
        
    }
    
}
