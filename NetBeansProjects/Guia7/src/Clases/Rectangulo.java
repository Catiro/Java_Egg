/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Rectangulo {
    /**
     * Crear una clase Rectángulo que modele rectángulos por medio de un
     * atributo privado base y un atributo privado altura. La clase incluirá un
     * método para crear el rectángulo con los datos del Rectángulo dados por el
     * usuario. 
     * También incluirá un método para calcular la superficie del
     * rectángulo y un 
     * método para calcular el perímetro del rectángulo. 
     * Por último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura. Se deberán además definir los
     * métodos getters, setters y constructores correspondientes. Superficie =
     * base * altura / Perímetro = (base + altura) * 2.
     */
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
        
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo:");
        this.altura = leer.nextInt();
    }
    public int perimetro(int base, int altura){
        int perimetro = (base + altura) *2;
        return perimetro;
                
    }
    public int superficie(int base, int altura){
        int superficie = (base * altura);
        return superficie;
                
    }
    public void dibujar(int base, int altura){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base-1){
                    System.out.print("*");
                } else if (j == 0 || j == altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
