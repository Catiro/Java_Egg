/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Clases.Raices;

/**
 *
 * @author jrv11
 */
public class RaicesServicio {
    /**Método getDiscriminante(): devuelve el valor del discriminante (double).
     * El discriminante tiene la siguiente fórmula: (b^2)-4*a*c 
     */
    
    public double getDescriminante(Raices raiz){
        //(b ^ 2) - 4 * a * c 
        return  (Math.pow(raiz.getB(),2)) - (4*raiz.getA()*raiz.getC() );
    }
    
    /**Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     */
    public boolean tieneRaices(Raices raiz){        
        return getDescriminante(raiz) > 0;                
    }
    
    /**Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices raiz){        
        return getDescriminante(raiz) == 0;                
    }
    
    /**Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
     * imprime las 2 posibles soluciones.
     */
    
    public void obtenerRaices(Raices raiz){
        double r1, r2;
        r1 = (-raiz.getB() + Math.sqrt(getDescriminante(raiz))) / (2 * raiz.getA());
        r2 = (-raiz.getB() - Math.sqrt(getDescriminante(raiz))) / (2 * raiz.getA());
        System.out.println("Las soluciones son: \nr1 = " + r1 + "\nr2 = " + r2);
        
    }
    /**Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     */
    
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)){
            System.out.println("La solucion es = " + (-raiz.getB() / (2 * raiz.getA())));
        }
    }
    /**Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
     * y mostrará por pantalla las posibles soluciones que tiene nuestra
     * ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que
     * devuelvan nuestros métodos y en caso de no existir solución, se mostrará
     * un mensaje.

     */
    
    public void calcular(Raices raiz){

        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);

        } else {
            System.out.println("no tiene solucion");

        }
        
    }
    
}
