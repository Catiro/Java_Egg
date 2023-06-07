/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.teo;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Guia1102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**EJERCICIO JUGADOR Realiza un programa en donde exista una clase
         * Jugador que contenga nombre, apellido, posición y número. Luego otra
         * clase Equipo que contenga una colección de jugadores. Una vez hecho
         * esto, desde el main recorreremos el equipo mostrando la información
         * de cada jugador.
         */
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Equipo e1 = new Equipo();

        String confir;

        do {
            Jugador j1 = new Jugador();
            System.out.println("Ingrese el nombre, apellido, posicion y numero del jugador.");
            j1.setNombre(leer.next());
            j1.setApellido(leer.next());
            j1.setPosicion(leer.next());
            j1.setNum(leer.nextInt());

            System.out.println("Desea cargar otro jugador? S/N");
            confir = leer.next();
            e1.getJugadores().add(j1);
        } while (confir.equalsIgnoreCase("s"));

        for (Jugador jugador : e1.getJugadores()) {
            System.out.println(jugador.toString());
        }
        
    }
    
}
