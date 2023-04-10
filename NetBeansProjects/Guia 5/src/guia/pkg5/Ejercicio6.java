/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;

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
        /**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
         * 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
         * idénticas. Crear un programa que permita introducir un cuadrado por
         * teclado y determine si este cuadrado es mágico o no. El programa
         * deberá comprobar que los números introducidos son correctos, es
         * decir, están entre el 1 y el 9. 
         */
        
        Scanner sc =new Scanner(System.in);
        int  num;
        int fila,columna, diagonal=0, diagonal_o=0;
        int magic;
        boolean veri=true;
        magic=15;
        int matriz [][]=new int [3][3];
        System.out.println("ingrese valores entre 1 y 9");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do{
                    System.out.print("ingrese un numero de la matriz posicion ["+(i)+"] ["+(j)+"] ");
                    num=sc.nextInt();
                }while(num>9 || num<1);

                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            fila=0;
            for (int j = 0; j < 3; j++) {
                fila += matriz[i][j];
            }
            if(fila!=magic){
                veri=false;
                break;
            }
        }
        for (int j = 0; j < 3; j++) {
            columna=0;
            for (int i = 0; i < 3; i++) {
                columna += matriz[i][j];
            }
            if(columna!=magic){
                veri=false;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    diagonal+=matriz[i][j];
                }
            }
        }
        if(diagonal!=magic){
            veri=false;
        }
        for (int i = 0; i < 3; i++) {
            diagonal_o+=matriz[i][3-i-1];
        }
        if(diagonal_o!=magic){
            veri=false;
        }
        System.out.println("¿es esto una matriz magica? "+veri);
    }
    
}
