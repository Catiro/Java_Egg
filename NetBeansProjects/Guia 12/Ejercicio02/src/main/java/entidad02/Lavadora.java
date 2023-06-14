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
public class Lavadora extends Electrodomestico {
    
    private double carga;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
        this.precio = precioFinal();
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora. */
public void crearLavadora(){
    
    System.out.println("Ingrese la capacidad de carga de la Lavadora: ");
    this.carga = leer.nextDouble();
    super.crearElectrodomestico();

}

/*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
*/

    @Override
    public double precioFinal(){
        double fin = super.precioFinal();        
        if(carga >= 30){
         fin += 500;    
        }        
        return fin;
}

@Override
public String toString() {
    return "Lavadora [carga=" + carga + super.toString() + "]";
}

    
}
