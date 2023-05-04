/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   /**Método crearPersona que pida al usuario Nombre y fecha de nacimiento de
     * la persona a crear. Retornar el objeto Persona creado.
    * 
    */ 
   public Persona crearPersona(){
       System.out.println("Ingrese el nombre de la persona: ");
       String nombre = leer.nextLine();
       int dia, mes, anio;
        System.out.println("Ingrese el día de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        Date nacimiento = new Date(anio-1900, mes-1, dia);
        return new Persona(nombre,nacimiento);
   }
   
   /**Método calcularEdad que calcule la edad del usuario utilizando el
     * atributo de fecha de nacimiento y la fecha actual. 
    */
   public int calcularEdad(Persona ente){
     Date fecha = new Date();
     return fecha.getYear() - ente.getNacimiento().getYear();
           
    }
   
   /**Método menorQue recibe como parámetro una Persona y una edad. Retorna
     * true si la persona es menor que la edad consultada o false en caso
     * contrario. 
    */
    public boolean menorQue(Persona ente, int edad){
     return (calcularEdad(ente)- edad >0);
    }
    
    /**Método mostrarPersona que muestra la información de la persona deseada.
     */
     public void mostrarPersona(Persona ente){
         System.out.println(ente.toString());
     }
}
