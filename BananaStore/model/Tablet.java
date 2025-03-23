package BananaStore.model;

/**
 * Clase que representa una Tablet en Banana Store.
 * Hereda de Product e incluye atributos específicos como tamaño de pantalla, compatibilidad con lápiz táctil y número de cámaras.
 */
public class Tablet extends Product {
    private double screenSize;       // Tamaño de pantalla en pulgadas
    private boolean stylusCompatibility; // Compatibilidad con lápiz táctil
    private int cameras;             // Número de cámaras

    /**
     * Constructor de la clase Tablet.
     * @param brand La marca de la tablet.
     * @param model El modelo de la tablet.
     * @param price El precio de la tablet.
     * @param screenSize El tamaño de la pantalla en pulgadas.
     * @param stylusCompatibility Verdadero si es compatible con lápiz táctil, falso en caso contrario.
     * @param cameras El número de cámaras.
     */
    public Tablet(String brand, String model, double price, double screenSize, boolean stylusCompatibility, int cameras) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.stylusCompatibility = stylusCompatibility;
        this.cameras = cameras;
    }

    // Getters y setters

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isStylusCompatibility() {
        return stylusCompatibility;
    }

    public void setStylusCompatibility(boolean stylusCompatibility) {
        this.stylusCompatibility = stylusCompatibility;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    /**
     * Devuelve la descripción completa de la Tablet.
     * @return Una cadena con la descripción del producto.
     */
    @Override
    public String getDescription() {
        return "Tablet: " + brand + " " + model +
               "\nPrecio: $" + getFormattedPrice() +
               "\nPantalla: " + screenSize + " pulgadas" +
               "\nCompatibilidad con lápiz táctil: " + (stylusCompatibility ? "Sí" : "No") +
               "\nCámaras: " + cameras;
    }
}
