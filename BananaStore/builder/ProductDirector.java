package BananaStore.builder;

import BananaStore.model.Laptop;
import BananaStore.model.Celular;
import BananaStore.model.Tablet;

/**
 * Director que define el orden de construcción para cada tipo de producto.
 */
public class ProductDirector {

    /**
     * Construye una Laptop utilizando el builder correspondiente.
     * @param builder El builder para Laptop.
     * @param brand Marca de la Laptop.
     * @param model Modelo de la Laptop.
     * @param price Precio de la Laptop.
     * @param screenSize Tamaño de pantalla en pulgadas.
     * @param processor Procesador.
     * @param ram Memoria RAM en GB.
     * @param storage Almacenamiento en GB.
     * @return La Laptop construida.
     */
    public Laptop constructLaptop(LaptopBuilder builder, String brand, String model, double price, double screenSize, String processor, int ram, int storage) {
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setPrice(price);
        builder.setScreenSize(screenSize);
        builder.setProcessor(processor);
        builder.setRam(ram);
        builder.setStorage(storage);
        return builder.build();
    }

    /**
     * Construye un Celular utilizando el builder correspondiente.
     * @param builder El builder para Celular.
     * @param brand Marca del Celular.
     * @param model Modelo del Celular.
     * @param price Precio del Celular.
     * @param screenSize Tamaño de pantalla en pulgadas.
     * @param batteryCapacity Capacidad de la batería en mAh.
     * @param cameras Número de cámaras.
     * @return El Celular construido.
     */
    public Celular constructCelular(CelularBuilder builder, String brand, String model, double price, double screenSize, int batteryCapacity, int cameras) {
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setPrice(price);
        builder.setScreenSize(screenSize);
        builder.setBatteryCapacity(batteryCapacity);
        builder.setCameras(cameras);
        return builder.build();
    }

    /**
     * Construye una Tablet utilizando el builder correspondiente.
     * @param builder El builder para Tablet.
     * @param brand Marca de la Tablet.
     * @param model Modelo de la Tablet.
     * @param price Precio de la Tablet.
     * @param screenSize Tamaño de pantalla en pulgadas.
     * @param stylusCompatibility Compatibilidad con lápiz táctil.
     * @param cameras Número de cámaras.
     * @return La Tablet construida.
     */
    public Tablet constructTablet(TabletBuilder builder, String brand, String model, double price, double screenSize, boolean stylusCompatibility, int cameras) {
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setPrice(price);
        builder.setScreenSize(screenSize);
        builder.setStylusCompatibility(stylusCompatibility);
        builder.setCameras(cameras);
        return builder.build();
    }
}
