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
public class Empleado {
    /**
     * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
     * "salario". Luego, crea un método "calcular_aumento" que calcule el
     * aumento salarial de un empleado en función de su edad y salario actual.
     * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años
     * o del 5% si tiene menos de 30 años.
     */
    private String nombre; 
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularAumento(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del empleado");
        setEdad(leer.nextInt());
        System.out.println("Ingrese el Salario del empleado");
        setSalario(leer.nextDouble());
        double aumento;
        if (getEdad()>30){
            aumento = (getSalario()*0.1)+getSalario() ;
            System.out.println("El aumento para " + getNombre() + " es de 10%\nSu proximo salario sera de: $" + aumento);
        }else {
            aumento = (getSalario()*0.05)+getSalario() ;
            System.out.println("El aumento para " + getNombre() + " es de 5%\nSu proximo salario sera de: $" + aumento);
        }
    }
    
}
