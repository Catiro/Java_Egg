/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author jrv11
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
         * caracteres y, a medida que el usuario las va ingresando, construya
         * una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
         * palabras se ubicarán todas en orden horizontal en una fila que será
         * seleccionada de manera aleatoria. Una vez concluida la ubicación de
         * las palabras, rellene los espacios no utilizados con un número
         * aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
         * letras creada. Nota: Para resolver el ejercicio deberá investigar
         * cómo se utilizan las siguientes funciones de Java substring(),
         * Length() y Math.random().
         */
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        int[] fila = new int[5];
        int[] columna = new int[5];
        String[][] matriz = new String[20][20];

        // Pedido de palabras y gardado en vector "palabras"
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese la palabra " + (i + 1));
                palabras[i] = leer.next();

            } while (palabras[i].length() > 5 || palabras[i].length() < 3);
            
            fila[i] = (int) (Math.random() * 20);
            columna[i] = (int) (Math.random() * (20 - palabras[i].length()));
        }
        System.out.println("");
        System.out.println("");

       // rellenar(matriz, palabras, fila, columna);
       
       rellenar2(matriz, palabras, fila, columna);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + "  |  ");
                
            }
            System.out.println("");
            System.out.println("");

        }

        
    }

   

    private static void rellenar2(String[][] matriz, String[] palabras, int[] fila, int[] columna) {
        
        int l;
       
        for (int i = 0; i < 20; i++) {
            int k = 0;
            for (int j = 0; j < 20; j++) {
                if (i == fila[0]) {
                    if (j >= columna[0] && j <= columna[0] + palabras[0].length()-1) {
                        matriz[i][j] = substring(palabras[0],k,k+1);
                        k++;
                    } else {
                        l = (int) (Math.random() * 10);
                        matriz[i][j] = Integer.toString(l);
                    }
                } else if (i == fila[1]) {
                    if (j >= columna[1] && j <= columna[1] + palabras[1].length()-1) {
                        matriz[i][j] = substring(palabras[1],k,k+1);
                        k++;
                    } else {
                        l = (int) (Math.random() * 10);
                        matriz[i][j] = Integer.toString(l);
                    }
                } else if (i == fila[2]) {
                    if (j >= columna[2] && j <= columna[2] + palabras[2].length()-1) {
                        matriz[i][j] = substring(palabras[2],k,k+1);
                        k++;
                    } else {
                        l = (int) (Math.random() * 10);
                        matriz[i][j] = Integer.toString(l);
                    }
                } else if (i == fila[3]) {
                    if (j >= columna[3] && j <= columna[3] + palabras[3].length()-1) {
                        matriz[i][j] = palabras[3].substring(k,k+1);
                        k++;
                    } else {
                        l = (int) (Math.random() * 10);
                        matriz[i][j] = Integer.toString(l);
                    }
                } else if (i == fila[4]) {
                    if (j >= columna[4] && j <= columna[4] + palabras[4].length()-1) {
                        matriz[i][j] = substring(palabras[4],k,k+1);
                        k++;
                    } else {
                        l = (int) (Math.random() * 10);
                        matriz[i][j] = Integer.toString(l);
                    }
                } else {

                    l = (int) (Math.random() * 10);
                    matriz[i][j] = Integer.toString(l);

                }
            }
        }
    }
}
