/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jrv11
 */
public class Jugador {
    /**EJERCICIO JUGADOR Realiza un programa en donde exista una clase Jugador
     * que contenga nombre, apellido, posición y número. Luego otra clase Equipo
     * que contenga una colección de jugadores. Una vez hecho esto, desde el
     * main recorreremos el equipo mostrando la información de cada jugador.
     */
    private String nombre;
    private String apellido;
    private String posicion;
    private int num;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, int num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.num = num;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", num=" + num + '}';
    }
    
    
    
}
