package BananaStore.model;

/**
 * Clase que representa una Laptop en Banana Store.
 * Hereda de Product e incluye atributos específicos como tamaño de pantalla, procesador, RAM y almacenamiento.
 */
public class Laptop extends Product {
    private double screenSize; // Tamaño de pantalla en pulgadas
    private String processor;  // Procesador de la laptop
    private int ram;           // Memoria RAM en GB
    private int storage;       // Almacenamiento en GB

    /**
     * Constructor de la clase Laptop.
     * @param brand La marca de la laptop.
     * @param model El modelo de la laptop.
     * @param price El precio de la laptop.
     * @param screenSize El tamaño de la pantalla en pulgadas.
     * @param processor El procesador.
     * @param ram La memoria RAM en GB.
     * @param storage El almacenamiento en GB.
     */
    public Laptop(String brand, String model, double price, double screenSize, String processor, int ram, int storage) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Getters y setters

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * Devuelve la descripción completa de la Laptop.
     * @return Una cadena con la descripción del producto.
     */
    @Override
    public String getDescription() {
        return "Laptop: " + brand + " " + model +
               "\nPrecio: $" + getFormattedPrice() +
               "\nPantalla: " + screenSize + " pulgadas" +
               "\nProcesador: " + processor +
               "\nRAM: " + ram + " GB" +
               "\nAlmacenamiento: " + storage + " GB";
    }
}
