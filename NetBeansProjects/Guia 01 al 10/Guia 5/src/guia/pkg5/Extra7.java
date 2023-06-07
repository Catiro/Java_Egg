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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /**
         * 
         */  
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de numero de la sucecion Fibonacci");
        n = leer.nextInt();
        int[] fibo = new int[n];
                
        for (int i = 0; i < n; i++) {
            if (i <= 1){
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i-1] + fibo[i-2];
                    }
        }
        for (int i = 0; i < n; i++) {
            System.out.print( fibo [i] + " || ");
        }
                
    }
    
}
