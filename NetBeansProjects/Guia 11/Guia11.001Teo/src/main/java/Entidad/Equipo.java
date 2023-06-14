/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrv11
 */
public class Equipo {
    
    /**EJERCICIO JUGADOR Realiza un programa en donde exista una clase Jugador
     * que contenga nombre, apellido, posición y número. Luego otra clase Equipo
     * que contenga una colección de jugadores. Una vez hecho esto, desde el
     * main recorreremos el equipo mostrando la información de cada jugador.
     */
    
    private List<Jugador> jugadores;

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    

    public Equipo() {
        this.jugadores = new ArrayList();
    }
    
    
    
}
