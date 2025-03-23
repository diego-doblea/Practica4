package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Clase que representa una Tablet.
 */
public class Tablet extends Product {
    private String tamanoPantalla;
    private boolean compatibilidadLapiz;
    private int cantidadCamaras;
    
    /**
     * Constructor de la clase Tablet.
     * 
     * @param marca              La marca de la tablet.
     * @param modelo             El modelo de la tablet.
     * @param precio             El precio de la tablet.
     * @param tamanoPantalla     El tamaño de la pantalla (ej. "10\"").
     * @param compatibilidadLapiz  Indica si la tablet es compatible con lápiz táctil.
     * @param cantidadCamaras    La cantidad de cámaras.
     */
    public Tablet(String marca, String modelo, double precio, String tamanoPantalla, boolean compatibilidadLapiz, int cantidadCamaras) {
        super(marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.compatibilidadLapiz = compatibilidadLapiz;
        this.cantidadCamaras = cantidadCamaras;
    }
    
    @Override
    public void showDetails() {
        // Forzar uso de Locale.US para el formato 18,999.00
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatter = new DecimalFormat("#,###.00", symbols);
        
        System.out.println("Tablet: " + marca + " " + modelo);
        System.out.println("Precio: $" + formatter.format(precio));
        System.out.println("Pantalla: " + tamanoPantalla);
        System.out.println("Compatibilidad con lápiz táctil: " + (compatibilidadLapiz ? "Sí" : "No"));
        System.out.println("Cámaras: " + cantidadCamaras);
    }
}
