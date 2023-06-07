/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Clases.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int base, altura;
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        base = r1.getAltura();
        altura = r1.getBase();
        r1.setAltura(altura);
        r1.setBase(base);
        System.out.println("La superficie del rectangulo es: " + r1.superficie(base, altura));
        System.out.println("El perimetro del rectangulo es: " + r1.perimetro(base, altura));
        r1.dibujar(base, altura);
    }
    
}
