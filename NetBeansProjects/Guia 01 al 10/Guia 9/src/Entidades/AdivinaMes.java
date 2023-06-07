/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author jrv11
 */
public class AdivinaMes {

    private String[] mes = new String[12];
    private String mesSecreto;

    public AdivinaMes() {
        
        this.mes[0] = "enero";
        this.mes[1] = "febrero";
        this.mes[2] = "marzo";
        this.mes[3] = "abril";
        this.mes[4] = "mayo";
        this.mes[5] = "junio";
        this.mes[6] = "julio";
        this.mes[7] = "agosto";
        this.mes[8] = "septiembre";
        this.mes[9] = "octubre";
        this.mes[10] = "noviembre";
        this.mes[11] = "diciembre";
    
    }

    public AdivinaMes(String[] mes, String mesSecreto) {
        this.mes[0] = "enero";
        this.mes[1] = "febrero";
        this.mes[2] = "marzo";
        this.mes[3] = "abril";
        this.mes[4] = "mayo";
        this.mes[5] = "junio";
        this.mes[6] = "julio";
        this.mes[7] = "agosto";
        this.mes[8] = "septiembre";
        this.mes[9] = "octubre";
        this.mes[10] = "noviembre";
        this.mes[11] = "diciembre";
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "AdivinaMes{" + "mes=" + Arrays.toString(mes) + ", mesSecreto=" + mesSecreto + '}';
    }

}
