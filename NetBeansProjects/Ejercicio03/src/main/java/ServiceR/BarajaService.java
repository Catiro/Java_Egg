/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Entidad3.Baraja;
import Entidad3.Carta;

/**
 *
 * @author jrv11
 */
public class BarajaService {
    private Baraja bar = new Baraja();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Carta> monton = bar.getMonto();

    public Baraja crearBaraja() {
        String[] palo = { "Espada", "Basto", "Oro", "Copa" };
        ArrayList<Carta> mazo = new ArrayList<>();
        for (int index = 0; index < palo.length; index++) {
            for (int i = 0; i < palo.length; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }
                mazo.add(new Carta (i,palo[index]));
            }
        }
        bar.setBaraja(mazo);
        return bar;
    }

    /* barajar(): cambia de posición todas las cartas aleatoriamente. */
    public void Barajar() {
        System.out.println("Se barajo el mazo: ");
        Collections.shuffle(bar.getBaraja());
    }

    /*
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
     * no haya más o
     * se haya llegado al final, se indica al usuario que no hay más cartas.
     */

    public void siguienteCarta() {

        if (bar.getBaraja().size() > 1) {
            System.out.println("La carta se entrego. " + bar.getBaraja().get(0));
            monton.add(bar.getMonto().get(0));
            bar.getBaraja().remove(0);
        } else if (bar.getBaraja().size() == 1) {
            System.out.println("La carta se entrego. " + bar.getBaraja().get(0));
            monton.add(bar.getBaraja().remove(0));
            // otra forma de realizar el ejercicio pero solo utizando la baraja y el get
            // barajaN1.getMontonCartas().add(barajaN1.getMazo().remove(0));
            System.out.println("NO QUEDAN MAS CARTAS!!!");
        }
    }
    /*
     * cartasDisponibles(): indica el número de cartas que aún se puede repartir.
     */

    public void cartasDisponibles() {
        System.out.println("Quedan " + bar.getBaraja().size() + " disponibles");
    }

    /*
     * darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
     * número de
     * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
     * nada, pero
     * debemos indicárselo al usuario.
     */

    public void darCartas() {
        System.out.println("Cuantas cartas desea?");
        int cartasPedidas = leer.nextInt();
        if (cartasPedidas > bar.getBaraja().size()) {
            System.out.println("Lo Sentimos no hay cartas suficientes para el pedido");
        } else {
            for (int i = 0; i < cartasPedidas; i++) {
                siguienteCarta();
            }
        }
    }

    /*
     * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
     * ninguna
     * indicárselo al usuario
     */

    public void cartasMonton() {
        if (bar.getBaraja().size() == 40) {
            System.out.println("No a salido ninguna carta del mazo");
        } else {
            System.out.println(bar.getMonto());
        }
    }

    /* mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta. */
    public void mostrarBaraja(){
        for (Carta monton: bar.getBaraja()) {
            System.out.println(monton.toString());
        }
    }

/* MENU*/

public void menuBaraja(){
    int op = 0;
    String confirmacion = "";
    System.out.println("Bienvenido al casi juego!!");

    do
    {
        System.out.println(" ");
        System.out.println("Que desea hacer?");
        System.out.println("1: Crear una nueva baraja.");
        System.out.println("2: Barajar el mazo.");
        System.out.println("3: Ver cuantas cartas hay disponible en el mazo.");
        System.out.println("4: Obtener una carta.");
        System.out.println("5: Pedir una cantidad de cartas.");
        System.out.println("6: Ver las cartas del monton.");
        System.out.println("7: Ver las cartas del mazo.");
        System.out.println("8: Salir");
        op = leer.nextInt();
        switch (op)
        {
            case 1:
                crearBaraja();
                break;
            case 2:
                Barajar();
                break;
            case 3:
                cartasDisponibles();
                break;
            case 4:
                siguienteCarta();
                break;
            case 5:
                darCartas();
                break;
            case 6:
                cartasMonton();
                break;
            case 7:
                mostrarBaraja();
                break;
            case 8:
                System.out.println("Desea salir? S/N");
                confirmacion = leer.next();
                break;
            default:
                System.out.println("NO ES UNA OPCION VALIDA!!!");
        }
    } while (!confirmacion.equalsIgnoreCase("S"));
}
 

}
