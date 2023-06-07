/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia11.teo;


import Entidad.DNI;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Guia11001Teo {

    public static void main(String[] args) {
        /**EJERCICIO PERSONA Realiza un programa en donde una clase Persona
         * tenga como atributo nombre, apellido y un objeto de clase Dni. La
         * clase Dni tendrá como atributos la serie (carácter) y número. Prueba
         * acceder luego a los atributos del dni de la persona creando objetos y
         * jugando desde el main
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona perso = new Persona();
        DNI dni = new DNI();
        System.out.println("Nomre");
        perso.setNombre(leer.next());
        System.out.println("Apellido");
        perso.setApellido(leer.next());       
        System.out.println("Ingrese DNI");
        dni.setDni(leer.nextInt());
        System.out.println("Ingrese Letra");
        dni.setSerie(leer.next());
        perso.setDni(dni);
        
        System.out.println(perso.toString());
    }
}
