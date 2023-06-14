/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad3;

import java.util.ArrayList;

/**
 *
 * @author jrv11
 */
public class Baraja {
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monto;

    public Baraja(ArrayList<Carta> baraja, ArrayList<Carta> monto) {
        System.out.println("Se creo el mazo y el monton.");
        this.baraja = baraja;
        this.monto = monto;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getMonto() {
        return monto;
    }

    public void setMonto(ArrayList<Carta> monto) {
        this.monto = monto;
    }
    
    
    
}
