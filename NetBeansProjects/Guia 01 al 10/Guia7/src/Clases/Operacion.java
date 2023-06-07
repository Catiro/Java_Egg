/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Operacion {

    /**
     * Crear una clase llamada Operacion que tenga como atributos privados
     * numero1 y numero2.
     */
    private int numero1;
    private int numero2;

    /**
     * A continuación, se deben crear los siguientes métodos: Método constructor
     * con todos los atributos pasados por parámetro.
     */
    public Operacion() {
    }

//    public Operacion(int numero1, int numero2) {
//        this.numero1 = numero1;
//        this.numero2 = numero2;
//    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * Método para crearOperacion(): que le pide al usuario los dos números y
     * los guarda en los atributos del objeto.
     */
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese el Segundo numero");
        this.numero2 = leer.nextInt();

    }

    /**
     * Método sumar(): calcular la suma de los números y devolver el resultado
     * al main.
     *
     * @param numero1
     * @param numero2
     * @return suma
     */
    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    /**
     * Método restar(): calcular la resta de los números y devolver el resultado
     * al main
     *
     * @param numero1
     * @param numero2
     * @return resta
     */
    public int restar(int numero1, int numero2) {
        int resta = this.numero1 - this.numero2;
        return resta;
    }

    /**
     * Método multiplicar(): primero valida que no se haga una multiplicación
     * por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
     * informa al usuario el error. Si no, se hace la multiplicación y se
     * devuelve el resultado al main
     *
     * @param numero1
     * @param numero2
     * @return producto
     */
    public int multiplicar(int numero1, int numero2) {
        int producto;
        if (numero1 == 0 || numero2 == 0) {

            producto = 0;

            System.out.println("Al menos uno de los numeros ingresado es 0");
        } else {
            producto = numero1 * numero2;
        }
        return producto;
    }

    /**
     * Método dividir(): primero valida que no se haga una división por cero, si
     * fuera a pasar una división por cero, el método devuelve 0 y se le informa
     * al usuario el error se le informa al usuario. Si no, se hace la división
     * y se devuelve el resultado al main.
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public double dividir(int numero1, int numero2) {
        double dividir;
        if (numero2 == 0) {

            dividir = 0;

            System.out.println("La operación no se puede realizar ya que el divisor es 0");

        } else {
            dividir = numero1 / numero2;
        }
        return dividir;
    }
}
