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
public class Juego {
    /**
     * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a
     * dos jugadores jugar un juego de adivinanza de números. El primer jugador
     * elige un número y el segundo jugador intenta adivinarlo. El segundo
     * jugador tiene un número limitado de intentos y recibe una pista de "más
     * alto" o "más bajo" después de cada intento. El juego termina cuando el
     * segundo jugador adivina el número o se queda sin intentos. Registra el
     * número de intentos necesarios para adivinar el número y el número de
     * veces que cada jugador ha ganado.
     */
    public int num1;
    public int num2;
    public int intentos;

    public Juego() {
    }
  
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("=======\nPlayer 1 \n=======\n Ingresar el número a adivinar");
        num1 = leer.nextInt();
        System.out.println("========\nPlayer 2\n========\nAdivina el número, tienes 4 intentos");
        intentos = 0;
        while (intentos < 5){
            intentos ++;
            num2 = leer.nextInt();
            
            if (num2 == num1){
                System.out.println("==============\nFelicidades Adivinaste\n==============\n");
                System.out.println("La cantidad de intentos es: " + intentos);
                break;                
            } 
            if (num2 > num1){
                System.out.println("El número ingresado es mayor");  
                System.out.println("Llevas " + intentos + " intentos.\n");
                System.out.println("");
            }
            if (num2 < num1){
                System.out.println("El número ingresado es menor");
                System.out.println("Llevas " + intentos + " intentos.\n Vuelve a intentar");
                System.out.println("");
            }
            if (intentos == 4){
               System.out.println("Este fue tu ultimo intento"); 
            }
        }
        System.out.println("GAME OVER");
        
    }
}