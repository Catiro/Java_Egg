/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main02;

import Entidad2.Juego;
import Entidad2.Jugador;
import Entidad2.Revolver;
import java.util.ArrayList;

/**
 *
 * @author jrv11
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        /**Nos piden hacer un programa sobre un Cine, que tiene una sala con un
         * conjunto de asientos (8 filas por 6 columnas). De Cine nos interesa
         * conocer la película que se está reproduciendo, la sala con los
         * espectadores y el precio de la entrada. Luego, de las películas nos
         * interesa saber el título, duración, edad mínima y director. Por
         * último, del
         * 
         */
        
       Juego play = new Juego();
       Revolver r = new Revolver();
       
       play.llenarJuego();
       play.ronda();
    }
}
