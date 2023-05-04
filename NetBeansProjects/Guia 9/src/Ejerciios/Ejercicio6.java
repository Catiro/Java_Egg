/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciios;

import Entidades.Curso;
import Servicio.CursoService;

/**
 *
 * @author jrv11
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * 
         */
        CursoService curso = new CursoService();
        Curso aula = curso.crearCurso();
        curso.calcularGananciaSemanal(aula);
        
        System.out.println(aula.toString());
    }
    
}
