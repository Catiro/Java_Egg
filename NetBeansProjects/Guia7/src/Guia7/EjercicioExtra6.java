/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Clases.Rectangulo2;

/**
 *
 * @author jrv11
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
         * un método "calcular_area" que calcule y devuelva el área del
         * rectángulo. Luego crea un objeto "rectangulo1" de la clase
         * "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo. 
         */
        Rectangulo2 rect = new Rectangulo2(4,6);
        
        System.out.println("El area del rectangulo es: " + rect.calcularArea());
    }
    
}
