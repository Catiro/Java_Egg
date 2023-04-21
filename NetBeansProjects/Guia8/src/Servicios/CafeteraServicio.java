/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Cafetera;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    private Cafetera c2;
    
    // a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(int actual, int capacidad){
        c2.setCantidadActual(c2.getCapacidadMáxima());
        
    }
    /**Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     */
    
    public void servirTaza(int tamanoTaza){
        
        if(c2.getCantidadActual()<tamanoTaza){
             System.out.println("No se pudo llenar la taza completamente, quedó con " + c2.getCantidadActual() + " ml de café.");
             c2.setCantidadActual(0);
        }else{
            System.out.println("Se lleno la taza");
            c2.setCantidadActual(c2.getCantidadActual() - tamanoTaza);
        }       
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 

     public void vaciarCafetera(){
         c2.setCantidadActual(0);
     }
     
     /**Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     */
     
     public void agregarCafe(int sumarCafe){
         if (c2.getCantidadActual() + sumarCafe > c2.getCapacidadMáxima()){
             System.out.println("NO se puede ingresar la cantidad de cafe debido a que supera la capacidad");  
         } else{
             System.out.println("Se agrego la cantidad de cafe correspondiente");
             c2.setCantidadActual(sumarCafe + c2.getCantidadActual());
         }
     }
     
}// end
