/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad02;

import java.util.Scanner;

/*
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 *
 * @author jrv11
 */
public class Televisor extends Electrodomestico {

    /*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
     */

    private double resolucion;
    private boolean tdt;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucion, boolean tDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tDT;
    }

    public Televisor() {

    }

    //Método get y set de los atributos resolución y sintonizador TDT.
    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor. */
    public void crearTelevisor() {
        System.out.println("CARGA DE TV");        
        System.out.println("Ingrese la resolucion en Pulgadas: ");
        this.resolucion = leer.nextDouble();
        System.out.println("¿Posee tdt? (S/N)");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
            System.out.println("Opcion no valida. Ingresa de nuevo \n¿Posee tdt? (S/N)");
            opc = leer.next();
        }
        if (opc.equalsIgnoreCase("s")) {
            this.tdt = true;
        } else {
            this.tdt = false;
        }
        crearElectrodomestico();
    }

    /* Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    @Override
    public double precioFinal() {
        double fin = super.precioFinal();
        if (resolucion > 40) {
            fin += fin * 0.30;
        }
        if (tdt) {
            fin += 500;
        }
        return fin;
    }

    @Override
    public String toString() {
        return "Televisor [resolucion=" + resolucion + ", tdt=" + tdt + ", " + super.toString() + "]";
    }

}
