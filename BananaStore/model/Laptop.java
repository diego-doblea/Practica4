package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Clase que representa una Laptop.
 */
public class Laptop extends Product {
    private String tamanoPantalla;
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;
    
    /**
     * Constructor de la clase Laptop.
     * 
     * @param marca           La marca de la laptop.
     * @param modelo          El modelo de la laptop.
     * @param precio          El precio de la laptop.
     * @param tamanoPantalla  El tamaño de la pantalla (ej. "15.6\"").
     * @param procesador      El procesador de la laptop.
     * @param memoriaRam      La memoria RAM en GB.
     * @param almacenamiento  La capacidad de almacenamiento en GB.
     */
    public Laptop(String marca, String modelo, double precio, String tamanoPantalla, String procesador, int memoriaRam, int almacenamiento) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }
    
    @Override
    public void showDetails() {
        // Forzar uso de Locale.US para el formato 18,999.00
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatter = new DecimalFormat("#,###.00", symbols);
        
        System.out.println("Laptop: " + marca + " " + modelo);
        System.out.println("Precio: $" + formatter.format(precio));
        System.out.println("Pantalla: " + tamanoPantalla);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRam + "GB");
        System.out.println("Almacenamiento: " + almacenamiento + "GB");
    }
}
