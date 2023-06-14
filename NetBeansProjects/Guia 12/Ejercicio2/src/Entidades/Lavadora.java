package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private double carga;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
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
    super.crearElectrodomestico();
    System.out.println("Ingrese la capacidad de carga de la Lavadora: ");
    this.carga = leer.nextDouble();

}

@Override
public String toString() {
    return "Lavadora [carga=" + carga + super.toString() +"]";
}



    
}
