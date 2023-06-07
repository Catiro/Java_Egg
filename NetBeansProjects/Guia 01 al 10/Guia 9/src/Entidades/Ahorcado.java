/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author jrv11
 */
public class Ahorcado {
    /**
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
     * contener como atributos, un vector con la palabra a buscar, la cantidad
     * de letras encontradas y la cantidad jugadas máximas que puede realizar el
     * usuario. Definir los siguientes métodos en AhorcadoService:
     */
    private String [] palabra;
    private int encontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int intentos) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", encontradas=" + encontradas + ", intentos=" + intentos + '}';
    }
    
    
    
    
    
}
