/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jrv11
 */
public class DNI {
    /**La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
     * acceder luego a los atributos del dni de la persona creando objetos y
     * jugando desde el main
     */
    
    private String serie;
    private int dni;

    public DNI() {
    }

    public DNI(String serie, int dni) {
        this.serie = serie;
        this.dni = dni;
    }
    
    

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", dni=" + dni + '}';
    }
    
    
}
