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
public class EjeTeo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**Crea un procedimiento EsMultiplo que reciba los dos números pasados
         * por el usuario, validando que el primer número múltiplo del segundo e
         * imprima si el primer número es múltiplo del segundo, sino informe que
         * no lo son.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        boolean log;
        System.out.println("El numero "+ num +" es multiplo del numero "+ num2 + "?");
        
        EsMultiplo(num,num2);
        
    }
    public static void EsMultiplo(int num, int num2){
        boolean log = false;
       
        if (num % num2 == 0){
            log = true;
                             
        } 
        System.out.println(log);
        
        
    }
}
