/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class PeliculaService {
    // TODO code application logic here
        /**En el servicio deberemos tener un bucle que crea un objeto Pelicula
         * pidiéndole al usuario todos sus datos y guardándolos en el objeto
         * Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se
         * le pregunta al usuario si quiere crear otra Pelicula o no.
         * 
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> cartelera = new ArrayList();



        public void carteleraCine(){
            String aux;
            do{
                Pelicula peli = new Pelicula();
                System.out.println("Ingrese el Título de la pelicula: ");
                peli.setTitulo(leer.next());
                System.out.println("Ingrese el director");
                peli.setDirector(leer.next());
                System.out.println("Ingresa la duración");
                peli.setHoras(leer.nextInt());
                System.out.println("¿Desea ingresar otra pelicula? (S/N)");
                aux = leer.next();
                cartelera.add(peli); 
            } while (aux.equalsIgnoreCase("n"));
        }
        
       //Mostrar en pantalla todas las películas.
        public void mostrarPelis(){
            for (Pelicula peli : cartelera) {
                System.out.println(peli.getTitulo());
            }            
        }
        
        //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        public void mostrarPelisMas1(){
            System.out.println("Las pelicuas con duración mayor a una horas es: ");
            for (Pelicula peli : cartelera) {
                if(peli.getHoras()>1){
                    System.out.println(peli.getTitulo());
                }
            }
        }
        
        /**Ordenar las películas de acuerdo a su duración (de mayor a menor) y
         * mostrarlo en pantalla. 
         */
        public void ordenaPeliculaAs(){            
            Collections.sort(cartelera,(Pelicula peli1,Pelicula peli2)->peli1.getHoras().compareTo(peli2.getHoras()));
            mostrarPelis();
                    
        }
        
        /**Ordenar las películas de acuerdo a su duración (de menor a mayor) y
         * mostrarlo en pantalla.
         * 
         */
        
        public void ordenarPeliculaDes(){
            Collections.reverse(ordenaPeliculasAS());
            mostrarPelis();
        }

        /**Ordenar las películas por título, alfabéticamente y mostrarlo en
         * pantalla.
         */

        public void ordenarPeliNom(){
            Collections.sort(cartelera,(Pelicula peli1,Pelicula peli2)->peli1.getHoras().compareTo(peli2.getHoras()));
        }

        /**Ordenar las películas por director, alfabéticamente y mostrarlo en
         * pantalla.
         */

        public void ordenarPeliculaDir(){
            Collections.sort(cartelera,(Pelicula peli1,Pelicula peli2)->peli1.getDirector().compareTo(peli2.getDirector()));
            mostrarPelis();
        }
        
                
}
