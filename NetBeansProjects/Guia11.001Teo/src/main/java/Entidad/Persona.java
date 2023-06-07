/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jrv11
 */
public class Persona {
    /**EJERCICIO PERSONA Realiza un programa en donde una clase Persona tenga
     * como atributo nombre, apellido y un objeto de clase Dni. La clase Dni
     * tendrá como atributos la serie (carácter) y número. Prueba acceder luego
     * a los atributos del dni de la persona creando objetos y jugando desde el
     * main
     */
    private String nombre;
    private String apellido;
    private DNI dni = new DNI();

    public Persona() {

    }

    public Persona(String nombre, String apellido, DNI dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = new DNI();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni.toString() + '}';
    }
    
    
    
    
}
