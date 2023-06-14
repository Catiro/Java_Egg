/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad2;

/**
 *
 * @author jrv11
 */
public class Jugador {
    private int id;
    private String nombre;
    private Boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(Revolver revolver){
        this.mojado = revolver.mojar();
        revolver.siguienteChorro();
    }
}
