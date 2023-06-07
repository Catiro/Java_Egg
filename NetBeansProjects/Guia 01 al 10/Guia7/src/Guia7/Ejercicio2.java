/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Clases.Circunferencia;

/**
 *
 * @author jrv11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Declarar una clase llamada Circunferencia que tenga como atributo
         * privado el radio de tipo real. A continuación, se deben crear los
         * siguientes métodos: Método constructor que inicialice el radio pasado
         * como parámetro. 
         * Métodos get y set para el atributo radio de la clase Circunferencia. 
         * Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
         * Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2). 
         * Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
         */
        double radio;
        Circunferencia circulo1 = new Circunferencia(0);
        circulo1.crearCircunferencia();
        radio = circulo1.getRadio();        
        circulo1.setRadio(radio);        
        circulo1.area(radio);
        circulo1.perimetro(radio);
        System.out.println("El area de la circunferencia es: " + circulo1.area(radio));
        System.out.println("El el perimetro de la circunferencia es: " + circulo1.perimetro(radio));
        
        
    }

}
