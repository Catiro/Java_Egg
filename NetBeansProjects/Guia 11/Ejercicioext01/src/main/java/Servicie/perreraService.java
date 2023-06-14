/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicie;

import Endidad1.Perro;
import Endidad1.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class perreraService {

    /**
     * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
     * Nuestro programa va a tener que contar con muchas personas y muchos
     * perros. El programa deberá preguntarle a cada persona, que perro según su
     * nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si
     * la persona eligió un perro que ya estaba adoptado, se le debe informar a
     * la persona. Una vez que la Persona elige el Perro se le asigna, al final
     * deberemos mostrar todas las personas con sus respectivos perros.
     */

    private ArrayList<Persona> adoptantes;
    private ArrayList<Perro> adoptados;
    private HashMap<String, Perro> listaAdoptados;
    private Persona adopt1;
    private Perro perri1;
    private Scanner leer = new Scanner(System.in);    

    public perreraService(){
        this.adoptantes = new ArrayList<>();
        this.adoptados = new ArrayList<>();
        this.adopt1 = new Persona();
        this.perri1 = new Perro();
        this.listaAdoptados = new HashMap<>();
    }

    public void cargarPersonasYPerros() {
        String confir1 = "";
        String confir2 = "";
        System.out.println("Cargar personas a la lista de adoptantes");
        System.out.println(" ");
        do {
            Persona persona = new Persona();
            System.out.println(" Ingrese nombre de la persona:");
            persona.setNombrePersona(leer.next());
            System.out.println(" Ingrese apellido de la persona:");
            persona.setApellidoPersona(leer.next());
            System.out.println(" Ingrese la edad de la persona:");
            persona.setEdadPersona(leer.nextInt());
            System.out.println(" Ingrese el DNI de la persona:");
            persona.setDniPersona(leer.nextInt());

            adoptantes.add(persona);

            System.out.println("Desea cargar otra persona? S/N ");
            confir1 = leer.next();
        } while (confir1.equalsIgnoreCase("s"));

        System.out.println(" ");
        System.out.println("Cargar perros a la lista para adoptar.");
        System.out.println(" ");

        do {
            Perro perri1 = new Perro();
            System.out.println("Ingrese el nombre del perro.");
            perri1.setNombrePerro(leer.next());
            System.out.println("Ingrese la raza del perro.");
            perri1.setRazaPerro(leer.next());
            System.out.println("Ingrese la edad del perro.");
            perri1.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro.");
            perri1.setTamañoPerro(leer.next());

            adoptados.add(perri1);
            System.out.println("Desea cargar otro perro? S/N ");
            confir2 = leer.next();
        } while (confir2.equalsIgnoreCase("s"));
    }

    public void adopcionPerros() {
        do {
            String buscarPerro = "";
            boolean perroNo = true;

            System.out.println(adoptantes.get(0).getNombrePersona() + " Ingrese el nombre del perro a adoptar: ");
            buscarPerro = leer.next();

            for (int i = 0; i < adoptados.size(); i++) {
                if (adoptados.get(i).getNombrePerro().equalsIgnoreCase(buscarPerro)) {
                    System.out.println("El perro fue adoptado exitosamente!! ");
                    listaAdoptados.put(adoptantes.get(0).getNombrePersona(), adoptados.get(i));
                    adoptantes.remove(adoptantes.get(0));
                    adoptados.remove(adoptados.get(i));
                    perroNo = false;
                    break;
                }
            }
            if (perroNo) {
                System.out.println("El perro ya se adopto o no esta en la lista :c ");
            }
        } while (!adoptantes.isEmpty() || !adoptados.isEmpty());

    }

    public void mostrarPersonas() {
        for (Map.Entry<String, Perro> entry : listaAdoptados.entrySet()) {
            String key = entry.getKey();
            Perro value = entry.getValue();
            System.out.println("La persona: " + key
                    + " Adopto al perro: " + value.getNombrePerro() + " de raza:" + " " + value.getRazaPerro());
        }

    }
}
