/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in);
    
    //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuentaBancaria(){
        
        System.out.println("Ingrese el numero de cuenta"); 
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el numero de DNI del cliente"); 
        int dniCliente = leer.nextInt();
        System.out.println("Ingrese el Saldo actual"); 
        int saldoActual = leer.nextInt();
        CuentaBancaria cm = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
       
        return cm;
    }
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cm){
        System.out.println("Ingrese la cantidad de dinero a ingresar");
        double ingresar = leer.nextDouble();
        cm.setSaldoActual(cm.getSaldoActual()+ingresar);
      
    }
}
