/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jrv11
 */
public class Cafetera {
    private double capacidadMáxima;
    private double cantidadActual;

    public Cafetera(double capacidadMáxima, double cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMáxima(double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
}
