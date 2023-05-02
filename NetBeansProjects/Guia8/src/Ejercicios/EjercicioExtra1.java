/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import Clases.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Vamos a realizar una clase llamada Raices, donde representaremos los
         * valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
         * como atributos, llamémosles a, b y c. Hay que insertar estos 3
         * valores para construir el objeto a través de un método constructor.
         * Luego, en RaicesServicio las operaciones que se podrán realizar son
         * las siguientes: 
         */
        Scanner leer = new Scanner(System.in);
        RaicesServicio rS = new RaicesServicio();
        System.out.println("Ingrese el valor de a, b, c");
        int a, b, c;
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        Raices raiz = new Raices(a,b,c);
        
        rS.calcular(raiz);
        
        
    }
    
}
