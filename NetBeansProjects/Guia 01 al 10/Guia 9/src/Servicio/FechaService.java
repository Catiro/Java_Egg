/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /** * Método fechaNacimiento que pregunte al usuario día, mes y año de su
     * nacimiento.Luego los pase por parámetro a un nuevo objeto Date. El
 método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new
 Date(anio, mes, dia);
     * @return 
     */
    public Date fechaNacimiento(){
        int dia, mes, anio;
        System.out.println("Ingrese el día de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        Date nacimiento = new Date(anio-1900, mes-1, dia);
        System.out.println("La fecha de nacimiento es: " + nacimiento);
       return nacimiento;
    }
    
    /** Método fechaActual que cree un objeto fecha con el día actual.Para esto
     *  usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date();
     *  @return 
     */
    public Date fechaActual(){
        Date fechaActual = new Date();
        System.out.println("La fecha de nacimiento es: " + fechaActual);
       return fechaActual;        
    }
    
    /**Método diferencia que reciba las dos fechas por parámetro y retorna la
     * diferencia de años entre una y otra (edad del usuario).
     * 
     */
     public int diferencia(Date nacimiento, Date fechaActual){
               
       return fechaActual.getYear()-nacimiento.getYear();        
    }
}
