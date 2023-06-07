/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author jrv11
 */
public class PaisesService {

    /**
     * Se requiere un programa que lea y guarde países, y para evitar que se
     * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
     * bucle, se guardará el país en el conjunto y después se le preguntará al
     * usuario si quiere guardar otro país o si quiere salir, si decide salir,
     * se mostrará todos los países guardados en el conjunto. (Recordemos hacer
     * los servicios en la clase correspondiente) Después deberemos mostrar el
     * conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un
     * conjunto. Por último, al usuario se le pedirá un país y se recorrerá el
     * conjunto con un Iterator, se buscará el país en el conjunto y si está en
     * el conjunto se eliminará el país que ingresó el usuario y se mostrará el
     * conjunto. Si el país no se encuentra en el conjunto se le informará al
     * usuario.
     *
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<String> pais = new HashSet();

    public void cargarPais() {
        String opc = "";
        do {
            System.out.println("Ingrese el pais que desea agregar");
            pais.add(leer.next());
            System.out.println("Desea ingresar otro pais?(S/N)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
        
    }
    
    public void mostrarPaises(){
        for (String aux : pais) {
            System.out.println(aux);
        }
    }
    
    public void ordenarPais(){
        Collections.sort(pais);
    }
    
    
    

}
