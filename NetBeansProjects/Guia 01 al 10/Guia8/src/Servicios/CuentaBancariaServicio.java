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
        CuentaBancaria cm = new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
       
        return cm;
    }
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cm){
        System.out.println("Ingrese la cantidad de dinero a ingresar");
        double ingresar = leer.nextDouble();
        cm.setSaldoActual(cm.getSaldoActual()+ingresar);
              
    }
    //Método retirar(double): recibe una cantidad de dinero a retirar y se le
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(CuentaBancaria cm){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retirar = leer.nextDouble();
        boolean verif = false;
        do{                 
        if (retirar < cm.getSaldoActual() && retirar > 0 && cm.getSaldoActual() != 0){
            cm.setSaldoActual(cm.getSaldoActual()-retirar);
            System.out.println("Retiro $ " + retirar + "\nSu saldo actual es de $" + cm.getSaldoActual());
            verif = false;
        } else {
            System.out.println("El saldo no es suficiente para el retiro. \nSe entraera el todal de la cuenta $" + cm.getSaldoActual());
            cm.setSaldoActual(0);
            break;
        }            
        
       } while (verif);      
    }
//    d) Método extraccionRapida
//    : le permitirá sacar solo un 20% de su saldo.Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cm){
       
        double retiro;
        boolean verif = false;
        String veri;
        do{
            System.out.println("Ingrese la cantidad de dinero que desea como dinero rapido\nRecorda que no puede superar el 20% de tu saldo actual");
            retiro = leer.nextDouble();
            if(retiro < cm.getSaldoActual()*0.2){
                
                cm.setSaldoActual(cm.getSaldoActual()-retiro);
                System.out.println("Ud retiro $" + retiro +"\nSu saldo actual es de $" + cm.getSaldoActual());  
                verif = true;
            }else{
                System.out.println("Lo que desas retirar es mayor al 20% de tu saldo\nDesea intentar de nuevo? (Y/N)");
                veri = leer.next();
                if (veri.equalsIgnoreCase("Y")){
                    verif = false;
                } else {
                    break;
                }
            }
            
        } while (verif);    
    
    }
    
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    
    public double consultarSaldo(CuentaBancaria cm){       
       
        return cm.getSaldoActual();            
                
    }
    
    
    public void consultarDatos(CuentaBancaria cm){  
       System.out.println("Los datos de la cuenta son:\nDNI: " + cm.getDniCliente() + "\nNumero de Cuenta: " + cm.getNumeroCuenta() + "\nSaldo de Cuenta: " + cm.getSaldoActual());
        
    }

}

