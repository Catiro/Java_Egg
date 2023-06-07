/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.AdivinaMes;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class AdivinaMesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mesSecreto(AdivinaMes adivinanza){
      adivinanza.setMesSecreto(adivinanza.getMes()[(int)(11*Math.random())]);
    }
    public void adivinanza(AdivinaMes adivinanza){
        System.out.println("Adivina el mes:");
        String mes = leer.next();
        while (!mes.equals(adivinanza.getMesSecreto())){
           System.out.println("Intentalo de nuevo"); 
           mes = leer.next();
        }
        System.out.println("Adivinastes!!\nEl mes secreto es: " + mes);
    }
    
}
