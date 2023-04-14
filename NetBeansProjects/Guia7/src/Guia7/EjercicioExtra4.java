/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Clases.Cuenta;

/**
 *
 * @author jrv11
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
         * Luego, crea un método "retirar_dinero" que permita retirar una
         * cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo
         * nunca sea negativo después de realizar una transacción de retiro.
         */
        Cuenta cta = new Cuenta();
        cta.setSaldo(5000);
        cta.setTitular("Jose Vargas");
        cta.retirarDinero();
        System.out.println("Su saldo restante es de " + cta.getSaldo());
    }
    
}
