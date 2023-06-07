/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado game = new Ahorcado();

    /**
     * * Metodo crearJuego(): le pide la palabra al usuario y cantidad de
     * jugadas máxima.Con la palabra del usuario, pone la longitud de la
     * palabra, como la longitud del vector.Después ingresa la palabra en el
 vector, letra por letra, quedando cada letra de la palabra en un índice
 del vector. Y también, guarda la cantidad de jugadas máximas y el valor
 que ingresó el usuario
     *
     */
    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = leer.next();

        System.out.println("Ingrese la cantidad de oportunidades");
        game.setIntentos(leer.nextInt());
        String[] palabraV = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraV[i] = palabra.substring(i, i + 1);
        }
        game.setPalabra(palabraV);
        game.setEncontradas(0);
    }

    /**
     * * Método longitud(): muestra la longitud de la palabra que se debe
     * encontrar.Nota: buscar como se usa el vector.length.
     *
     */
    public void longitud() {
        System.out.println("Longitud de la palabra es: " + game.getPalabra().length);
    }

    /**
     * * Método buscar(letra): este método recibe una letra dada por el usuario
     * y busca si la letra ingresada es parte de la palabra o no.También
     * informará si la letra estaba o no.
     *
     * @param letra
     */
    public void buscar(String letra) {
        int j = 0;
        for (int i = 0; i < game.getPalabra().length; i++) {
            if (letra.equals(game.getPalabra()[i])) {
                j++;
            }
        }
        if (j > 0) {
            System.out.println("La letra se encuentra en la palabra");

        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }
    }

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradasEste método además deberá
     * devolver true si la letra estaba y false si la letra no estaba, ya que,
     * cada vez que se busque una letra que no esté, se le restará uno a sus
     * oportunidades.
     *
     * @param letra
     */
    public void encontradas(String letra) {
        boolean aux = false;
        int j = 0;
        for (int i = 0; i < game.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(game.getPalabra()[i])) {
                j++;
                aux = true;
            }
        }
        if (aux) {
            game.setEncontradas(game.getEncontradas() + j);

        } else {

            game.setIntentos(game.getIntentos() - 1);
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + game.getEncontradas() + ", " + (game.getPalabra().length - game.getEncontradas()) + ")");

    }

    /**
     * Método intentos(): para mostrar cuántas oportunidades le queda al
     * jugador.
     */
    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + game.getIntentos());
    }

    /**
     * * Método juego(): el método juego se encargará de llamar todos los
     * métodos previamente mencionados e informará cuando el usuario descubra
     * toda la palabra o se quede sin intentos.Este método se llamará en el
     * main.
     */
    public void juego() {
        crearJuego();

        String letra;
        while (game.getIntentos() > 0 && game.getEncontradas()!=game.getPalabra().length) {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            longitud();
            buscar(letra);
            encontradas(letra);
            intentos();
            System.out.println("-----------------------------------");
        }
        if (game.getIntentos()>0){
            System.out.println("Felicidades!!! encontro la plabra");
        }else{
            System.out.println("Game Over :(");
        }

    }
    /**
     * Ingrese una letra: a Longitud de la palabra: 6 Mensaje: La letra
     * pertenece a la palabra Número de letras (encontradas, faltantes): (3,4)
     * Número de oportunidades restantes: 4
     *
     *
     */

}
