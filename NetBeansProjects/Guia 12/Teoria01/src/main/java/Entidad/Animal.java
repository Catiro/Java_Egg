/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jrv11
 */
public class Animal {
    protected String ruido;

    public Animal() {
    }

    public Animal(String ruido) {
        this.ruido = ruido;
    }
    
    public void hacerRuido(){
        System.out.println("Hola");
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }
    
}
