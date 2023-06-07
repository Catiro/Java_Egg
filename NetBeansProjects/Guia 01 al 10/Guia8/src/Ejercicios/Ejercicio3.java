/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import Clases.Persona;
import Servicios.PersonaServicio;

/**
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los
 * siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer,
 * ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede
 * hacerlo. Agregar constructores, getters y setters. En el paquete Servicios
 * crear PersonaServicio con los siguientes 3 métodos: Método esMayorDeEdad():
 * indica si la persona es mayor de edad. La función devuelve un booleano.
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad. Por último, guardaremos los resultados de los
 * métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para
 * después calcular un porcentaje de esas 4 personas cuantas están por debajo de
 * su peso, cuantas en su peso ideal y cuantos, por encima, y también
 * calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 * Para esto, podemos crear unos métodos adicionales.
 *
 *
 * @author jrv11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio perS = new PersonaServicio();
        int[] IMC = new int[4];
        boolean[] mayoredad = new boolean[4];

        Persona per1 = perS.crearPersona();
        IMC[0] = perS.calcularIMC(per1);
        mayoredad[0] = perS.esMayorDeEdad(per1);
        System.out.println("****************************");
        Persona per2 = perS.crearPersona();
        IMC[1] = perS.calcularIMC(per2);
        mayoredad[1] = perS.esMayorDeEdad(per2);
        System.out.println("****************************");
        Persona per3 = perS.crearPersona();
        IMC[2] = perS.calcularIMC(per3);
        mayoredad[2] = perS.esMayorDeEdad(per3);
        System.out.println("****************************");
        Persona per4 = perS.crearPersona();
        IMC[3] = perS.calcularIMC(per4);
        mayoredad[3] = perS.esMayorDeEdad(per4);

        pesoIdeal(IMC);
        mayor(mayoredad);

    }

    public static void pesoIdeal(int IMC[]) {
        int sobr = 0;
        int id = 0;
        int bajo = 0;
        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case 1:
                    sobr++;
                    break;
                case 0:
                    id++;
                    break;
                default:
                    bajo++;
                    break;
            }
        }
        System.out.println("Las personas con sobre peso son: " + sobr);
        System.out.println("Las personas con peso ideal son: " + id);
        System.out.println("Las personas con peso bajo son: " + bajo);

    }

    public static void mayor(boolean mayoredad[]) {
        int may = 0;
        int men = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(mayoredad[i]);
            if (mayoredad[i] == true) {
                may++;
                System.out.println(may);
            }else {
                men++;
                System.out.println(men);
                }
        }
        double pmay = may / 4 * 100;
        double pmen = men / 4 * 100;
        System.out.println("El porcentaje de personas mayores de edad es: %" + pmay);
        System.out.println("El porcentaje de personas menores de edad es: %" + pmen);
    }

}
