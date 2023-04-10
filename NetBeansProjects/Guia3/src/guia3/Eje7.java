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
public class Eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Realizar un programa que simule el funcionamiento de un dispositivo
         * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
         * Las cadenas deben llegar con un formato fijo: tienen que ser de un
         * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y
         * el último tiene que ser una O. Las secuencias leídas que respeten el
         * formato se consideran correctas, la secuencia especial “&&&&&” marca
         * el final de los envíos (llamémosla FDE), y toda secuencia distinta de
         * FDE, que no respete el formato se considera incorrecta. Al finalizar
         * el proceso, se imprime un informe indicando la cantidad de lecturas
         * correctas e incorrectas recibidas. Para resolver el ejercicio deberá
         * investigar cómo se utilizan las siguientes funciones de Java
         * Substring(), Length(), equals().
         */

        Scanner leer = new Scanner(System.in);
        String frase;
        int i = 0;
        do {
            System.out.println("Ingresa una frase");
            frase = leer.nextLine();
            if (frase.length() == 5 && frase.substring(0, 1).equalsIgnoreCase("x") && frase.substring(4, 5).equalsIgnoreCase("o")) {
                i++;
            } 

        } while (!frase.equals("&&&&&"));

        System.out.println("La cantidad de frases correctas ingresadas son " + i);

    }

}
