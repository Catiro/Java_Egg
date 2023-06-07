/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jrv11
 */
public class Raices {
    /**
     * Vamos a realizar una clase llamada Raices, donde representaremos los
     * valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como
     * atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para
     * construir el objeto a través de un método constructor. Luego, en
     * RaicesServicio las operaciones que se podrán realizar son las siguientes:
     */
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    

}
