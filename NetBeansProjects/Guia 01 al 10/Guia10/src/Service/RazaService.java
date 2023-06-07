/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class RazaService {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     *
     */
    ArrayList<Raza> razas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarRazas() {
        String opc;
        do {
            Raza raza = new Raza();
            System.out.println("Ingrese la raza: ");
            raza.setRaza(leer.next());
            razas.add(raza);
            System.out.println("Desea ingresar otra raza? (S/N)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
    }

    public void mostrarRazas() {
        for (Raza aux : razas) {
            System.out.println(aux.toString());
        }
    }

    /**
     * Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     */
    public void buscarPerro() {
        Iterator<Raza> it = razas.iterator();
        System.out.println("Ingrese el perro que desea eliminar");
        String aux = leer.next();
        boolean aux2 = true;
        while (it.hasNext()) {
            if (it.next().getRaza().equalsIgnoreCase(aux)) {
                it.remove();
                System.out.println("La raza se borro");
                aux2 = false;
                break;
            }
        }
        if (aux2) {

            System.out.println("No se encontro raza");

        }
        ordenarRaza();

    }
    
    public void ordenarRaza(){
        Collections.sort(razas,(Raza aux1,Raza aux2)->aux1.getRaza().compareTo(aux2.getRaza()));
        System.out.println(razas.toString());
    }

}
