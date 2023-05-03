/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.ParDeNumeros;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author jrv11
 */
public class ParDeNumerosService {

    /**
     * Método mostrarValores que muestra cuáles son los dos números guardados.
     */
    public void mostrarValores(ParDeNumeros nums) {
        System.out.println(nums.toString());
    }

    /**
     * Método devolverMayor para retornar cuál de los dos atributos tiene el
     * mayor valor
     */
    public void devolverMayor(ParDeNumeros nums) {
        if (nums.getNum1() > nums.getNum2()) {
            System.out.println("El numero mayor es: " + nums.getNum1());
        } else if (nums.getNum1() < nums.getNum2()) {
            System.out.println("El numero mayor es: " + nums.getNum2());
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    /**
     * Método calcularPotencia para calcular la potencia del mayor valor de la
     * clase elevado al menor número. Previamente se deben redondear ambos
     * valores.
     */
    public void calcularPotencia(ParDeNumeros nums) {
        double num1 = Math.round(nums.getNum1());
        double num2 = Math.round(nums.getNum2());
        
        double aux;

        if (nums.getNum1() > nums.getNum2()) {
            aux = Math.pow(num1, num2);
            System.out.println("La potencia del primer numero elevado al segundo es: " + aux);
        } else if (nums.getNum1() < nums.getNum2()) {
            aux = Math.pow(num1, num2);
            System.out.println("La potencia del segundfo numero elevado al primero es: " + aux);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
    
    /**Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
     * valores. Antes de calcular la raíz cuadrada se debe obtener el valor
     * absoluto del número.
     */
      public void calculaRaiz(ParDeNumeros nums) {
       double aux;
        if (nums.getNum1() > nums.getNum2()) {
            aux = abs(nums.getNum2());
            System.out.println("La raiz Cuadrada del menor es = " + sqrt(aux));
        }else if (nums.getNum1() < nums.getNum2()) {
            aux = abs(nums.getNum1());
            System.out.println("La raiz Cuadrada del menor es = " + sqrt(aux));
        } else {
            System.out.println("Los numeros son iguales");
        }
      }

}
