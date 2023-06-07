/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jrv11
 */
public class GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals( "café")){
                it.remove();
            }

        }
    }

}
