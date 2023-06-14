/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Endidad1;

/**
 *
 * @author jrv11
 */
public class Persona {

    private String nombrePersona;
    private String apellidoPersona;
    private Integer edadPersona;
    private Integer dniPersona;
    private Perro perroAdoptado;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, Integer edadPersona, Integer dniPersona, Perro perroadoptado) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.dniPersona = dniPersona;
        this.perroAdoptado = perroAdoptado;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    public Integer getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(Integer dniPersona) {
        this.dniPersona = dniPersona;
    }

    public Perro getPerroAdoptado() {
        return perroAdoptado;
    }

    public void setPerroAdoptado(Perro perroAdoptado) {
        this.perroAdoptado = perroAdoptado;
    }

    @Override
    public String toString() {
        return "La persona: " + nombrePersona + " adopto a: " + perroAdoptado;
    }

}
