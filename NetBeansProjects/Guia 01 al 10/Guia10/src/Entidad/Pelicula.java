/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jrv11
 */
public class Pelicula {
    /**Un cine necesita implementar un sistema en el que se puedan cargar
     * peliculas. Para esto, tendremos una clase Pelicula con el título,
     * director y duración de la película (en horas). Implemente las clases y
     * métodos necesarios para esta situación, teniendo en cuenta lo que se pide
     * a continuación:
     */
    
    private String titulo;
    private String director;
    private int horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}
