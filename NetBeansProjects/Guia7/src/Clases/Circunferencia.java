/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Circunferencia {
    /**Declarar una clase llamada Circunferencia que tenga como atributo privado
     * el radio de tipo real. A continuación, se deben crear los siguientes
     * métodos: Método constructor que inicialice el radio pasado como
     * parámetro. Métodos get y set para el atributo radio de la clase
     * Circunferencia. Método para crearCircunferencia(): que le pide el radio y
     * lo guarda en el atributo del objeto. Método area(): para calcular el área
     * de la circunferencia (Area=〖π*radio〗^2). Método perimetro(): para
     * calcular el perímetro (Perimetro=2*π*radio).
     */
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }   
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la Circunferencia: ");
        this.radio = leer.nextDouble();
        
    }
    
    public double area(double radio){
        double area;
        area =(3.14 * radio)*(3.14 * radio);
        return area;
    }
    public double perimetro(double radio){
        double perimetro;
        perimetro =2*(3.14 * radio);
        return perimetro;
    }
    
}
