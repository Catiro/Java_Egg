/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jrv11
 */
public class NIF {
    /**Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
     * con su correspondiente letra (NIF). Los atributos serán el número de DNI
     * (entero largo) y la letra (String o char) que le corresponde. En
     * NIFService se dispondrá de los siguientes métodos:
     */
    private long dni;
    private String letra;

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public NIF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public long getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
