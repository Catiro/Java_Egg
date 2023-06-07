/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        ArrayList<Jugador> jugadores2 = new ArrayList();
        System.out.println("Ingerese la cantidad de jugadores");
        int cantJugadores = leer.nextInt();
        while (cantJugadores > 6 || cantJugadores < 0) {
            System.out.println("La cantidad de jugadores debe ser entre 1 y 6.\nIngrese nuevamente la cantidad");
            cantJugadores = leer.nextInt();
        }
        for (int i = 0; i < cantJugadores; i++) {
            
            Jugador player = new Jugador();
            System.out.println("Ingresa el nombre del Jugador " + (i+1));
            player.setId(i);
            player.setNombre(leer.next());
            player.setMojado(null);
            jugadores2.add(player);
        }
        this.jugadores = jugadores2;
        this.revolver = new Revolver();
        revolver.llenarRevolver();

    }

    public void ronda() {

        String jugadorMojado = null;
        for (Jugador j : jugadores) {
            j.disparo(revolver);
            if (j.getMojado()) {
                jugadorMojado = j.getNombre();
                break;
            }
        }

        System.out.println("SE ACABO EL JUEGO");
        System.out.println("El jugador mojado es: " + jugadorMojado);
    }

}
