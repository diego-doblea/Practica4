package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Clase que representa un Celular.
 */
public class Celular extends Product {
    private String tamanoPantalla;
    private String capacidadBateria;
    private int cantidadCamaras;
    
    /**
     * Constructor de la clase Celular.
     * 
     * @param marca             La marca del celular.
     * @param modelo            El modelo del celular.
     * @param precio            El precio del celular.
     * @param tamanoPantalla    El tamaño de la pantalla (ej. "6.5\"").
     * @param capacidadBateria  La capacidad de la batería (ej. "5000 mAh").
     * @param cantidadCamaras   La cantidad de cámaras.
     */
    public Celular(String marca, String modelo, double precio, String tamanoPantalla, String capacidadBateria, int cantidadCamaras) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadBateria = capacidadBateria;
        this.cantidadCamaras = cantidadCamaras;
    }
    
    @Override
    public void showDetails() {
        // Forzar uso de Locale.US para el formato 18,999.00
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatter = new DecimalFormat("#,###.00", symbols);
        
        System.out.println("Celular: " + marca + " " + modelo);
        System.out.println("Precio: $" + formatter.format(precio));
        System.out.println("Pantalla: " + tamanoPantalla);
        System.out.println("Batería: " + capacidadBateria);
        System.out.println("Cámaras: " + cantidadCamaras);
    }
}
