/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author jrv11
 */
public class Cadena {
    /**Realizar una clase llamada Cadena, en el paquete de entidades, que tenga
     * como atributos una frase (String) y su longitud. Agregar constructor
     * vacío y con atributo frase solamente. Agregar getters y setters. El
     * constructor con frase como atributo debe setear la longitud de la frase
     * de manera automática. Crear una clase CadenaServicio en el paquete
     * servicios que implemente los siguientes métodos:
     * 
     */
    private String frase;
    private int longitud;

    

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public Cadena() {
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
