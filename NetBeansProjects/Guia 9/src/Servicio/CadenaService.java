/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author jrv11
 */
public class CadenaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        
        System.out.println("Ingrese la cadena");
        Cadena c1 = new Cadena(leer.next());
        return c1;
    }

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena c1) {
        int j = 0;
        String letra;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = substring(c1.getFrase(), i, i + 1).toLowerCase();
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    j++;
                    break;
            }
        }
        System.out.println("La cantidad de vocales de la frase es: " + j);        
    }
    
    /**Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
     * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena c1){
        int j = c1.getLongitud();
        char[] letras = new char[j];
        letras = c1.getFrase().toCharArray();
        System.out.println("La frase invertida es: ");
        for (int i = 0; i < j; i++) {
            //System.out.print(letras[c1.getLongitud()-i]);
            System.out.print(letras[j-1-i]);
        }
        System.out.println("");
    } 
    
    /**Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo: 
     */
    public void vecesRepetido(Cadena c1){
       int j = 0;
       System.out.println("Ingrese la letra que desea buscar: ");
        String letra = leer.next().toLowerCase();
        String letra1;
        for (int i = 0; i < c1.getLongitud(); i++) {            
            letra1 = substring(c1.getFrase(),i,i+1).toLowerCase();
            if (letra1.equals(letra)){
                j++;            
            }
        }
        System.out.println("La cantidad veces que esta la letra es: " + j);          
    }
    
    /**Método compararLongitud(String frase), deberá comparar la longitud de la
     * frase que compone la clase con otra nueva frase ingresada por el usuario. 
     */
     public void compararLongitud(Cadena c1){
         System.out.println("Ingrese una nueva frase: ");
         String fraseNueva = leer.next();
         if (c1.getLongitud() == fraseNueva.length()){
             System.out.println("Las frases poseenla misma longitud");
         } else {
             System.out.println("Las frases son de diferente longitud");
         }
     }
     
     /**Método unirFrases(String frase), deberá unir la frase contenida en la
     * clase Cadena con una nueva frase ingresada por el usuario y mostrar la
     * frase resultante.
     */
     public void unirFrases(Cadena c1){
         System.out.println("Ingrese la frase que desa unir a la cadena ya ingresada: ");
         String frase2 = leer.next();
         System.out.println("La frase unida queda de la siguiente manera: " + c1.getFrase().concat(" " + frase2) );
     }
     
     /**Método reemplazar(String letra), deberá reemplazar todas las letras “a”
     * que se encuentren en la frase, por algún otro carácter seleccionado por
     * el usuario y mostrar la frase resultante
     */
     public void reemplazar(Cadena c1){
       System.out.println("Ingrese el caracter de remplazo: ");
       
        String letra = leer.next().toLowerCase();
        String letra1;
        for (int i = 0; i < c1.getLongitud(); i++) {            
            letra1 = substring(c1.getFrase(),i,i+1).toLowerCase();
            if (!letra1.equals("a")){
                System.out.print(substring(c1.getFrase(),i,i+1));           
            }else {
                System.out.print(letra);
            }
        }
         System.out.println("");               
    }
     
     /**Método contiene(String letra), deberá comprobar si la frase contiene una
     * letra que ingresa el usuario y devuelve verdadero si la contiene y falso
     * si no.
     */
      public void contiene(Cadena c1){
      int j = 0;
       System.out.println("Ingrese la letra que desea buscar: ");
        String letra = leer.next().toLowerCase();
        String letra1;
        for (int i = 0; i < c1.getLongitud(); i++) {            
            letra1 = substring(c1.getFrase(),i,i+1).toLowerCase();
            if (letra1.equals(letra)){
                j++;            
            }
        }
        boolean aux;
        aux = j!=0;
          System.out.println(aux);
      }
     
     
}// end
