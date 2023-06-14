/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad02;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Electrodomestico {
    /*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */    

 protected double precio;
 protected String color;
 protected char consumoEnergetico;
 protected double peso;
 private Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
    this.precio = precio;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
}

public Electrodomestico() {
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public char getConsumoEnergetico() {
    return consumoEnergetico;
}

public void setConsumoEnergetico(char consumoEnergetico) {
    this.consumoEnergetico = consumoEnergetico;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

/*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
 */

 public void comprobarConsumoEnergetico(char letra){
   
    if (letra >= 'A' && letra <= 'F') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
 }

 /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible. */

public void comprobarColor(String color){
    if(!color.equalsIgnoreCase("negro")&&!color.equalsIgnoreCase("rojo")&&!color.equalsIgnoreCase("azul")&&!color.equalsIgnoreCase("gris")){
        this.color = "Blanco";
    } 
}

/* Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
 */
public void crearElectrodomestico(){
    
    System.out.println("Ingrese el color del electrodomético: ");
    this.color= leer.next();
    comprobarColor(color);
    System.out.println("Ingrese el tipo de Consumo energetico");
    this.consumoEnergetico = leer.next().toUpperCase().charAt(consumoEnergetico);
    comprobarConsumoEnergetico(consumoEnergetico);
    System.out.println("Ingrese el peso del electrodoméstico: ");
    this.peso = leer.nextDouble();
    this.precio = precioFinal();
}

/*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios: */

public double precioFinal(){
    double precioFinal = 1000;
    
    switch(consumoEnergetico){
        case 'A':
        precioFinal += 1000;
        break;
        case 'B':
        precioFinal += 800;
        break;
        case 'C':
        precioFinal += 600;
        break;
        case 'D':
        precioFinal += 500;
        break;
        case 'E':
        precioFinal += 300;
        break;
        case 'F':
        precioFinal += 100;
        break;

    }
    if (peso >= 1 && peso < 20) {
            precioFinal += 100;
        } else if (peso >= 20 && peso < 50) {
            precioFinal += 500;
        } else if (peso >= 50 && peso < 80) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
}

@Override
public String toString() {
    return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
            + ", peso=" + peso + "]";
}
    
}
