package BananaStore.builder;

import BananaStore.model.Laptop;

/**
 * Builder concreto para la construcción de objetos Laptop.
 */
public class LaptopBuilder implements ProductBuilder {
    private String brand;
    private String model;
    private double price;
    private double screenSize;
    private String processor;
    private int ram;
    private int storage;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Establece el tamaño de pantalla de la Laptop.
     * @param screenSize Tamaño de pantalla en pulgadas.
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    /**
     * Establece el procesador de la Laptop.
     * @param processor El procesador.
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    /**
     * Establece la memoria RAM de la Laptop.
     * @param ram La cantidad de RAM en GB.
     */
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    /**
     * Establece el almacenamiento de la Laptop.
     * @param storage La capacidad de almacenamiento en GB.
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public Laptop build() {
        return new Laptop(brand, model, price, screenSize, processor, ram, storage);
    }
}
