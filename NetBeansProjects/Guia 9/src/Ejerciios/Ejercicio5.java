/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciios;

import Entidades.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada. 
         */
        Scanner leer = new Scanner(System.in);
        PersonaService persona = new PersonaService();
        Persona ente1 = persona.crearPersona();
        System.out.println("La edad de la persona es: " + persona.calcularEdad(ente1));
        System.out.println("Ingrese la edad que desea comparar:");
        int edad = leer.nextInt();
        System.out.println(persona.menorQue(ente1, edad));
        persona.mostrarPersona(ente1);
    }
    
}
