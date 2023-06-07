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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Realice un programa para que el usuario adivine el resultado de una
         * multiplicación entre dos números generados aleatoriamente entre 0 y
         * 10. El programa debe indicar al usuario si su respuesta es o no
         * correcta. En caso que la respuesta sea incorrecta se debe permitir al
         * usuario ingresar su respuesta nuevamente. Para realizar este
         * ejercicio investigue como utilizar la función Math.random() de Java.
         * 
         */
        Scanner leer = new Scanner(System.in);
        int num = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        System.out.println(num + " - " + num2);
        System.out.println("Adivine cuanto es la multiblicación de A * B");
        int rta = leer.nextInt();
        while (rta != num * num2){
            System.out.println("Incorrecto! Vuelve a intentar");
            rta = leer.nextInt();
        } 
        
        System.out.println("Adivinaste!!! La multiplicación entre " + num + "*" + num2 + " es igual a " + rta );
        
    }
    
}
