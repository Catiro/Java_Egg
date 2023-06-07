/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class TiendaService {

    /**
     * 
     */
    public TiendaService() {
    }

    
    private HashMap<String,Integer> lista = new HashMap<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    public void menu() {
        int opc;
        do{
            System.out.println("Elige una opcion (Seleccionar número)" + "\n" +
                    "1.Cargar producto" + "\n" +
                    "2.Modificar precio" + "\n" +
                    "3.Eliminar producto" + "\n" +
                    "4.Mostrar lista de productos" + "\n" +
                    "5.Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("La opcion ingresada no existe");
            }
   
        }while (true);
    } 

    private void introducirProducto() {
        String produc = ""; 
        int precio = 0;
        String opc = "";
        do { 
            System.out.println("Ingrese el producto");
            produc = leer.next();
            System.out.println("Ingrese el precio");
            precio = leer.nextInt();
            lista.put(produc, precio);  // agrega elementos a el hasmap
            System.out.println("Desea ingresar otro producto? (S/N)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
    }

    private void modificarPrecio() {
          System.out.println("Ingrese el producto que quiere modificar el precio:");
        String productoBuscar = leer.next();
        int precioModificado;
        for (Map.Entry<String, Integer> entry : lista.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (key.equalsIgnoreCase(productoBuscar)) {
                System.out.println("Ingrese el valor modificado: ");
                precioModificado = leer.nextInt();
                lista.replace(key, value, precioModificado);
                System.out.println("Se modifico correctamente su precio.");
                break;
            }
        }      
    }

    private void eliminarProducto() {
        System.out.println("Ingrese el producto que quiere eliminar");
        String productoEliminar = leer.next();
        int precioModificado;
        for (Map.Entry<String, Integer> entry : lista.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (key.equalsIgnoreCase(productoEliminar)) {
                lista.remove(key);
            }
            System.out.println("Se elimino el producto correctamente");
            break;
        }
    }


    private void mostrarProductos(){
        for (Map.Entry<String, Integer> entry : lista.entrySet())
        {

            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("El producto " + key + " \n " + "Y su precio es: $ " + value);
        }

    }    
}
