/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

/**
 *
 * @author jrv11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Realice un programa que compruebe si una matriz dada es
         * antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta
         * es igual a su propia traspuesta, pero cambiada de signo. Es decir, A
         * es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se
         * denota por AT y se obtiene cambiando sus filas por columnas (o
         * viceversa).
         */
        int[][] matriz = {{0,-2,4}, {2,0,2}, {-4,-2,0}};
     
        
      
        int m = 0;
        //int[][] trans = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] == -1 * matriz[j][i]){
                  m++;  
                }
                    
              //  trans[i][j] =  matriz[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("  ");            
        }
        System.out.println("  ");
        
        if (m == 9){
            System.out.println("La matriz es antisimétrica");
        } else {
           System.out.println("La matriz NO es antisimétrica"); 
        }
       
    }
    
}
