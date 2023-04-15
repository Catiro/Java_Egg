/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jrv11
 */
public class CuentaBancaria {
    /**
     * . Realizar una clase llamada CuentaBancaria en el paquete Entidades con
     * los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
     * saldoActual. Agregar constructor vacío, con parámetros, getters y
     * setters.
     */
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;

    public CuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    

}
