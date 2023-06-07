/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad3;

/**
 *
 * @author jrv11
 */
public class Carta {
    /**
     * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y
     * un palo (espadas, bastos, oros y copas). Esta clase debe contener un
     * método toString() que retorne el número de carta y el palo.
     */
    private int num;
    private String palo;

    public Carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Carta() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }
    
}
