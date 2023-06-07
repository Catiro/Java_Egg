/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import Endidad1.Perro;
import Endidad1.Persona;
import java.util.ArrayList;

/**
 *
 * @author jrv11
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        /**Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
         * Nuestro programa va a tener que contar con muchas personas y muchos
         * perros. El programa deberá preguntarle a cada persona, que perro
         * según su nombre, quiere adoptar. Dos personas no pueden adoptar al
         * mismo perro, si la persona eligió un perro que ya estaba adoptado, se
         * le debe informar a la persona. Una vez que la Persona elige el Perro
         * se le asigna, al final deberemos mostrar todas las personas con sus
         * respectivos perros.
         */
         ArrayList<Persona> adoptantes = new ArrayList<>();

        Persona adoptante1 = new Persona("Elias", "Barreto", 25, 40597490, null);
        Persona adoptante2 = new Persona("Gonzalo", "Pizarro", 35, 37286893, null);

        Perro perrito1 = new Perro("Lassie", "Collie", 3, "grande");
        Perro perrito2 = new Perro("Hachie", "Hakita", 6, "mediano");

        adoptante1.setPerroAdoptado(perrito2);
        adoptante2.setPerroAdoptado(perrito1);
        
        adoptantes.add(adoptante1);
        adoptantes.add(adoptante2);
      
        
        for (Persona adopcion : adoptantes)
        {
            System.out.println(  adopcion.toString());
            
        }
        
    }
}
