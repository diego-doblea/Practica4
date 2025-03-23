package BananaStore.model;

/**
 * Clase que representa un Celular en Banana Store.
 * Hereda de Product e incluye atributos específicos como tamaño de pantalla, capacidad de batería y número de cámaras.
 */
public class Celular extends Product {
    private double screenSize;    // Tamaño de pantalla en pulgadas
    private int batteryCapacity;  // Capacidad de batería en mAh
    private int cameras;          // Número de cámaras

    /**
     * Constructor de la clase Celular.
     * @param brand La marca del celular.
     * @param model El modelo del celular.
     * @param price El precio del celular.
     * @param screenSize El tamaño de la pantalla en pulgadas.
     * @param batteryCapacity La capacidad de la batería en mAh.
     * @param cameras El número de cámaras.
     */
    public Celular(String brand, String model, double price, double screenSize, int batteryCapacity, int cameras) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.cameras = cameras;
    }

    // Getters y setters

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    /**
     * Devuelve la descripción completa del Celular.
     * @return Una cadena con la descripción del producto.
     */
    @Override
    public String getDescription() {
        return "Celular: " + brand + " " + model +
               "\nPrecio: $" + getFormattedPrice() +
               "\nPantalla: " + screenSize + " pulgadas" +
               "\nBatería: " + batteryCapacity + " mAh" +
               "\nCámaras: " + cameras;
    }
}
