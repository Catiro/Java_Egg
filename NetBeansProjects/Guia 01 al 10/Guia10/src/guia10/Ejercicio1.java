/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10;

import Service.RazaService;

/**
 *
 * @author jrv11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Diseñar un programa que lea y guarde razas de perros en un ArrayList
         * de tipo String. El programa pedirá una raza de perro en un bucle, el
         * mismo se guardará en la lista y después se le preguntará al usuario
         * si quiere guardar otro perro o si quiere salir. Si decide salir, se
         * mostrará todos los perros guardados en el ArrayList. 
         */
        
        RazaService razaServ = new RazaService();
        
        razaServ.agregarRazas();
        razaServ.mostrarRazas();
        razaServ.buscarPerro();
        
    }
    
}
