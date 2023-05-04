/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class CursoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /** * Método cargarAlumnos(): este método le permitirá al usuario ingresar los
     * alumnos que asisten a las clases.Nosotros nos encargaremos de almacenar
 esta información en un arreglo e iterar con un bucle, solicitando en cada
 repetición que se ingrese el nombre de cada alumno.
     * @param aula
     */
    public void cargarAlumnos(Curso aula){
        String[] alumnos = new String[5];
        System.out.println("ALUMNOS");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (1+i));
            alumnos[i]= leer.next();
        }
          aula.setAlumnos(alumnos);
    }
    
    /**Método crearCurso(): el método crear curso, le pide los valores de los
     * atributos al usuario y después se le asignan a sus respectivos atributos
     * para llenar el objeto Curso. En este método invocamos al método
     * cargarAlumnos() para asignarle valor al atributo alumnos
     */
     public Curso crearCurso(){
         Curso aula = new Curso();
         System.out.println("Ingrese el nombre del Curso: ");
         aula.setNombreCurso(leer.nextLine());
         System.out.println("Ingrese la cantidad de horas del curso por día:");
         aula.setCantidadHorasPorDia(leer.nextInt());
         System.out.println("Ingrese la cantidad de días por semana:");
         aula.setCantidadDiasPorSemana(leer.nextInt());
         System.out.println("Ingrese el turno:");
         aula.setTurno(leer.next());
         System.out.println("Ingrese el precio de la hora: ");
         aula.setPrecioPorHora(leer.nextInt());
         cargarAlumnos(aula);
         return aula;
     }
     
     /**Método calcularGananciaSemanal(): este método se encarga de calcular la
     * ganancia en una semana por curso. Para ello, se deben multiplicar la
     * cantidad de horas por día, el precio por hora, la cantidad de alumnos y
     * la cantidad de días a la semana que se repite el encuentro.
      */
     
     public void calcularGananciaSemanal(Curso aula){
         System.out.println("La gancia semanal es de: $" + aula.getCantidadHorasPorDia() * aula.getPrecioPorHora() * aula.getAlumnos().length * aula.getCantidadDiasPorSemana());
     }    
}
