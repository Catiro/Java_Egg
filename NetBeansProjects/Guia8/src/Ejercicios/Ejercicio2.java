/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio sv = new CafeteraServicio();

        System.out.println("Ingrese la capacidad de la Cafetera");
        double capacidad = leer.nextInt();
        int opc;
        do {
            System.out.println("Ingrese la opción");
            System.out.println("1) Llenar Cafetera");
            System.out.println("2) Servir Taza de Cafe");
            System.out.println("3) Agregar Cafe a la cafetera");
            System.out.println("4) Vaciar cafetera");
            System.out.println("5) Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:                    
                    sv.llenarCafetera(capacidad);
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    double tamaño = leer.nextInt();
                    sv.servirTaza(tamaño);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de cafe que desea agregar");
                    double candidad = leer.nextInt();
                    sv.agregarCafe(candidad);
                    break;
                case 4:
                    sv.vaciarCafetera();
                    System.out.println("Se vacio la cafetera");
                    break;
                case 5:
                    System.out.println("Salio del menu");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
            System.out.print("\033[H\033[2J");
            
           

        } while (opc != 5);

    }
}
