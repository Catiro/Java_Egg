/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Una obra social tiene tres clases de socios: Los socios tipo ‘A’
         * abonan una cuota mayor, pero tienen un 50% de descuento en todos los
         * tipos de tratamientos. Los socios tipo ‘B’ abonan una cuota moderada
         * y tienen un 35% de descuento para los mismos tratamientos que los
         * socios del tipo A. Los socios que menos aportan, los de tipo ‘C’, no
         * reciben descuentos sobre dichos tratamientos. Solicite una letra
         * (carácter) que representa la clase de un socio, y luego un valor real
         * que represente el costo del tratamiento (previo al descuento) y
         * determine el importe en efectivo a pagar por dicho socio.
         *
         */
        Scanner leer = new Scanner(System.in);
        String socio;
        do{
        System.out.println("Ingrese el tipo de Socio: ");
            socio = leer.next();
        } while (!socio.equalsIgnoreCase("a") && !socio.equalsIgnoreCase("b") && !socio.equalsIgnoreCase("c"));
        System.out.println("Ingrese el costo del servicio");
        int precio = leer.nextInt();
        
        switch (socio.toLowerCase()) {
            case "a":
                System.out.println("El costo del tratamiento es de $" + precio + ", Con tu descuento del 50% te queda en " + precio / 2);
                break;
            case "b":
                System.out.println("El costo del tratamiento es de $" + precio + ", Con tu descuento del 50% te queda en " + precio * 0.65);
                break;
            case "c":
                System.out.println("El costo del tratamiento es de $" + precio  );
                break;
            default: 
                System.out.println("El tipo de socio es incorrecto");
                break;
        }
    }

}
