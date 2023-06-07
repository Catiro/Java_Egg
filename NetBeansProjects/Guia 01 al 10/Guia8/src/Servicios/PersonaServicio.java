/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class PersonaServicio {

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Escriba el nombre de la persona");
        String Nombre = leer.nextLine();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        System.out.println("Sexo(H - M - O):");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
            System.out.println("Opcción no valida.\nIngrese nuevamente el Sexo");
            sexo = leer.next();
        }
        System.out.println("Peso:");
        double peso = leer.nextDouble();
        System.out.println("Altura:");
        double altura = leer.nextDouble();
        return new Persona(Nombre, edad, sexo, peso, altura);
    }
    
    /**Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano. 
     */
    public boolean esMayorDeEdad(Persona p1){
        boolean mayorEdad = true;
        if (p1.getEdad()<18){
            mayorEdad = false;
        }  
//        System.out.println(mayorEdad);
        return mayorEdad;        
    }
    /**Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     */
    public int calcularIMC(Persona p1){
        double IMC = (double) (p1.getPeso()/(p1.getAltura()*p1.getAltura()));
        int num;
        if (IMC < 20){
            num = -1;
        } else if (IMC >=20 && IMC <=25) {
            num = 0;
        } else {
            num = 1;
        }
//        System.out.println(IMC + " //// " + num);
        return num;
    }

}
