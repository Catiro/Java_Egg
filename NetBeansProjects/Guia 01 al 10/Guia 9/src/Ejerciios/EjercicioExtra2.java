/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciios;

import Servicio.AhorcadoService;

/**
 *
 * @author jrv11
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
         * deberá contener como atributos, un vector con la palabra a buscar, la
         * cantidad de letras encontradas y la cantidad jugadas máximas que
         * puede realizar el usuario. Definir los siguientes métodos en
         * AhorcadoService:
         */
        AhorcadoService juego = new AhorcadoService();
        juego.juego();
    }
    
}
