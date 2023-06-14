/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad2;

/**
 *
 * @author jrv11
 */
public class Revolver {
    private int posicionActual; // del tambor que dispara
    private int posicionAgua; // del la posicion que tiene agua

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    /*llenarRevolver(): le pone los valores de posición actual y de posición
     * del agua. Los valores deben ser aleatorios.
     */
    public void llenarRevolver(){
       posicionActual = (int) (Math.random()*6);
       posicionAgua = (int) (Math.random()*6);
    }
    /**mojar(): devuelve true si la posición del agua coincide con la posición
     * actual
     * @return 
     */
    public boolean mojar(){    
        return this.getPosicionAgua()==this.getPosicionActual();
    }
    
    /**siguienteChorro(): cambia a la siguiente posición del tambor
     */
     public void siguienteChorro(){
         if(this.posicionActual > 5){
             this.posicionActual = 1;
         } else {
             this.posicionActual+=1;
         }
     }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
     
}
