/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class EstudianteService {

    //La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
//estudiantes con sus respectivas notas.
    //Objeto nombreVector[] = new Objeto[];

    private Estudiante[] vectorEstudiantes = new Estudiante[8];

    public Estudiante[] crearEstudiantes() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // cargar el array con nombres
        String nombre;
        double notas;

        for (int i = 0; i < vectorEstudiantes.length; i++)
        {
            System.out.println("Ingrese el nombre y la nota del alumno: ");

            nombre = leer.next();
            notas = leer.nextDouble();
            vectorEstudiantes[i] = new Estudiante(nombre, notas);
        }

        return vectorEstudiantes;

    }

//Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio() {
        double sumaNotas = 0;
        double promedioDeClase = 0;

        for (Estudiante vectorEstudiante : vectorEstudiantes)
        {
            sumaNotas += vectorEstudiante.getNota();
        }
        promedioDeClase = sumaNotas / vectorEstudiantes.length;

        return promedioDeClase;
    }

    public void mostrarPromedio() {
        System.out.println("El promedio de las notas es: " + calcularPromedio());
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso
    public String[] compararNotas() {
        int contNotas = 0;

// este for solo rellena el contador para darle dimension al vector donde vamos a guardar los nombres
        for (Estudiante vectorEstudiante : vectorEstudiantes)
        {
            if (calcularPromedio() <= vectorEstudiante.getNota())
            {
                contNotas++;
            }
        }
        String[] nombresAlumnos = new String[contNotas];

//en este for rellenamos el nuevo vector con los nombres de los alumnos que su nota sobrepase el promedio 
//general del curso
        //esta variable nos sirve para darle la posicion al vector donde guardaremos el nombre
        int z = 0;
        for (int i = 0; i < vectorEstudiantes.length; i++)
        {
            if (vectorEstudiantes[i].getNota() > calcularPromedio())
            {
                nombresAlumnos[z] = vectorEstudiantes[i].getNombre();
                //la variable va incrementando para cambiar de posicion
                z++;
            }
        }
        return nombresAlumnos;
    }

    //Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
    public void mostrarAlumnos() {
        String[] nombresA = compararNotas();

        for (int i = 0; i < nombresA.length; i++)
        {
            System.out.println(nombresA[i]);
        }

    }

}
