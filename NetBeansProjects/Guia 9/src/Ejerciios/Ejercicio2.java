/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciios;


import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosService;

/**
 *
 * @author jrv11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParDeNumerosService numeros = new ParDeNumerosService();
        ParDeNumeros nums = new ParDeNumeros();
        numeros.mostrarValores(nums);
        numeros.devolverMayor(nums);
        numeros.calcularPotencia(nums);
        numeros.calculaRaiz(nums);
        
    }
    
}
