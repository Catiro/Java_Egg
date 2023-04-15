/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Clases.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author jrv11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaServicio sv = new CuentaBancariaServicio();
        CuentaBancaria cm = sv.crearCuentaBancaria();
    }
    
}
