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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Los profesores del curso de programación de Egg necesitan llevar un
         * registro de las notas adquiridas por sus 10 alumnos para luego
         * obtener una cantidad de aprobados y desaprobados. Durante el período
         * de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
         * evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
         * Primer trabajo práctico evaluativo 10% Segundo trabajo práctico
         * evaluativo 15% Primer Integrador 25% Segundo integrador 50% Una vez
         * cargadas las notas, se calcula el promedio y se guarda en el arreglo.
         * Al final del programa los profesores necesitan obtener por pantalla
         * la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
         * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del
         * curso
         */
        Scanner leer = new Scanner(System.in);
        int n, m;
        n = 3;
        m = 6;

        double[][] matriz = new double[n][m];
        double promedio;

        for (int i = 1; i < n; i++) {
            promedio = 0;

            for (int j = 0; j < m; j++) {

                switch (j) {
                    case 0:
                        System.out.println("Ingrese las nota del alumno " + i);
                        matriz[i][j] = i;
                        break;

                    case 1:
                        System.out.println("Nota del TP evaluativo");
                        matriz[i][j] = leer.nextDouble() * 0.1;
                        break;
                    case 2:
                        System.out.println("Nota del 2do TP evaluativo");
                        matriz[i][j] = leer.nextDouble() * 0.15;
                        break;
                    case 3:
                        System.out.println("Nota del Primer Integrador");
                        matriz[i][j] = leer.nextDouble() * 0.25;
                        break;
                    case 4:
                        System.out.println("Nota del Segundo Integrador");
                        matriz[i][j] = leer.nextDouble() * 0.5;
                        break;
                    case 5:
                        matriz[i][j] = promedio;
                        break;
                }
                if (j != 0 && j != 5) {
                    promedio += matriz[i][j];
                }
            }
        }
        //String[] vect = new String[6];
        System.out.println("|  Alumno  |  Nota 1 TP  |  Nota 2 TP  |  Nota 1 Int | Nota 2 Int |  Nota Promedio  |");

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print("|   " + matriz[i][j] + "    ");

            }
            System.out.println("");

        }
    }
}
