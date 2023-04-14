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
public class Cuenta {
    /**
     * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
     * Luego, crea un método "retirar_dinero" que permita retirar una cantidad
     * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
     * negativo después de realizar una transacción de retiro.
     */
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        double retiro = leer.nextDouble();
        while (retiro > getSaldo()){
            System.out.println("No posee saldo suficiente para realizar este retiro.\nSu saldo actual es: " + getSaldo() + "\nIngrese cuanto dinero desea retirar");
            retiro = leer.nextDouble();
        }
        setSaldo(getSaldo()- retiro);       
    }

    
}
