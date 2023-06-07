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
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Realizar un programa que pida dos números enteros positivos por
         * teclado y muestre por pantalla el siguiente menú:El usuario deberá
         * elegir una opción y el programa deberá mostrar el resultado por
         * pantalla y luego volver al menú. El programa deberá ejecutarse hasta
         * que se elija la opción 5. Tener en cuenta que, si el usuario
         * selecciona la opción 5, en vez de salir del programa directamente, se
         * debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
         * desea salir del programa (S/N)? Si el usuario selecciona el carácter
         * ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingesa un numero positivo");
        int num = leer.nextInt();

        while (num < 0) {
            System.out.println("Debes ingresar un numero mayor a 0 ");
            num = leer.nextInt();
        }
        System.out.println("Ingesa otro numero positivo");
        int num2 = leer.nextInt();
        while (num < 0) {
            System.out.println("Debes ingresar un numero mayor a 0 ");
            num = leer.nextInt();
        }
        String salir = "n";

        
        do {
            System.out.println("|---------------|");
        System.out.println("|1 - Sumar      |");
        System.out.println("|2 - Restar     |");
        System.out.println("|3 - Multiplicar|");
        System.out.println("|4 - Dividir    |");
        System.out.println("|5 Salir        |");
        System.out.println("|---------------|");
        System.out.println("Elija una opción");

            int option = leer.nextInt();

            switch (option) {
                case 1:
                    System.out.println("La suma de " + num + "+" + num2 + "=" + (num + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num + "-" + num2 + "=" + (num - num2));
                    break;
                case 3:
                    System.out.println("El producto de " + num + "*" + num2 + "=" + num * num2);
                    break;
                case 4:
                    System.out.println("La división de " + num + "/" + num2 + "=" + num / num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    
                    salir = leer.next();
                    if("s".equalsIgnoreCase(salir)){
                        break;
                    }

                default:
                    System.out.println("La opción ingresada no es valida");
            }
           

        } while ("n".equalsIgnoreCase(salir));
System.out.println("Programa finalizado");
    }
}
