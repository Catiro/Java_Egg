/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Persona m1 = new Persona("Jose", 33138572, 35);
        System.out.println(m1.getNombre() + " / " + m1.getDNI() + " / " + m1.getEdad() + " ");
        System.out.println("---------------");
        System.out.println(m1);
        
    }
    
}
