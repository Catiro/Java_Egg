/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main02;

import entidad02.Lavadora;
import entidad02.Televisor;

/**
 *
 * @author jrv11
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Lavadora lava = new Lavadora();
        Televisor tv1 = new Televisor();
        lava.crearLavadora();
        System.out.println(lava.toString());
        tv1.crearTelevisor();
        System.out.println(tv1.toString());

    }
}
