/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author jrv11
 */
public class ArrayService {

    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public static int[] inicializarA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        
        return array;
    }

    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public static void mostrar(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
        System.out.println("");
    }

    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public static void ordenar(int[] array) {
        Arrays.sort(array);
        int[] arrayAux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayAux[i] = array[array.length - 1 - i];
        }
        System.out.println("Su orden de mayor a menor queda: ");
        mostrar(arrayAux);
    }

    /**
     * Método inicializarB copia los primeros 10 números del arreglo A en el
     * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     *
     * @param array
     */
    public static int[] inicializarB(int[] arrayA) {
        int[] arrayB = new int[20];
        for (int i = 0; i < 20; i++) {

            if (i < 10) {
                arrayB[i] = arrayA[i];
            } else if (i >= 10) {
                arrayB[i] = (int) 0.5;
            }
        }

        return arrayB;
    }

}
