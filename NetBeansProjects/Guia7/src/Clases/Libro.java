/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Libro {
    /**
         * Crear una clase llamada Libro que contenga los siguientes atributos:
         * ISBN, Título, Autor, Número de páginas, y un constructor con todos
         * los atributos pasados por parámetro y un constructor vacío. Crear un
         * método para cargar un libro pidiendo los datos al usuario y luego
         * informar mediante otro método el número de ISBN, el título, el autor
         * del libro y el número de páginas.
         */
    public int isbn;
    public String titulo;
    public String aut;
    public int paginas;

    public Libro(int ISBN, String titulo, String aut, int paginas) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.aut = aut;
        this.paginas = paginas;
    }
    public Libro(){
        
    }
    
    public void leerLibro(){
              
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el Titulo");
        this.titulo = input.nextLine();
        System.out.println("Ingrese el Autor");
        this.aut = input.nextLine();
        System.out.println("Ingrese el ISBN");
        this.isbn = input.nextInt();
        System.out.println("Ingrese el Paginas");
        this.paginas = input.nextInt();

    
    
}
    public void mostrar(){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El numero del ISBN: " + isbn);
        System.out.println("El nombre del autor: " + aut);
        System.out.println("El numero de paginas es: " + paginas);
    }
}


