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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crear una función rellene un vector con números aleatorios, pasándole
         * un arreglo por parámetro. Después haremos otra función o
         * procedimiento que imprima el vector.
         */
        
        int[] vector = new int[10];
        
        rellenar(vector);
        escribir(vector);
        
    }

    public static void rellenar(int[] vector) {
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void escribir(int[] vector) {
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " | "); //vector[i] = (int) (Math.random() * 10);
        }
    }
    
}
