/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciios;

import Entidades.Cadena;
import Servicio.CadenaService;

/**
 *
 * @author jrv11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Realizar una clase llamada Cadena, en el paquete de entidades, que
         * tenga como atributos una frase (String) y su longitud. Agregar
         * constructor vacío y con atributo frase solamente. Agregar getters y
         * setters. El constructor con frase como atributo debe setear la
         * longitud de la frase de manera automática. Crear una clase
         * CadenaServicio en el paquete servicios que implemente los siguientes
         * métodos:
         */
       
        CadenaService cadenaService = new CadenaService();
        Cadena cadena = cadenaService.crearCadena();
        cadenaService.mostrarVocales(cadena);
        cadenaService.invertirFrase(cadena);        
        cadenaService.vecesRepetido(cadena);
        cadenaService.compararLongitud(cadena);
        cadenaService.unirFrases(cadena);
        cadenaService.reemplazar(cadena);
        
    }
    
}
