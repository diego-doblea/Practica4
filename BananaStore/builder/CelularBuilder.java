package BananaStore.builder;

import BananaStore.model.Celular;

/**
 * Builder concreto para la construcción de objetos Celular.
 */
public class CelularBuilder implements ProductBuilder {
    private String brand;
    private String model;
    private double price;
    private double screenSize;
    private int batteryCapacity;
    private int cameras;

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
     * Establece el tamaño de pantalla del Celular.
     * @param screenSize Tamaño de pantalla en pulgadas.
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    /**
     * Establece la capacidad de la batería del Celular.
     * @param batteryCapacity Capacidad de batería en mAh.
     */
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    /**
     * Establece la cantidad de cámaras del Celular.
     * @param cameras Número de cámaras.
     */
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    @Override
    public Celular build() {
        return new Celular(brand, model, price, screenSize, batteryCapacity, cameras);
    }
}
