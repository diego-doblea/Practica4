package BananaStore.builder;

import BananaStore.model.Tablet;

/**
 * Builder concreto para la construcción de objetos Tablet.
 */
public class TabletBuilder implements ProductBuilder {
    private String brand;
    private String model;
    private double price;
    private double screenSize;
    private boolean stylusCompatibility;
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
     * Establece el tamaño de pantalla de la Tablet.
     * @param screenSize Tamaño de pantalla en pulgadas.
     */
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    /**
     * Define si la Tablet es compatible con lápiz táctil.
     * @param stylusCompatibility Verdadero si es compatible, falso en caso contrario.
     */
    public void setStylusCompatibility(boolean stylusCompatibility) {
        this.stylusCompatibility = stylusCompatibility;
    }
    
    /**
     * Establece la cantidad de cámaras de la Tablet.
     * @param cameras Número de cámaras.
     */
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    @Override
    public Tablet build() {
        return new Tablet(brand, model, price, screenSize, stylusCompatibility, cameras);
    }
}
