/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class AlumnoService {

    /**
     * En el servicio de Alumno deberemos tener un bucle que crea un objeto
     * Alumno. Se pide toda la información al usuario y ese Alumno se guarda en
     * una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro
     * Alumno o no. Después de ese bucle tendremos el siguiente método en el
     * servicio de Alumno
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();
    

    public void crearAlumno() {
        String aux;
        do {
            Alumno estudiante = new Alumno();
            System.out.println("Ingrese el nombre del aluno: ");
            estudiante.setNombre(leer.next());
            System.out.println("Ingrese las 3 notas del Alumno");
            ArrayList<Integer> notas = new ArrayList();
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            estudiante.setNotas(notas);
            System.out.println("Desea ingresar otro alumno? (S/N)");
            aux = leer.next();
            alumnos.add(estudiante);
        } while(!aux.equalsIgnoreCase("n"));
        alumnos.toString();
    }
    
    /**Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main
     */
    
    public void notaFinal(){
        Iterator<Alumno> it = alumnos.iterator();
        System.out.println("---------Nota Final---------\nIngrese el nombre del alumno ");
        String alumno1 = leer.next();
        boolean aux = true;
        while(it.hasNext()){
            Alumno estudiante = it.next();
            System.out.println(estudiante.getNombre());
            if(estudiante.getNombre().equalsIgnoreCase(alumno1)){
                System.out.println("La nota promedio del alumno es: " + promedio(estudiante.getNotas()));
                aux=false;
            
            }
            if(aux){
                System.out.println("El alumno no fue encontrado");
            }
        }
    }
    
    public double promedio(ArrayList<Integer> notas){        
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        
        return suma/notas.size();
    }
}
