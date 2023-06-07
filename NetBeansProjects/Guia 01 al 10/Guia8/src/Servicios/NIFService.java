/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.NIF;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */

public class NIFService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

//Metodo b)
    public NIF crearNif() {
        NIF datos = new NIF();      
        
        System.out.println("Ingrese numero de DNI con 8 digitos: ");
        String dniS = leer.next();

        while (dniS.length()!= 8) {
            System.out.println("El dni no cumple con los requisitos.");
            datos.setDni(leer.nextLong());
            dniS = leer.next();
            // FALTA TERMINAR DE REFINIR
        }
       // datos.setDn();

        return datos;
    }

    public char vector(NIF datos) {

        return letras[(int) datos.getDni() % 23];
    }

    public void mostrar(NIF datos) {       
        
        System.out.println(datos.getDni()+ "-"+vector(datos));
        
    }
    
}

