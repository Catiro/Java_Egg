/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador;

import Servicio.EstudianteService;

/**
 *
 * @author jrv11
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteService n1 = new EstudianteService();
        
        n1.crearEstudiantes();
        n1.calcularPromedio();
        n1.mostrarPromedio();
        n1.compararNotas();
        n1.mostrarAlumnos();
    }
    
}
