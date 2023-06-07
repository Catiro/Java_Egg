/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Clases.Operacion;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int numero1,numero2;
        String operador;
        Operacion oper = new Operacion();
        oper.crearOperacion();
        numero1 = oper.getNumero1();
        numero2 = oper.getNumero2();
        oper.setNumero1(numero1);
        oper.setNumero2(numero2);
        do{
        System.out.println("Elija la operacion que desea realizar");
        System.out.println("+ : Suma");
        System.out.println("- : Resta");
        System.out.println("* : Producto");
        System.out.println("/ : Multiplicación");
        operador = leer.nextLine();
        } while ( !"+".equals(operador) && !"-".equals(operador) && !"*".equals(operador) && !"/".equals(operador) );
    switch(operador){
        case "+":
            System.out.println("La suma de los numeros es: " + oper.sumar(numero1, numero2));
            break;
            case "-":
            System.out.println("La resta de los numeros es: " + oper.restar(numero1, numero2));
            break;
            case "*":
            System.out.println("La multiplicación de los numeros es: " + oper.multiplicar(numero1, numero2));
            break;
            case "/":
            System.out.println("La división de los numeros es: " + oper.dividir(numero1, numero2));
            break;
    }
    }
    
}
